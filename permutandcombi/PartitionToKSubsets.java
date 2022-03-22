package permutandcombi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartitionToKSubsets {
public static void main(String arg[]){

	int d[]= {1,2,4,5,6,7,8,9};
	boolean ans=canPartitionKSubsets(d,3);
	System.out.println(ans);
}
// print this to get the list
static HashMap<Integer, List<Integer>> hm= new HashMap<>();

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) return false;
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % k != 0 || sum < k) return false;
        sum = sum / k;
        System.out.println("Sum is "+sum);
        return possible(nums, sum, new int[k], 0);
    }
    // use a temp array 
   static  boolean possible(int[] nums, int sum, int[] temp, int idx) {// idx to try each index value
       
        if (idx ==nums.length) {
              for (int s : temp) if (s != sum) return false;
            return true;
        }
        // take each number
        int num = nums[idx];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] + num <= sum) {  // add 9 -> now add 8 to 9 no-> now add 8 to next -> now add 7 to 9 and 8 no no -> so 
                temp[i] = temp[i]+num;
                if (possible(nums, sum, temp, idx + 1)) return true;
                temp[i] -= num;
               
            }
        }
        return false;
    }  
   
   // index is i
   // add or remove
   static void addOrRemove(int index, int value,boolean aor) {
	   if(!aor) {
		   ArrayList<Integer> al =  (ArrayList<Integer>) hm.get(index);
		   al.remove(al.indexOf(value));
		   return;
	   }
	   if(hm.get(index)!=null) {
		   ArrayList<Integer> al =  (ArrayList<Integer>) hm.get(index);
		   al.add(value);
		   hm.put(index,al);
	   }else {
		   ArrayList<Integer> al = new ArrayList<>();
		   al.add(value);
		   hm.put(index,al);
	   }
   }
}




