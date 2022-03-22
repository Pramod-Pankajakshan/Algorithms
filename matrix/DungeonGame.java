package matrix;

public class DungeonGame {
	static int xmax=2;
	static int ymax=2;
public static void main(String arg[]){
	int h[][]= new int[3][3];
	h[0][0]=-2 ;h[0][1]=-3 ;h[0][2]=3;
	h[1][0]=-5;h[1][1]=-10;h[1][2]=1;
	h[2][0]=10;h[2][1]=30;h[2][2]=-5;
	getEnergyOfPrince(h,0,0,0);
	System.out.println(0-minen+1);
}
static int  minen=Integer.MIN_VALUE;
static void calc(int i) {
	
	if(i<0) {	
		if(i>minen) {
			minen=i;
		}		
	}
		
		
}

public static void getEnergyOfPrince(int[][] in,int en, int x,int y) {
	// check >
	if(x>xmax||y>ymax) return;
	
	
	en=en+in[x][y];
	
	if(x==xmax&&y==ymax) {
		calc(en);
		return;
	}
	
	for(int i=0;i<=1;i++) {
		if(i==0) {
			x++;
			getEnergyOfPrince(in,en,x,y);
			x--;
		}else {
			y++;	
			getEnergyOfPrince(in,en,x,y);
			y--;
		}
		
	}
	
}



}



