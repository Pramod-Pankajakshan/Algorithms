package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Anagrams {
	static HashMap<String, ArrayList<String>> hm= new HashMap<String, ArrayList<String>>();
public static void main(String[] args) {
	String h="asd";String h1="dsa";String h2="aaa";
	dictionaryOfAnagrams(h.toCharArray());
	dictionaryOfAnagrams(h1.toCharArray());
	dictionaryOfAnagrams(h2.toCharArray());
	LinkedHashMap<Integer, Integer> lm= new LinkedHashMap<Integer, Integer>();
	lm.put(1,2);
	String a="cow"; String b="wooc";
	Anagrams an= new Anagrams();
an.check(a,b);
}

void check(String a,String b){
	char[] ina= a.toCharArray();
	char[] inb= b.toCharArray();
	
	int[] cc=new int[256]; // key
	
	if(a.length()!=b.length()) {System.out.println("sorrty");return;}
	for(int i=0;i<ina.length;i++){
		cc[ina[i]]=cc[ina[i]]+1;
	}
	for(int i=0;i<inb.length;i++){
		if(cc[inb[i]]==0){
			System.out.println("sorry");return;
		}else{
			cc[inb[i]]=cc[inb[i]]-1;
		}
	}
System.out.println("ok");	
}


public static void dictionaryOfAnagrams(char[] ina){
	int[] intarr=new int[256];
	for(int i=0;i<ina.length;i++){
		intarr[ina[i]]=intarr[ina[i]]+1;
	}	
	StringBuilder sb= new StringBuilder();
	for(int i=0;i<intarr.length;i++){
		sb.append(intarr[i]);
	}
	
	String key=sb.toString();
	if(hm.get(key)!=null){
		ArrayList<String> al2=	hm.get(key);
		al2.add(new String(ina));
		hm.put(key,al2);
	}else{
		ArrayList<String> al=new ArrayList<String>();
		al.add(new String(ina));
		hm.put(key,al);
	}
}

}
