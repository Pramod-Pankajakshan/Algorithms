package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ReverseTheVowels {
	
	public static void main(String[] args) {
		ReverseTheVowels c= new ReverseTheVowels();
		char[] k= "addddebbb".toCharArray();
		c.reverse(k);
	}

	
	
	void reverse(char[] st){
		HashMap<Character,String> hm= new HashMap<Character,String>();
		hm.put('a',"");
		hm.put('e',"");
		hm.put('i',"");
		hm.put('o',"");
		hm.put('u',"");
		int i=0; int j=st.length-1;
		
		for(char ch: hm.keySet()) {
			System.out.println(ch);
		}
		
		while(true) {
				
			while(!(hm.get(st[i])!=null)) {
				
				i++;
			}
			
			while(!(hm.get(st[j])!=null)) {
				j--;
			}
			
			if(j<i) {
			
				break;
			}
			swap(st,i,j);
			i++;
			j--;
			
		}
		
		System.out.println(Arrays.toString(st));
		
	}
	
	void swap(char[] c, int i, int j) {
		System.out.println(i +"swapped" +j);
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
	}
	
}
