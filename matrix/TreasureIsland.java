package matrix;

public class TreasureIsland {
	
	public static void main(String[] args) {
		char f[][]=new char [][] {{'O', 'O', 'O', 'O'},
								  {'D', 'O', 'D', 'O'},
								  {'O', 'O', 'O', 'O'},
								  {'X', 'D', 'D', 'O'}};
								  char v[][]=new char [4][4]		;
								  check(f,0,0,0,v);
								  System.out.println(min);
											  
	}
	
	static int min=10000;
	
	private static void check(char[][] ss, int cp,int cp2, int length, char[][] v){
		
		if(cp<0||cp>ss.length-1||cp2<0||cp2>ss.length-1||ss[cp][cp2]=='D'||v[cp][cp2]==1) return;
		System.out.println(ss[cp][cp2]);
		v[cp][cp2]=1;
		if(ss[cp][cp2]=='X') {
			if (length<min) {
				min=length;
				System.out.println(min);
				return;
			}
		}

			if(ss[cp][cp2]=='O') {
				check(ss,cp+1,cp2,length+1,v);
				check(ss,cp-1,cp2,length+1,v);
				check(ss,cp,cp2+1,length+1,v);
				check(ss,cp,cp2-1,length+1,v);
			}
			
		
		
	}

	
}
