package base;
/**
 * The smallest component in a natrix or game
 * @author Pramod
 *
 */
public class Block<T> {
	
	public T t;
	/**
	 *  00 01 02 03 
	 *  10 11 12 13 
	 *  20 21 22 23
	 *  30 31 32 33
	 *  40 41 42 43
	 */
	public int x;
	public  int y;

	public boolean equals(Block<T> b){		
	return this.x==b.x&&this.y==b.y;
	}
	
	
	
	public boolean isNeighbor(Block<T> in){	
		if(Math.abs(this.x-in.x)>1||Math.abs(this.y-in.y)>1){//Math.abs
			return false;
		}else{		
			return true;
		}	
	}
	
	public boolean isInLine(Block<T> in){
		int a=this.x-in.x;
		int b=this.y-in.y;		
		if(a==0||b==0) return true;		
		return false;
	}
	

	
	
	
	
}
