package dynamic;
//https://www.youtube.com/watch?v=BysNXJHzCEs
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		String one="AGGTAB";
		String two="GXTXAYB";
		commonSubseq(one.toCharArray(),two.toCharArray());
		
	}
	//String one="AGGTAB";	String two="GXTXAYB";
	static void commonSubseq(char one[],char to[]){
		int mat[][]= new int[one.length+1][to.length+1];
		for(int i=0;i<one.length;i++) {
			for(int j=0;j<to.length;j++) {
				if(one[i]==to[j]) {
					mat[i+1][j+1]=mat[i][j]+1;					
				}else {
					if(i==0) {						
						mat[i+1][j+1]=mat[i][j];						
					}else {						
						mat[i+1][j+1]=Math.max(mat[i][j+1], mat[i+1][j]);						
				}
				}
			}
			
		}
		
	System.out.println(mat[one.length][to.length]);
	}
	
	
}
