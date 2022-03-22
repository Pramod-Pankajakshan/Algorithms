package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Selfies {

	static int sum=85;
	static int fo=4;//firstoccur
	public static void main(String[] args) {
	int s[]={ 34,8,10,3,2,80,30,33,1};
	//diffnearzero(s);
	//sumthree(s);
	//incdecseq(s);
	maxji(s);
	}
	// 20 30 40 50 83 90 150    50
	// -80 -40 -35 19 20 25 41 82 90 150
	static void diffnearzero(int ar[]){
		int i=0; int j=ar.length-1;
		int posdiff=Integer.MAX_VALUE;
		int negdiff=Integer.MIN_VALUE;
		while(i<j){
			if(ar[i]+ar[j]>0){
				if(ar[i]+ar[j]<posdiff){
					posdiff=ar[i]+ar[j];
				}
				j=j-1;
			}else{
		    	if(ar[i]+ar[j]>negdiff){
					negdiff=ar[i]+ar[j];
			     }
		    	i=i+1;
			}
		}
		System.out.println(Math.min(posdiff, Math.abs(negdiff)));		
	}
		
	
	
   static void sumthree(int ar[]){
	HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
	
	   for(int i=0;i<ar.length;i++){		   
		   for(int j=0;j<ar.length;j++){
			 if(i!=j){
				 ArrayList<Integer> al=new ArrayList<Integer>();
				 al.add(ar[i]);al.add(ar[j]);
				 hm.put(ar[i]+ar[j],al);
			 }
		   }		   
	   }
	   
	   for(int i=0;i<ar.length;i++){
		   int check=sum-ar[i];
		   if(hm.get(check)!=null){
			   System.out.println(ar[i]); 
			   System.out.println(hm.get(check).get(0));
			   System.out.println(hm.get(check).get(1));
			   System.out.println("====");
		   }		   
	   }
	   
   }
   
   static void incdecseq(int ar[]){
	   int st=0; int en=ar.length-1;
	   int mid=(st+en)/2;	
	   while(st<en){		 
		   if(ar[mid-1]<ar[mid]&&ar[mid]>ar[mid+1]){
			 System.out.println(mid); break;
		   }else if(ar[mid-1]<ar[mid]&&ar[mid]<ar[mid+1]){
			   st=mid;
		   }else if(ar[mid-1]>ar[mid]&&ar[mid]>ar[mid+1]){
			   en=mid;
		   }		   
		   mid=(st+en)/2;	   
	   }	   
   }
   // mid==low&&a[mid]==data||a[mid]==data&&a[mid-1]<data
   static void fstoccur(int ar[]){
	   int st=0; int en=ar.length-1;
	   int mid=(st+en)/2;	
	   while(st<en){		 
		   if(fo<ar[mid])	  ; 
	   }	   
   }
   
  // int s[]={ 34,8,10,3,2,80,30,33,1};
   static void maxji(int ar[]){
		//get min from left to right
		//get max from right to left
	   int auxl[]= new int[ar.length];
	   int auxr[]= new int[ar.length];
	   auxl[0]=ar[0]; auxr[ar.length-1]=ar[ar.length-1];
	   
	  for(int i=1;i<ar.length;i++){		  
	  auxl[i]=Math.min(ar[i], auxl[i-1]);	  
	  }
	  
	  for(int i=ar.length-2;i>=0;i--){		  
      auxr[i]=Math.max(ar[i], auxr[i+1]);	  
	  }
	      int i=0; int j=0; int md=-1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	  while(j<ar.length-1&&i<ar.length-1){
		  
		  if(auxl[i]<auxr[j]){
			  md= Math.max(md,(j-i));	
			  j=j+1;
		  }else{
			i=i+1;
			 
		  }
		  
	  }
	   System.out.println(md);
   }
   
   
   
   
   
   
   

}
