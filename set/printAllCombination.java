package set;
/**
 * 1<<3=8 or icc38
 * @author Pramod
 *
 */
public class printAllCombination {
	int h[]={1,2,3,4,5,6};
	public static void main(String[] args) {
		printAllCombination n=new printAllCombination();
		
		n.printAllBits(1<<(n.h.length));
	}
	
	public void printAllBits(int range){
		int c=range;
		System.out.println(range);
		for(int i=0;i<c;i++){
			StringBuilder dfd= new StringBuilder();		
			//System.out.println(d);
			String bits=Integer.toString(i,2);
			bits=setBits(bits,h.length );
			System.out.println("b="+bits);
			for(int j=0;j<bits.length();j++){
				if(bits.charAt(j)=='1')
					dfd.append(h[j]);
			}
			System.out.println(dfd.toString());
		}
		
	}
	
	public String setBits(String hq,int j){
		StringBuilder d= new StringBuilder();		
			for(int i=hq.length();i<j;i++){
			d.append(0);
			}
			d.append(hq);
				return d.toString();
	}
	
	
}
