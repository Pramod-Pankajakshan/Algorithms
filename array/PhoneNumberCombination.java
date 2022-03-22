package array;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class PhoneNumberCombination {

	public static void main(String[] args) {
		PhoneNumberCombination p= new PhoneNumberCombination();
		//List<String> ll=		p.letterCombinations("234");
		//for(String s:ll) {
     	// System.out.println(s);
		//}
    p.letterCombinations2();
         
    
	}
	//0 and 1 omitted
  //  	private static  String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    	public  List<String> letterCombinations(String digits) {
    		List<String> ret= new LinkedList<String>();
    		combination("", digits, 0, ret);
    		System.out.println("--"+ret.size());
    		
    		
    		
    		return ret;
    	}
    
    	private void combination(String prefix, String inputDigits, int offset, List<String> returnList) {
    		if (offset >= inputDigits.length()) {
    			returnList.add(prefix);
    			return;
    		}
    		String letters = KEYS[(inputDigits.charAt(offset) - '0')];// 128-126
  
    		for (int i = 0; i < letters.length(); i++) {
    			combination(prefix + letters.charAt(i), inputDigits, offset + 1, returnList);
    		}
    	}
    	
    	private static  String[] KEYS = { ""
    			+ "", "", "abc", "def", "ghi",
    			"jkl", "mno", "pqrs", "tuv",
    			"wxyz" };
    	 
    // i did it myself
    	public  void letterCombinations2() {
    		List<List<Character>> returnList = new ArrayList<>();
    		List<Character> tempList= new ArrayList<>();
    		int [] in= {2,3};
   		combination2(in,0,returnList,tempList);
   		System.out.println("--");
   	}
    	// so same final list, templit
    	// input numbers and position
    	// for each call invoke a number
    	// com[for 2] for it call com[for 3]
    	// and the edge case
    	private void combination2(int[] numbers,int pos,List<List<Character>> returnList,	List<Character> tempList) {
    		
    	
    		if(pos>numbers.length-1) {
    			returnList.add(new ArrayList<>(tempList));    			
    			return;
    		}
    		String val=KEYS[numbers[pos]];// take each number get its values
    		char[] ch= val.toCharArray();
    		
    		for(int i=0;i<ch.length;i++) {    			
    			tempList.add(ch[i]);
    			combination2(numbers,pos+1,returnList,tempList);
    			tempList.remove(tempList.size()-1);
    		}
    		
    		
    		
    	}
    
	
	
}
