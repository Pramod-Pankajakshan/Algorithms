package srch;

public class InfiniteArray {


public static void main(String[] args) {
	int h[]={0,1,2,3,4,5,6,7,8,9,10,12,13,14,16,18,22,26,34,56,64,68,76,77,89,90};
	InfiniteArray a=new InfiniteArray();
	int position=ranger(h,64);
	System.out.println(position);
}


		public static int ranger(int h[],int k){
			int c=0; int bc=1;
			while(bc<h.length-1&&k>h[bc]){
				c=bc;
				bc=bc*2;				
			}	
		return	search(k,h,c,bc);
			
		}
		
		
		static int search(int k,int h[],int st,int en){
			int low=st;
			int high=en; 
			while(low<=high){//missed =	
				int mid=(low+high)/2;
				
				if(k>h[mid]){low=mid+1;}//missed low=mid+1
				else if(k<h[mid]){high=mid-1;}//missed high=mid-1
				else return mid;
			}
			
		return -1;
		}
}
