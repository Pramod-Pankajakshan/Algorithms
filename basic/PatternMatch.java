package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PatternMatch {
public static void main(String arg[]){

String in="dog cat cat dog";
String pa="abba";
System.out.println(pattern(in,pa));
}

public static boolean  pattern(String str, String pattern){
	String[] inArr=str.split(" ");
	char[] patArr=pattern.toCharArray();
	HashMap<Character, String> hm = new HashMap<>();
	HashSet<String> assigned = new HashSet<>();
	
	if(inArr.length!=patArr.length) return false;
	
	for(int i=0;i<inArr.length;i++) {
		if(hm.get(patArr[i])==null) {
			if(!assigned.contains(inArr[i])) {
				assigned.add(inArr[i]);
				hm.put(patArr[i],inArr[i] );
			}else {
				return false;
			}
		}else {
			String v=hm.get(patArr[i]);
			if(!inArr[i].equals(hm.get(patArr[i]))) {				
				return false;
			}
		}
	}
return true;
	
	
	
	
	
}
}



