package array;

public class Median {
	
	 /* Driver program to test above function */
    public static void main (String[] args)
    {
       int ar1[] = {1, 12};
        int ar2[] = {2, 13};
        
       // int ar1[] = {1, 2,4,6,8};
      //  int ar2[] = {9, 13,17,30,46};
      
        int n1 = ar1.length;
        int n2 = ar2.length;
        if (n1 == n2)
            System.out.println("Median is " +
                        getMedian(ar1, ar2));
        else
            System.out.println("arrays are of unequal size");
    }    
	
	 static int getMedian(int ari[], int arj[])
	    {   
	        int i = 0;  
	        int j = 0; 
	       
	        int m1 = -1, m2 = -1;
	        int size=arj.length;
	        /* Since there are 2n elements, median will 
	           be average of elements at index n-1 and 
	           n in the array obtained after merging ar1 
	           and ar2 */
	        for (int count = 0; count <= size; count++)
	        {
	            /* Below is to handle case where all 
	              elements of ar1[] are smaller than 
	              smallest(or first) element of ar2[] */
	            if (i == size)
	            {
	            	System.out.println("i");
	                m1 = m2;
	                m2 = arj[0];
	                System.out.println("m2 is"+m2+" and m1 is"+m1);
	                break;
	            }
	      
	            /* Below is to handle case where all 
	               elements of ar2[] are smaller than 
	               smallest(or first) element of ar1[] */
	            else if (j == size)
	            {
	              	System.out.println("i");
	                m1 = m2;
	                m2 = ari[0];
	                System.out.println("m2 is"+m2+" and m1 is"+m1);
	                break;
	            }
	      
	            if (ari[i] < arj[j])
	            {   
	                /* Store the prev median */
	                m1 = m2;  
	                m2 = ari[i];// store small
	                System.out.println("comparing both arrays "+ari[i]+" and "+arj[j]);
	                System.out.println("small set as m2 is"+m2+" and m1 is"+m1);
	                i++;
	            }
	            else
	            {
	                /* Store the prev median */
	                m1 = m2;  
	                m2 = arj[j];
	                System.out.println("else -comparing "+ari[i]+" and "+arj[j]);
	                System.out.println("m2 is"+m2+" and m1 is"+m1);
	               
	                j++;
	            }
	        }
	      
	        return (m1 + m2)/2;
	    }

}
