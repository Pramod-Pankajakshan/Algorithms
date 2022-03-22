package array;

public class RotateArray {

	
	public static void main(String[] args) {
	int g[][]=new int[3][3];
	g[0][0]=0;g[0][1]=1;g[0][2]=2;
	g[1][0]=10;g[1][1]=11;g[1][2]=12;
	g[2][0]=20;g[2][1]=21;g[2][2]=22;
	rotate(g,3,3);
	}
	
	public static void rotate(int r[][],int n,int m){
		int k=0;
		while(k<m){
			StringBuilder s= new StringBuilder();
			for(int i=n-1;i>=0;i--){
				s.append(r[i][k]);
				s.append(",");
			}
			System.out.println(s.toString());
			k++;
		}
		
		
	}
	
}
