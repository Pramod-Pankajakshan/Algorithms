package leetcode;

import java.util.*;

public class FactorCombinations {
public static void main(String arg[]){
	FactorCombinations fc= new FactorCombinations();
	List<List<Integer>> ll=fc.getFactors(18);
	ll.forEach(l->System.out.println(l.toString()));

}

public List<List<Integer>> getFactors(int n) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    helper(result, new ArrayList<Integer>(), n, 2);
    return result;
}

public void helper(List<List<Integer>> result, List<Integer> item, int n, int start){
    if (n <= 1) {
        if (item.size() > 1) {
            result.add(new ArrayList<Integer>(item));
        }
        return;
    }
    
    for (int i = start; i <= n; ++i) {
        if (n % i == 0) {
            item.add(i);
            helper(result, item, n/i, i);// 18 - 18/2 - 9/3 like that
            item.remove(item.size()-1);// pass n/i - keep starting as 2
        }
    }
}
}



