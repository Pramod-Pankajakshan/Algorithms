package array;

import java.util.Arrays;
import java.util.HashMap;

public class Zerosandones {

	
	public static void main(String[] args) {		
	    //int h[]={1,1,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,1,0,1,0};
		//int h[]={0,1,1,0,0,1,0,0}; //-1 0 1 0 -1 0 -1
		int h[]={1,1,0,0,1,0}; //1 2 3 2 1
		Zerosandones a=new Zerosandones();
		a.lssa(h);		
		a.getmax(h);
	}

	//balanced number of 1 and 0 1100 - means 4
	public void lssa(int [] in){
		HashMap<Integer,Integer> hm =new HashMap<Integer, Integer>();
		hm.put(0,0);
		for(int i=0;i<in.length;i++){
			if(in[i]==0)
				in[i]=-1;// convert to -1
		}		
		System.out.println(Arrays.toString(in).toString());
		int sum=0;
		int largest=0;
		for(int i=0;i<in.length;i++){
			sum=sum+in[i];
			System.out.println(sum);
			if(hm.get(sum)!=null){
				System.out.println("Found ----> "+sum);
				if(i-hm.get(sum)>largest){
					largest=i-hm.get(sum);
					
				}
			}else{
				hm.put(sum,i);// store position
			}
		}
		System.out.println("----"+largest);
	}
	
		
	
	//flip zeroes
	void getmax(int h[]){
		boolean zero=false;
		int max=Integer.MIN_VALUE; int start=0;int end=0;
		for(int i=0;i<h.length;i++){
			if(h[i]==1){
				zero=false;
				end=end+1;
				continue;
			}else{
				
				if(!zero){
				
				if(start+end >max){
					max=start+end+1;
				}
				zero=true;
				start=end;
				end=0;	
				}else{
					if(start+end >max){
						max=start+end+1;
					}
					start=0;
					end=0;
				}
			}
		}
		
		System.out.println(max);
	}
	

}
