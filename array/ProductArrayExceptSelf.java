package array;

import java.util.Arrays;

public class ProductArrayExceptSelf {

public static void main(String[] args) {
	int h[]={2,3,5,4};
	String gd= "";
	
	System.out.println(Arrays.toString(productExceptSelf(h)));
	System.out.println(Arrays.toString(multipleExceptSelf(h)));
}



/**
//1,2,3,4,5
//120,60,40,30,24

//for 3
left side multiple
  1 2 3 4 5
//1 1 2 6 24 
right side multiple
  1   2  3  4  5
//120 60 20 5  1
**/

private static int[] multipleExceptSelf(int[] in){
	int[] ls= new int[in.length];
	int[] rs= new int[in.length];
	for(int m=0;m<in.length;m++){
	 ls[m]=1; rs[m]=1;
	}
for(int i=0;i<in.length;i++){
if(i==0){
ls[i]=1; continue;
}
if(i==1){
ls[i]=1*in[i-1]; continue;
}

ls[i]=in[i-1]*ls[i-1];

}

for(int ii=in.length-1;ii>=0;ii--){
if(ii==in.length-1){
rs[ii]=1; continue;}
if(ii==in.length-1-1){
rs[ii]=1*in[ii+1]; continue;}
rs[ii]=in[ii+1]*rs[ii+1];
}

for (int k=0;k<in.length;k++){
	System.out.println(rs[k]);
	System.out.println(ls[k]);
 rs[k]=rs[k]*ls[k];
}

return rs;

}


// step 1 - get products of elements in left
// 2- get the product of all elements from right
public static int[] productExceptSelf(int[] input) {
    int n = input.length;
    int[] prodLeft = new int[n];
    int[] prodRight = new int[n];
    prodLeft[0] = 1;//imp - default to 1
    for (int i = 1; i < n; i++) {
        prodLeft[i] = prodLeft[i - 1] * input[i - 1];
    }
 System.out.println(Arrays.toString(prodLeft));
    
    prodRight[n-1] = 1;
    for (int i = n-1-1; i >=0 ; i--) {
        prodRight[i] = prodRight[i + 1] * input[i + 1];
    }
    System.out.println(Arrays.toString(prodRight));
    
   for(int i=0;i<input.length;i++) {
	  prodLeft[i]=prodLeft[i]*prodRight[i];
   }
   return prodLeft;// just multiply left and right
}

//original

//public static int[] productExceptSelf1(int[] nums) {
//    int n = nums.length;
//    int[] res = new int[n];
//    res[0] = 1;
//    for (int i = 1; i < n; i++) {
//        res[i] = res[i - 1] * nums[i - 1];
//    }
//    int right = 1;
//    for (int i = n - 1; i >= 0; i--) {
//        res[i] *= right;
//        right *= nums[i];
//    }
//    return res;
//}
}
