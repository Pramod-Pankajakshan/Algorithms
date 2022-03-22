package tree;

public class BSTArray {
	
	public static void main(String[] args) {
		
		int []ds={1,1,2,3,3,4,4};
		BSTArray d= new BSTArray();
		d.find(ds,0,ds.length);
	}

	
	void find(int g[],int start,int end){
		System.out.println(end);
		 if (start > end)
		       return;		 
		  if (start==end)
		    {
		        System.out.println("The required element is %"+ g[start]);
		        return;
		
		    
		    }
	int mid=(start+end)/2;	
		
	if(mid%2==0){
		if (g[mid] == g[mid+1])
			find(g, mid+2, end);
        else
        	find(g, start, mid);
		
	}else{
		if (g[mid] == g[mid-1])
			find(g, mid-2, end);
        else
        	find(g, start, mid-1);
	}
	
	}
}
