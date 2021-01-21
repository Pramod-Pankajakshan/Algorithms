package leetcode;

import java.util.*;

public class TopKFreqWords {
 public static void main(String[] args) {
	String[] kf= {"i", "love", "leetcode", "i", "love", "coding"};
	int k = 2;
	topKFrequent(kf,k);
}
	
	 public static List<String> topKFrequent(String[] words, int k) {
	        // map
	        // push to map
	        // push to pq - comp by value b-a
	        Map<String,Integer> hm = new HashMap<>();
	        
	        for(String w:words){
	            hm.put(w,hm.getOrDefault(w,0)+1);
	        }
	          PriorityQueue<KeyVal> pq= new PriorityQueue<>(k,new Comparator<KeyVal>(){
	        	  
	            public int compare(KeyVal k1, KeyVal k2){
	            
	                if(k2.size>k1.size) return 1;
	                else if(k2.size<k1.size) return -1;
	                else{
	                    String v1=k1.val;
	                    String v2=k2.val;                 
	                    return v1.compareTo(v2);                  
	                }
	            }

				
	        });
	        TopKFreqWords ts= new TopKFreqWords();
	        for(String ks: hm.keySet()){
	            KeyVal kv=  ts.new KeyVal();
	            kv.size=hm.get(ks);
	            kv.val=ks;
	            pq.add(kv);
	        }
	        List<String> ls= new ArrayList<>();
	      
	      while(pq.peek()!=null&&k>0){
	        ls.add(pq.poll().val);  
	        System.out.println(ls.get(ls.size()-1));
	      k--;
	      }
	        return ls;
	    }
	    
	    
	    class KeyVal{
	        int size;
	        String val;
	    }
}
