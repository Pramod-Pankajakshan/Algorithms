package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/task-scheduler/description/
public class TaskScheduler {
public static void main(String arg[]){
char [] b= {'A','A','A','B','B','A','A','C'};
	System.out.println(leastInterval(b,2));
	System.out.println(leastInterval2(b,2));
	System.out.println(leastInterval3(b,2));

}

public static int leastInterval(char[] tasks, int n) {
    int[] map = new int[26];
    for (char c: tasks)
        map[c - 'A']++;
    Arrays.sort(map); 
    System.out.println(Arrays.toString(map));
    int time = 0;
    while (map[25] > 0) {
        int i = 0;
        while (i <= n) {
            if (map[25] == 0) break;               
            if (i < 26 && map[25 - i] > 0)map[25 - i]--;
            time++;
            i++;
        }
        Arrays.sort(map);
    }
    return time;
}


public static int leastInterval2(char[] tasks, int n) {
    // frequencies of the tasks
    int[] frequencies = new int[26];
    for (int t : tasks) {
        frequencies[t - 'A']++;
    }

    Arrays.sort(frequencies);

    // max frequency
    int f_max = frequencies[25];
    int idle_time = (f_max - 1) * n;
    
    for (int i = frequencies.length - 2; i >= 0 ; i--) {
        idle_time -= frequencies[i]; 
    }
    idle_time = Math.max(0, idle_time);

    return idle_time + tasks.length;
}

public static int leastInterval3(char[] tasks, int n) {
    // frequencies of the tasks
    int[] frequencies = new int[26];
    for (int t : tasks) {
        frequencies[t - 'A']++;
    }

    Arrays.sort(frequencies);

    // max frequency
    int f_max = frequencies[25];
    int idle_time = (f_max - 1) * n;
    
     int rem=tasks.length-f_max;
     return  idle_time-rem>0?f_max+idle_time:f_max+rem;
}
}




