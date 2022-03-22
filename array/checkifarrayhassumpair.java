package array;

import java.util.HashSet;

public class checkifarrayhassumpair {
	int f[]={11,2,13,4,5,6,7,8,9}; int k=24;
	public static void main(String[] args) {
		checkifarrayhassumpair c= new checkifarrayhassumpair();
		c.f();
	}
	
	void f(){
		HashSet<Integer> s= new HashSet<Integer>();
		for(int i=0;i<f.length;i++){
			if(!s.contains(k-f[i])){
				s.add(k-f[i]);
			}
			if(s.contains(f[i])&&(f[i]-(k-f[i])!=0)){
				System.out.println(f[i]);
				System.out.println(k-f[i]);
				System.out.println("-----");
			}
		}
	}

}
