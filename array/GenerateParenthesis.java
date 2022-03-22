package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

	For example, given n = 3, a solution set is:
	
	[
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"
	]
 * @author pramod
 *The idea here is to only add '(' and ')' that we know will guarantee us a solution (instead of adding 1 too many close). Once we add a '(' we will then discard it and try a ')' which can only close a valid '('. Each of these steps are recursively called.
 */

public class GenerateParenthesis {

public static void main(String[] args) {

	GenerateParenthesis gp= new GenerateParenthesis();
	List<String> ls=gp.generateParenthesis(4);
	for(String s: ls) {
		System.out.println(s);
	}
	//boolean b=gp.isPalindrome(23332);
	//System.out.println(b);
	
}

public boolean isPalindrome(int x) {
    if (x<0 || (x!=0 && x%10==0)) return false;
    int rev = 0;
    while (x>rev){
    	rev = rev*10 + x%10;
    	x = x/10;
    }
    System.out.println(rev);
    return (x==rev || x==rev/10);
}



public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> resultList, String str, int open, int close, int maxby2){
        System.out.println("open is - "+open+"close "+close+"-----"+str);
        if(str.length() == maxby2*2){
            resultList.add(str);
            System.out.println(resultList.size());
            return;
        }
        // both are if not else if
        if(open < maxby2)
            backtrack(resultList, str+"(", open+1, close, maxby2);
        if(close < open)
            backtrack(resultList, str+")", open, close+1, maxby2);
    }

    
    
    
    
    

}
