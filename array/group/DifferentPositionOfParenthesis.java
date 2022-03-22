package array.group;

import java.util.*;

public class DifferentPositionOfParenthesis {
	public static void main(String[] args) {
		String h="2*3+4"; // 23 4 2 34
		  List<Integer> res =diffWaysToCompute(h);
		for(int ha: res) {
			System.out.println(ha);
		}
	} 
	// spliy it - add it - then merger it
	    public static  List<Integer> diffWaysToCompute(String input) {
	        List<Integer> res = new ArrayList<Integer>(); /// new list
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c == '-' || c == '+' || c == '*') {
	                String a = input.substring(0, i);//2
	                String b = input.substring(i + 1);//34
	                List<Integer> al = diffWaysToCompute(a);
	                List<Integer> bl = diffWaysToCompute(b);
	                for (int x : al) {
	                    for (int y : bl) {
	                        if (c == '-') {
	                            res.add(x - y);
	                        } else if (c == '+') {
	                            res.add(x + y);
	                        } else if (c == '*') {
	                            res.add(x * y);
	                        }
	                    }
	                }
	            }
	        }
	        if (res.size() == 0) res.add(Integer.valueOf(input));
	        return res;
	    }
	    
	    
	    
	}




