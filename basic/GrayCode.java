package leetcode;

import java.util.LinkedList;
import java.util.List;

//XOR do an XOR of i and i>>1
public class GrayCode {
public static void main(String arg[]){
    
    System.out.println(1<<3);
	grayCode(3);

}

public static List<Integer> grayCode(int n) {
    List<Integer> result = new LinkedList<>();
    for (int i = 0; i < 1<<n; i++) {
    	System.out.println(i +" and shift is "+(i>>1)+"----"+(i ^ i>>1));
    	result.add(i ^ i>>1);
    }
    return result;
}


}



