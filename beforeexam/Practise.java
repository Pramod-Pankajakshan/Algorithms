package beforeexam;


import java.util.*;

public class Practise {

	// hashmap
	// ll al
	//linkedhashmap
	//priority queue
	// STACK
	// QUEUE
	
	public static void main(String[] args) {
		
		
		Set<Integer> visited = new HashSet<>();
		
		PriorityQueue<String> collnreverse= new PriorityQueue<>(Collections.reverseOrder());
		
		PriorityQueue<String> pqq= new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {				
				return o2.compareTo(o1);
			}
		});
		pqq.add("zabcd");pqq.add
		
		
		
		
		
		
		("babcd");pqq.add("bbcd");
		System.out.println(pqq.peek());
		 List<String> list= new ArrayList<>();
		 list.add("d");
		// list.set(1,"");
		
		
		 List<int[][]> lst= new ArrayList<>();
		 lst.add(new int[][] {{1,2}});
		
		 int k[]={1,2,3,4};
		 Integer[] input = Arrays.stream(k).boxed().toArray(Integer[]::new);
		 
		 Arrays.sort(input, (a, b) -> b - a); 
		 
		 // 2 d arrays
		 int [][]l=new int[][] {{1,2}};
		 Arrays.sort(l, ( o1,  o2) -> o2[0] - o1[0]);
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("");
		ls.removeFirst();
		Queue<String> q= new LinkedList<>();
		HashMap<String,String> hm= new HashMap<String,String>();
		hm.put("", "");
		hm.get("--");
		HashMap<Integer, String> hmm= new HashMap<>();
		hmm.get("ok");
		hmm.put(1, "0000");
		Queue<String> sq= new LinkedList<>();
//		HashMap<String,String> hm= new HashMap<String, String>();
//		hm.put("", "");
//		hm.put("w", "");
//	
//		hm.get("k");
		
		//PriorityQueue<Integer> pq= new PriorityQueue<>();
		//pq.add(11);pq.add(21);pq.add(1);pq.add(12);pq.add(2);pq.add(5);
		//System.out.println(pq.peek());
		
		PriorityQueue<Integer> pq= new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
		});
		pq.add(11);pq.add(21);pq.add(1);pq.add(12);pq.add(2);pq.add(5);
		System.out.println("----------"+pq.peek());
//		String h=reverse("pramodp");
//		System.out.println(h);
//		
//		Stack<String> st= new Stack<>();
//		st.push("s");
//		st.pop();
//		PriorityQueue<String> pq= new PriorityQueue<>();
//		HashMap<Integer,Character> hm1= new HashMap<>();
//		Set<Integer> keys=hm1.keySet();
//		for(int key:keys) {
//			System.out.println(hm1.get(key));
//		}
//		
	}
	
	
	private static String reverse(String s) {//abcd
		char d[]= s.toCharArray();
		for(int i=0;i<d.length/2;i++) {
			char temp=d[i];
			d[i]=d[d.length-1-i];
			d[d.length-1-i]=temp;
		}
		return new String(d);
	}
	
	private void pqString() {
		
	}
	
}
