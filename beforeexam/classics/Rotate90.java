package matrix;

public class Rotate90 {
	
	public static void main(String[] args) {
		int h[][]= new int[4][4];
		h[0][0]=0;h[0][1]=1;h[0][2]=2;h[0][3]=03;
		h[1][0]=10;h[1][1]=11;h[1][2]=12;h[1][3]=13;
		h[2][0]=20;h[2][1]=21;h[2][2]=22;h[2][3]=23;
		h[3][0]=30;h[3][1]=31;h[3][2]=32;h[3][3]=33;
		int s=4;
		print(h,s,s);
		transpose(h,s,s);// MEANS I J IS MOVED TO J I
		print(h,s,s);
		swapr(h,s,s);
		print(h,s,s);
	}
	// means to swap i with j
	// use a temp
	// and swap ij with ji
	public static void transpose(int [][]k,int r,int c){
	
		for(int i=0;i<r;i++){			
			for(int j=i+1;j<c;j++){	//NOTE:j=i+1	
			 int temp=k[i][j];
			 k[i][j]=k[j][i];
			 k[j][i]=temp;
			}
		}		
	}
	//swap left
	public static void swapl(int [][]k,int r,int c){		
		for(int i=0;i<r;i++){			
			for(int j=0;j<c;j++){	
			 int temp=k[i][j];
			 k[i][j]=k[r-i][j];
			 k[r-i][j]=temp;
			}
		}		
	}
	//swap right
	public static void swapr(int [][]k,int r,int c){	
		int t=c;
		for(int i=0;i<t;i++){		
			for(int j=0;j<(t/2);j++){			
				int te=k[i][j]; 
				k[i][j]=k[i][c-1-j];
				k[i][c-1-j]=te;
			}				
		}
	}
	
	

	public static void print(int [][]k,int r,int c){
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<r;i++){
			sb.append("\n");
			for(int j=0;j<c;j++){					
				sb.append(k[i][j]);sb.append("       ");
			}			
		}
		System.out.println(sb.toString());		
	}
	
}
  
 