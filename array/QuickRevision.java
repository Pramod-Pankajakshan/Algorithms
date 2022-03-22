package array;

import java.util.HashMap;

public class QuickRevision {
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,0};
		QuickRevision q= new QuickRevision();
		//q.sumCheck(a, 5);
		//q.rotate(a);
		q.checkContains("abcd", "abcs");
	}
	
	
	
	
	public void sumCheck(int as[],int sum){
	    HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();	    
		for(int i=0;i<as.length;i++){			
			if(hm.get(as[i])!=null){
			 	System.out.println(as[i]);
			 	System.out.println(sum-as[i]);
			}else{
				hm.put(sum-as[i], 1);
			}			
		}	
	}

	public void rotate(int as[]){
		 int temp=as[as.length-1];
		for(int i=as.length-1;i>=0;i--){
			if(i==0){as[0]=temp;break;}
			as[i]=as[i-1];			
		}
		
	}
	
	// 1 4 7   and 2 6 8
	public void merge(int []a,int[]b){
		int mer[]=new int[a.length+b.length];
		int ac=0; int bc=0; int mc=0;
		
		while(ac<a.length&&bc<b.length){
			if(a[ac]<b[bc]){
				mer[mc++]=a[ac++];					
			}else{
				
			}
		}
		
		
	}
	
	
	public void checkContains(String big,String small){
		char[] biga= big.toCharArray();char[] smal= small.toCharArray();
		int [] ia=new int[256];
		for(int i=0;i<biga.length;i++){
			ia[biga[i]]=1;
		}
		
		
		for(int i=0;i<smal.length;i++){
			if(ia[smal[i]]==0){
				System.out.println("no");return;
			}
		}
		System.out.println("yes");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
