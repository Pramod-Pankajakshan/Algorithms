package permutandcombi;

import java.util.*;

/**
 *In-Flight Media: You are a in-flight movie service provider. 
 *You are given a list of movie lengths and the duration of the flight. Passengers watch exactly 2 movies, 
 *and no movie is returned twice. Return a pair of (2) movie Id's that finish exactly 30 minutes before the plane lands.
 * If multiple such combinations are possible, 
 *return the pair which has the movie of longest duration. If no such pair is possible, return <-1,-1>.
 * @author pramod
 *
 */

public class FlightMovieCombo {

	public static void main(String args[]) {
      List<Integer> ls = new ArrayList<Integer>();
      ls.add(80);ls.add(60);ls.add(50);ls.add(20);ls.add(10);ls.add(12);ls.add(30);ls.add(90);
      combo2(100,ls);
    }

	// since its 2 movie - START FROM LEFT AND RIGHT
	private static List<Integer> combo2(int fd, List<Integer> md){
		PriorityQueue<Integer[]> pq= new PriorityQueue<>((a,b)-> b[1]-a[1]);	
		Collections.sort(md);
		int[][] r= new int[md.size()][md.size()]; int j=md.size()-1;
		for(int i=0;i<md.size();i++) {
		
			if(md.get(i)+md.get(j)==fd) {
				pq.add(new Integer[] {md.get(i),md.get(j)});
			}else if(md.get(i)+md.get(j)>fd) {
				j--;
			}else {
				i++;
			}
		}
		for(Integer[] in:pq) {
			System.out.println(in[0]+"-"+in[1]);
		}	
		return null;
    }
	    
	
	
	private static List<Integer> combo(int fd, List<Integer> md){
	PriorityQueue<Integer[]> pq= new PriorityQueue<>((a,b)-> a[0]-b[0]);	
	
	Collections.sort(md);
	int[][] r= new int[md.size()][md.size()];
	for(int i=0;i<md.size();i++) {
		for(int j=0;j<md.size();j++) {
			if(md.get(i)+md.get(md.size()-1-j)<=fd) {
				//System.out.println(md.get(i)+"-"+md.get(md.size()-1-j));
				// found the one with biggest duration	
				pq.add(new Integer[] {md.get(i),md.get(md.size()-1-j)});
				break;
			}
		}
	}
	for(Integer[] in:pq) {
		System.out.println(in[0]+"-"+in[1]);
	}
	return null;
	}
    
}

