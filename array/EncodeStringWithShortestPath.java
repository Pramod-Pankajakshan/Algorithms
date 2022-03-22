package array;

public class EncodeStringWithShortestPath {
public static void main(String arg[]){
	repeatedSubstringPattern("123456123456123456");
}

    public static boolean repeatedSubstringPattern(String str) {
        // each divider of the length, check for the whole string
        if(str == null || str.length() == 0)    return false;
        int len = str.length();
        for(int i = len/2; i >= 1; i--){
            if(len % i != 0)    continue;
            int num = len/i;
            String s = str.substring(0, i);
            for(int j = 1; j < num; j++){
                String sub = str.substring(j*i, i*(j+1));
                if(!s.equals(sub))  break;
                if(j == num-1)  return true;
            }
        }
        return false;
    }
}




