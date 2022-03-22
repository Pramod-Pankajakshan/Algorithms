package array;

public class UnionOfArrays {
	public static void main (String[] args) 
	{
		int a2[] = {1,2, 3, 4, 11,12};
		int a1[] = { 1,2,5};
		
		int h1=a1.length;
		int h2=a2.length;
		int k=0;
		if(h1>h2) k=h1-1;
		if(h1<h2) {
			int [] t= a1;
			a1=a2;
			a2=t;
			k=a1.length-1;
		}
		
		int c=0; boolean b=false;
		for(int i=0;i<=k;i++){

			if(a1[i]>a2[c]){
			
				if(c==(a2.length-1))
				{				
					System.out.println("o,"+a1[i]);	
					if(b){System.out.println("o,"+a2[c]);b=false;	}
					
				}
				if(c!=(a2.length-1)){
				System.out.println(",s,"+a2[c]);
				c=c+1;	b=true;			
				i=i-1;				
				}				
			}else if(a1[i]<a2[c]){
				System.out.println("d"+a1[i]);
				if(b){System.out.println("b,"+a2[c]); b=false;	}
			}else{
				System.out.println(","+a1[i]);
				c=c+1;
				if(c==a2.length-1){
					b=true;
				}
				if(b){System.out.println("b,"+a2[c]); b=false;	}
			}
			
			
			
		}
		
	}
}
