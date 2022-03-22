package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchSuggestionAutoFill {
	
	public static void main(String[] args) {
		SearchSuggestionAutoFill d= new SearchSuggestionAutoFill();
		List<String> dd= new ArrayList<>();
		dd.add("apple");dd.add("animal");dd.add("axe");dd.add("appan");
		d.load(dd);
		System.out.println("--------------");
		String []kl=d.search("an");
		
		System.out.println(Arrays.toString(kl));
		
	}
	Map<String, List<String>> hm= new HashMap<String, List<String>>();
	
    void load(List<String> lin) {
    	
    		for(String in:lin) {
		    	for(int i=1;i<in.length();i++) {
		    		String ss=in.substring(0, i);
		    		System.out.println(ss);
		    		if(hm.get(ss)!=null) {
		    			List<String> ls=hm.get(ss);
		    			ls.add(in);
		    			hm.put(ss,ls);
		    		}else {
		    			List<String> ll= new ArrayList<>();
		    			ll.add(in);
		    			hm.put(ss,ll);
		    		}
		    	
		    }
    }
    		}
    
    
    
    String[] search(String sr) {
    	System.out.println(hm.get(sr).size());
    	String [] stt= new String[hm.get(sr).size()];
    
    	return hm.get(sr).toArray(stt);
    }
    
    
    
}
