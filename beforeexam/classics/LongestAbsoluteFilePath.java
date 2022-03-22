package beforeexam.classics;

import java.util.HashMap;

public class LongestAbsoluteFilePath {
public static void main(String arg[]){

	int a=lengthLongestPath("dir\n\tsubdnnnir1\n\tsubdirr2\n\t\tfile.ext");
	System.out.println(a);

}
// current level is prev level length+ current lvel
//
public static int lengthLongestPath(String input) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    hashMap.put(0, 0);
    int result = 0;
    for (String s : input.split("\n")) {
    	  System.out.println("path-"+s);
        int level = s.lastIndexOf('\t') + 1;
    	  System.out.println("level-"+level);
        int len = s.length() - level;
    	  System.out.println("length->"+len);
      	  System.out.println("------");
        if (s.contains(".")) {
            result = Math.max(result, hashMap.get(level) + len);
        } else {
       System.out.println("	-->prev level length is-"+hashMap.get(level) );
            hashMap.put(level + 1, hashMap.get(level) + len + 1);
        }
    }
    return result;
}
// So for each level we store the length and for next level we get prev and add it
// since its sorted this workd

public static  int lengthLongestPathq(String input) {
    String[] paths = input.split("\n");
    int[] stack = new int[paths.length+1];
    int maxLen = 0;
    for(String s:paths){
        int lev = s.lastIndexOf("\t")+1, curLen = stack[lev+1] = stack[lev]+s.length()-lev+1;
        if(s.contains(".")) maxLen = Math.max(maxLen, curLen-1);
    }
    return maxLen;
}
}



