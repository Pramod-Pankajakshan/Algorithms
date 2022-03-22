package array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContiniousSumMultiple {

	public static void main(String[] args) {
		int[] h=  {1,14,3,1,8};check(h,13);
		System.out.println(checkSubarraySum(h,13));
	}
	
	static int g=0;
	static void check(int[] arr, int s) {
	    int h=0; int sm=0;
		while(h<arr.length) {
			sm=0;
			for(int i=h;i<arr.length;i++) {
				sm=sm+arr[i];
				if(sm%s==0) g++;
			}
			h++;
		}
		
		System.out.println(g);
	}
	// ContiniousSumMultiple 
	//add to sum aka remainder
	//divide get remainder
	// if map contains remainder and position of that value is > 1
	//else push to map 
	public static boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map < Integer, Integer > map = new HashMap < > ();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            sum = sum % k;
            if (map.containsKey(sum)) {
                 if (i - map.get(sum) > 1)
                    return true;
            } else
                map.put(sum, i);
            System.out.println(convertWithStream(map));
            }
      
        return false;
    }
	
	public static String convertWithStream(Map<Integer, ?> map) {
	    String mapAsString = map.keySet().stream()
	      .map(key -> key + "=" + map.get(key))
	      .collect(Collectors.joining(", ", "{", "}"));
	    return mapAsString;
	}
	
}
