package google;



public class Base3 {

	public static void main(String args[]) {
        int in=29; int base=26;
		//System.out.println(Integer.toString(in,base));
		StringBuilder sb=new StringBuilder();
		while(in>26) {
			
			int r=in%base;
			sb=sb.insert(0,(char)('A'+r-1));// r-1 since its one less
			in=in/base;
		}
		// less than 26 deal it separately
		sb.insert(0, (char)('A' + in-1));
	System.out.println(sb.toString());
	main1();
	}
	
	
	// Simple base 3 calculation
	public static void main1() {
        int in=52; int base=64;
	
		System.out.println(Integer.toString(in,base));
		StringBuilder sb=new StringBuilder();
		while(in>0) {
			int r=in%base;
			sb=sb.insert(0,r);
			in=in/base;
		}
		
	System.out.println(sb.toString());

	}

	/// BA
	// 

}

