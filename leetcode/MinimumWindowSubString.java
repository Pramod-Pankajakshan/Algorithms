package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubString {
public static void main(String arg[]){
int hs=123;
Integer hd= new Integer(hs);
hd.toString();

String h="abfgstcabcgtyyy";
String hq=minWindow(h,"yyy");
int hq2=minWindowTemplate(h,"yyy");

System.out.println(hq);
System.out.println(hq2);
}

public static String minWindow(String s, String t) {
    String result = "";
    if(s==""||t.length()>s.length())
        return result;
    int[] charCntArr = new int[26];
    int start = 0;
    int minStart = 0;
    int end = 0;
    int count = t.length();
    int minLength = Integer.MAX_VALUE;
    for(char temp:t.toCharArray()){
        charCntArr[temp-'a']++; 
    }
    while(end<s.length()){
    	    System.out.println(s.charAt(end));
        if(charCntArr[s.charAt(end)-'a']>0)
            count--;
        charCntArr[s.charAt(end)-'a']--;
        end++;
        
        while(count==0){
			if (end - start < minLength) {
				minStart = start;
				minLength = end - start;
			}
			charCntArr[s.charAt(start)-'a']++;
			if (charCntArr[s.charAt(start)-'a'] > 0)// [-1, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0]
				count++;
			start++;
        }
    }
    return (minLength==Integer.MAX_VALUE)?"":s.substring(minStart, minStart+minLength);
}


private static int minWindowTemplate(String in,String val) {
	Map<String,String> map = new HashMap<>();
	
	char[] inch=in.toCharArray();
	char[] valch=val.toCharArray();
	Set<Character> st= new HashSet<>();
	for(char c:val.toCharArray()) {
		st.add(c);
	}
	int[] chk= new int[26];
	int c=0;int min=Integer.MAX_VALUE; int left=0;
	for(int i=0;i<inch.length;i++) {		
			chk[inch[i]-'a']=chk[inch[i]-'a']+1;
			if(st.contains(inch[i])) {
				c++;
			}
			while(c>=valch.length) {				
				if(st.contains(inch[left])) {
					 c--;
					 chk[inch[left]-'a']=0;
					 System.out.println(i+"--"+left+" c is "+c);
					 min=Math.min(i-left, min);	
				}
			 left++;
			 
			}			
	}	
	return min;	
}


}



