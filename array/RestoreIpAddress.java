package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a string s containing only digits. Return all possible valid IP addresses that can be obtained from s. You can return them in any order.

A valid IP address consists of exactly four integers, each integer is between 0 and 255, 
separated by single points and cannot have leading zeros. For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses and "0.011.255.245", 
"192.168.1.312" and "192.168@1.1" are invalid IP addresses. 

 

Example 1:

Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
Example 2:

Input: s = "0000"
Output: ["0.0.0.0"]
Example 3:

Input: s = "1111"
Output: ["1.1.1.1"]
Example 4:

Input: s = "010010"
Output: ["0.10.0.10","0.100.1.0"]
 * @author pramod
 *
 */
public class RestoreIpAddress {
	
	public static void main(String[] args) {
		List<String> ss=new ArrayList<String>();
		List<List<String>> ll= new ArrayList<>();
		getIp("25525511135",ll,ss,0,0);
		
		System.out.println("pending clean up -"+Arrays.toString(ll.toArray()));
	}
	
	private static void getIp(String input,List<List<String>> fl,List<String> list, int stpos, int iterations) {
		if(stpos>input.length()) return;
		if(iterations<=4&&input.length()-stpos<1) {
			fl.add(new ArrayList<>(list));
			//System.out.println(Arrays.toString(list.toArray()));
			return;
		}
		
		 for(int i=1;i<4;i++) {
	      String ss=input.substring(stpos, Math.min(input.length(),stpos+i));	
	      list.add(ss);
		  getIp(input,fl,list,stpos+i,iterations+1);
		  list.remove(list.size()-1);
		 }
	}

}
