package array;

import java.util.*;

public class NextClosestTime {
public static void main(String arg[]){
String h="10:12";
	System.out.println(nextClosestTime(h));

}
// convert to time series like 612 for 10 12
// then hashset of allowed numbers
// llop by incrementing 612 to 613 and convert back to digits - first / and last %
public static String nextClosestTime(String time) {
    int cur = 60 * Integer.parseInt(time.substring(0, 2));
    System.out.println(cur);
    cur += Integer.parseInt(time.substring(3));
    System.out.println(cur);
    Set<Integer> allowed = new HashSet();
    for (char c: time.toCharArray()) if (c != ':') {
        allowed.add(c - '0');
    }

    while (true) {
        cur = (cur + 1) % (24 * 60);
        int[] digits = new int[]{cur / 60 / 10, cur / 60 % 10, cur % 60 / 10, cur % 60 % 10};
        search : {
            for (int d: digits) if (!allowed.contains(d)) break search;
            return String.format("%02d:%02d", cur / 60, cur % 60);
        }
    }
}
}



