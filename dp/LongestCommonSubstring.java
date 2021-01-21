package dynamic;
//https://www.youtube.com/watch?v=BysNXJHzCEs
public class LongestCommonSubstring {

	public static void main(String[] args) {
		String one="pramod";
		String two="pramopdAnviDeepthy";
		commonSubString(one.toCharArray(),two.toCharArray());
		
	}
	//String one="pramod";	String two="pramopdAnviDeepthy";=5
	static void commonSubString(char one[],char to[]){
		int matrix [][]= new int[one.length+1][to.length+1];
		int result=0;
		for(int i=1;i<=one.length;i++){
			for(int j=1;j<=to.length;j++){				
				if(one[i-1]==to[j-1]){
					matrix[i][j]=matrix[i-1][j-1]+1;
					result=Math.max(result,matrix[i][j]);
				}
			}
		}	
		
		System.out.println(result);
	}
	
	
}
