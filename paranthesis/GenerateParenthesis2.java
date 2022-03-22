package paranthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * set only 
 *  */

public class GenerateParenthesis2 {

public static void main(String[] args) {

	GenerateParenthesis2 gp= new GenerateParenthesis2();
	List<String> ls=gp.generateParenthesis(3);
	for(String s: ls) {
		System.out.println(s);
	}
	//boolean b=gp.isPalindrome(23332);
	//System.out.println(b);
	
}




public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> resultList, String str, int open, int close, int maxby2){
        if(str.length() == maxby2*2){
            resultList.add(str);
            return;
        }        
        if(open < maxby2)
            backtrack(resultList, str+"(", open+1, close, maxby2);
        if(close < open)
            backtrack(resultList, str+")", open, close+1, maxby2);
    }

  
}
