import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JavaCollections {
	
	public class Data{
		
		int id;
		int firstPos;
		
		
	}
	
	
	public static void main(String[] args) {
		test();
		// put data as key
	}
	
	/**
	 * 
	 */
	static void test() {
		
		Integer h[]= {1,2,3,4,5,6};
		
		Arrays.sort(h, new Comparator<Integer>() {		
			@Override
			public int compare(Integer o1, Integer o2) {
			  return (o1>o2?1:o1<o2?-1:0);
		  }

		
		});
	//	Collections.sort(list, c);
		
	}

	public int hashCode() {
		return 0;
		
	}
	
	public boolean equals(Object o) {
		return this==o;
	}
}
