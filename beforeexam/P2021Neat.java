package beforeexam;

import java.util.*;
import java.util.stream.Collectors;


public class P2021Neat {

	public static void main(String args[]) {
       List<String> ls = new ArrayList<>();ls.add("1111zzzzzz");ls.add("11115aaaaaaa");ls.add("111155");ls.add("1111555522");
       ls.stream().filter(c-> c.equals("111155")).forEach(cc-> System.out.println("----------"+cc+".........."));
       List<String> ls2= ls.stream().filter(c->c.length()>6).map(String::toUpperCase).collect(Collectors.toList());
       List<Integer> ls3 = new ArrayList<>();ls3.add(1455);
       int [] r=   ls3.stream().mapToInt(c->c).toArray();
       List<Integer> lqs3 =Arrays.stream(r).boxed().collect(Collectors.toList());
	   Arrays.stream(r).forEach(System.out::println);
	 //  Arrays.stream(r).forEach(action);
       Map<String,Integer> map= new HashMap<>();map.put("1",1);map.put("2",2);
       map.keySet().stream().forEach(c-> System.out.println(c+"->"+map.get(c)));
       //Arrays.sort(clips, (a,b) ->  a[0] - b[0]);
       
      List<String> lssss= ls.subList(0, 1);
      List<String> lsssqs= ls.subList(0, 1);
      
      char ch[]= new char[26];
      char ss[]= "q".toCharArray();
      for(char c:ss) {
    	   ch[c-'a']=(char) (((int)ch[c-'a'])+1);
      }
      int hc= new String(ch).hashCode();
      
      System.out.println("---"+hc);
      
      int i=1234;
      String ii=new Integer(i).toString();
      System.out.println(ii.toCharArray()[1]);
      
      int[] l= {2,3}; 
  	  Arrays.sort(l);
  	 // Arrays.sort(l,(int o1,int o2) -> o2-o1); - need Integer or use a custom comparator
  	  int[][] ll= {{2,3},{0,0}}; 
  	  Arrays.sort(ll,(a,b) ->a[0] - b[0]);
      
	}

	
}
