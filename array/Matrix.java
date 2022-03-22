package array;

public class Matrix {
	
	public static void main(String[] args) {
		int a[][]=new int[4][4];
		a[0][0]=1;a[0][1]=2;a[0][2]=3;a[0][3]=4;
		a[1][0]=5;a[1][1]=6;a[1][2]=7;a[1][3]=8;
		a[2][0]=9;a[2][1]=10;a[2][2]=11;a[2][3]=12;
		a[3][0]=13;a[3][1]=14;a[3][2]=15;a[3][3]=16;
		rotate(a);
		//print(a);
	}
	
	public static void rotate(int g[][]){
		for(int i=0;i<g.length;i++) {
			for(int j=0;j<g[0].length;j++) {
				
			}
		
		}
		
	}
	
	
	static void print(int g[][]){
		for(int i=0;i<g.length;i++){
			StringBuilder st= new StringBuilder();
			for(int j=0;j<g.length;j++){				
				st.append(g[i][j]);
				st.append("     ");
				
			}
			System.out.println(st.toString());
		}
	}
	
	


}
