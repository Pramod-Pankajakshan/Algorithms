import java.util.Comparator;
import java.util.PriorityQueue;

public class Euclidean {
	
	public static void main(String[] args) {
		
	}
	
	private void ecd(int [] points ) {
		// get the sqrt
		// put it into a priorityq
		PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int []a, int b[]) {
				return (a[0]*a[0]+a[1]*a[1]-b[0]*b[0]+b[1]*b[1]);				
			}
		});
		
	}

}
