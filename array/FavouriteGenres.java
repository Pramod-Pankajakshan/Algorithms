package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavouriteGenres {
	
	public static void main(String[] args) {
		
	Map<String,List<String>> userMap= new HashMap<>();
	List<String> ls= new ArrayList<String>();
	ls.add("song1");ls.add("song2");ls.add("song3");ls.add("song4");ls.add("song8");
	userMap.put("David", ls);
	List<String> lsa= new ArrayList<String>();
	lsa.add("song5");lsa.add("song6");lsa.add("song7");
	userMap.put("Emma", lsa);
	
	Map<String,List<String>> genreMap= new HashMap<>();
	
	List<String> lss= new ArrayList<String>();
	lss.add("Rock");lss.add("song1");lss.add("song3");
	genreMap.put("Rock", lss);
	
	List<String> du= new ArrayList<>();
	du.add("song7");
	List<String> tech= new ArrayList<>();
	tech.add("song2");
	tech.add("song4");

	List<String> pop= new ArrayList<>();
	pop.add("song5");
	pop.add("song6");
	genreMap.put("Pop", pop);
	genreMap.put("Dubstep", du);
	genreMap.put("Techno", tech);
	
	Map<String,List<String>> op=cat(userMap,genreMap);
	for(String k: op.keySet()) {
		for(String l:op.get(k)) {
			System.out.println(k+"-"+l);
		}
	}
	}
	
private static Map<String,List<String>> cat(Map<String,List<String>> um,Map<String,List<String>> gm){
	
	Map<String,String> songGenreMap= new HashMap<>();
	for(String k:gm.keySet()) {
		List<String> ls=	gm.get(k);
		for(String g:ls) {
			songGenreMap.put(g, k);
		}
	}
	
	Map<String,List<String>> userGenreMap= new HashMap<>();
	
	for(String name:um.keySet()) {
	    int t=0;int p=0;int r=0; int du=0; int j=0;
		List<String> songsPerName=um.get(name);
		int max=0;
		for(String song:songsPerName) {
			String gen=songGenreMap.getOrDefault(song, "");
			if(gen.equals("Rock")){
				r++;
				if(r>max) {
					max=r;
				}
			}
			if(gen.equals("Pop")){
			   p++;
			   if(p>max) {
				   max=p;
				}
			}		
			
			if(gen.equals("Techno")){
			   t++;
			   if(t>max) {
				   max=t;
				}
			}
		}
		userGenreMap.put(name, getMax(t,p,r,du,j,max))	;
		
	}
	
	return userGenreMap;
	
}
	
private static List<String> getMax(int t, int p, int r, int du, int j,int max){
	List<String> op=new ArrayList<>();
	if(t==max) {
		op.add("Techno");
	}
	if(p==max) {
		op.add("Pop");
	}
	if(du==max) {
		op.add("du");
	}
	if(j==max) {
		op.add("Jazz");
	}
	if(r==max) {
		op.add("Rock");
	}
	
	
	
	return op;
}
	
	
	
	
	

}
