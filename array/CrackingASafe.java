package array;

import java.util.*;

public class CrackingASafe {
public static void main(String arg[]){

	System.out.println(crackSafe(2,2));

}

    static Set<String> seen;
    static StringBuilder ans;

    public static String crackSafe(int n, int k) {
        if (n == 1 && k == 1) return "0";
        seen=new HashSet();
        ans=new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n-1; ++i)
            sb.append("0");
        
        String start = sb.toString();
        System.out.println(start);	
        dfs(start, k);
        ans.append(start);
        return new String(ans);
    }

    public static void dfs(String node, int k) {
        for (int x = 0; x < k; ++x) {
            String nei = node + x;
            if (!seen.contains(nei)) {
                seen.add(nei);
                dfs(nei.substring(1), k);
                ans.append(x);
            }
        }
    }
    
    
    
}




