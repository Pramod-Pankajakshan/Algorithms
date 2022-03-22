package array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

// 388. Longest Absolute File Path 
/**
 * Input: input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
   Output: 32
   Explanation: We have two files:
   "dir/subdir1/file1.ext" of length 21
   "dir/subdir2/subsubdir2/file2.ext" of length 32.
   We return 32 since it is the longest absolute path to a file.
 * @author pramod
 *
 */
public class FilePathSplit {
	
public static void main(String arg[]){
	String h = "dir\n\tsubdir112345\n\t\tfile1.ext\n\t\tsubsubdir1\n\t\t\tffffff.ext\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
	
	//String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
	System.out.println(lengthLongestPath2(h));
	System.out.println(lengthLongestPath(h));


}
// split by new line
// level is the number of tabs
// get  previous levels length and add it to this level - this line is the trick
// Since its sequential every put will overwrite previous length
public static int lengthLongestPath(String input) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    hashMap.put(0, 0);
    int result = 0;
    for (String s : input.split("\n")) {
        int level = s.lastIndexOf('\t') + 1;//  we get -1 if its not found, so add one to start from 0 for dir
     	System.out.println(s);	
     	System.out.println(level);
        int len = s.length() - level;
        if (s.contains(".")) {
            result = Math.max(result, hashMap.get(level) + len);
        } else {
            hashMap.put(level + 1, hashMap.get(level) + len + 1);
        }
    }
  //  System.out.println(result);
    return result;
}
// better go with other approach
public static int lengthLongestPath2(String input) {
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(0); // "dummy" length
    int maxLen = 0;
    for(String s:input.split("\n")){
        int lev = s.lastIndexOf("\t")+1; // number of "\t"
        while(lev+1<stack.size()) stack.pop(); // find parent
        int len = stack.peek()+s.length()-lev+1; // remove "/t", add"/"
        stack.push(len);
        // check if it is file
        if(s.contains(".")) maxLen = Math.max(maxLen, len-1); 
    }
   // System.out.println(maxLen);
    return maxLen;
}

}



