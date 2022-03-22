package corejava;

import java.util.*;
/**
 * Thereadpool
 * @author pramod
 *
 */

public class MultiThread1 {

	public static void main(String args[]) {
             
		try {
			int j=1/0;
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("1/0 is not allowed");
		}
		
		fn("");

	}

	private static void fn(String input) {
	}
}

