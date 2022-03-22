package array;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglishWords {

	public static void main(String[] args) {
		IntegerToEnglishWords in= new IntegerToEnglishWords();
	in.tens.put('2',"twenty");in.tens.put('0',"");
	in.huns.put('2',"two");in.huns.put('0',"");
	in.ones.put('2',"two");in.ones.put('0',"");
	String h=in.printSt(new StringBuilder(), "202".toCharArray(), 0);
	System.out.println(h);
	}
	Map<Character,String> tens= new HashMap<>();
	
	Map<Character,String> huns= new HashMap<>();
	Map<Character,String> ones= new HashMap<>();
	
	private String printSt(StringBuilder st, char[] in, int s) {
		if(in.length==s) return st.toString();		
		String h=null;
		if(in.length-s==3) {
			st.append(huns.get(in[s])+" hundred ");	
			h=printSt(st,in,++s);
		}else if(in.length-s==2) {
			st.append(tens.get(in[s]));		
			h=printSt(st,in,++s);
		}else if(in.length-s==1) {
			st.append(ones.get(in[s]));		
			h=printSt(st,in,++s);
		}
		return h;
		
	}
	
}
