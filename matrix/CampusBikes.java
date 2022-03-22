package matrix;

import java.util.*;


public class CampusBikes {

	public static void main(String args[]) {

	    //int [][] workers =new int[][] {{0,0},{1,1},{2,0}};
		//int [][]bikes = {{1,0},{2,2},{2,1}};
		int [][] workers =new int[][] {{0,0},{2,1}};
		int [][]bikes = {{1,2},{3,3}};
		// workers = [[0,0],[2,1]], bikes = [[1,2],[3,3]]
		
		int [] re=assignBikes(workers,bikes);
		System.out.println(Arrays.toString(re));
	}

	  public static int[] assignBikes(int[][] workers, int[][] bikes) {
		  //PriorityQueue<Mapper> pq = new PriorityQueue<Mapper>((a,b)-> a.shortestBike-b.shortestBike);
		  PriorityQueue<Worker> pq = new PriorityQueue<Worker>(new Comparator<Worker>() {
             
			@Override
			public int compare(Worker o1, Worker o2) {
				if(o1.shortestBikeDistance==o2.shortestBikeDistance) {
					return o1.id-o2.id;
				}
				return o1.shortestBikeDistance-o2.shortestBikeDistance;
			}
			  
		  });
	        for(int i=0;i<workers.length;i++) {
	           	int dist=Integer.MAX_VALUE;
	           	Worker mp = new Worker();mp.id=i;
		        	for(int j=0;j<bikes.length;j++) {
		        		// get nearest bikes for each worker
		        		int manhattanDist=Math.abs(workers[i][0]-bikes[j][0]) + Math.abs(workers[i][1]-bikes[j][1]);//Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|
		        		if(dist>manhattanDist) {
		        			dist=manhattanDist;
		        			mp.shortestBikeDistance=manhattanDist;
		        		}
		        		List<Integer> l=mp.bike.getOrDefault(manhattanDist,new ArrayList<Integer>());
		        		l.add(j);
		        		mp.bike.put(manhattanDist,l );
		        		
		        		
		        		
		        	}
		        	
		        	 pq.add(mp);
	        }
	        Set<Integer> taken=new HashSet<>();
	     
	        // its possible that 2 worker gets the same bike 
	        // so we give it to worker with smallest id 
	        int []res= new int[workers.length];
	        while(!pq.isEmpty()) {
	           Worker mp= pq.poll();	      
	          boolean found=false;
	           while(!found) {
	           List<Integer> ls=mp.bike.get(mp.bike.firstKey());
	           Collections.sort(ls);
	           for(int i:ls) {
	        	   if(!taken.contains(i)) {
	        		   res[mp.id]=i;
	        		   taken.add(i);
	        		   found=true;
	        		   break;
	        	   }
	           }
	           mp.bike.remove(mp.bike.firstKey());
	           }
	           
	        }
	        
	        
	       return res; 
	    }
}
 class Worker{
	int id;
	TreeMap<Integer,List<Integer>> bike= new TreeMap<>();
	int shortestBikeDistance;
}

