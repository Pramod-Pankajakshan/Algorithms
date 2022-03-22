package beforeexam;

import java.util.*;


public class P2021 {

	class Kv{
		public Kv(int c,String k) {
			this.c=c; this.k=k;
		}
		int c;
		String k;
	}
	
	
	public static void main(String args[]) {
		
		int [] in= new int[] {1,2};
		Integer ins[]=Arrays.stream(in).boxed().toArray(Integer[]::new);
		int [] inss=Arrays.stream(ins).mapToInt(Integer::intValue).toArray();
		
		
		
		
		
		Set<String> ss= new HashSet<>();
		ss.add(".......");
		String df="";
		//df.rep
		// Arrays.fill(dp, 1);
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer,String>() {
			         protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
			            return size() > 5;
			         }
			      };
			      lhm.put(0, "H");
			      lhm.put(1, "E");
			      lhm.put(2, "L");
			      lhm.put(3, "L");
			      lhm.put(4, "O");

			      System.out.println("" + lhm);
		
		P2021 d= new P2021();
		
		
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("1", 1);
		tm.put("2", 2);
		tm.put("3", 3);
		tm.put("4", 4);
		tm.put("5", 5);
		tm.put("6", 6);
		tm.
		
		TreeSet<Kv> s= new TreeSet<>((Kv o1, Kv o2)->o1.c-o2.c);
		s.add(d.new Kv(1,"k"));s.add(d.new Kv(2,"k1"));s.add(d.new Kv(4,"k2"));
		List<String> llp= new ArrayList<>();
		llp.sort();
		List<String> ls= Arrays.asList("3","1","44");
		String h="\t\ttiget";
		System.out.println(h.lastIndexOf('\t'));
        ls.forEach(str -> System.out.println("---"+str));      
      ls.forEach(str -> System.out.println("---"+str));
      int g=  Collections.binarySearch((List) ls, "3");
      System.out.println(g);
      Map<Integer, String> fruitMap = new HashMap<>();
      fruitMap.put(4, "Mango");
      fruitMap.put(5, "Water Melon");
      fruitMap.put(6, "Banana");
   
      fruitMap.entrySet().stream().forEach((f) -> {
    	  
        System.out.println("ID:" + f.getKey() + ", Fruit Name:" + f.getValue());
        String fd=f.getValue();
        System.out.println(fd);
   
      });
      if (fruitMap != null) {
		  fruitMap.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
      }
	}

	private static void fn(String input) throws Exception {
		for(char c: input.toCharArray()) {
			int i=(int)'a';
			System.out.println(i);
			System.out.println(((int)c));
		}
		Map<String,String> hm= new HashMap<>();
		List<String> ls = new ArrayList<>();
		ls.add("ss");
		if(ls.size()<0) throw new Exception("size matters");
		for(String s:ls) {
			if(s.equals("ss")) {
				System.out.println("ss fnd");
				
			}
		}
	}
	
	
	
	
	
}

