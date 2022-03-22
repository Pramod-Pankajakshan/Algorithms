package array;

import java.util.Arrays;

public class RotationalCipher {

	

		  // Add any helper functions you may need here
		  
		  String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  String st2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  String n="0123456789";
		  

		  String rotationalCipher(String input, int rotationFactor) {
		    // Write your code here
		    char h[]= input.toCharArray();
		    char h2[]= new char[h.length];
		    char []lookup=s.toCharArray();char []lookup2=n.toCharArray();char []lookup3=st2.toCharArray();
		    for(int i=0;i<h.length;i++){
		    	h2[i]=h[i];
		      for(int j0=0;j0<lookup.length;j0++){
		        
		        if(Character.toString(h[i]).matches("^[a-z]*$")){
		         if(h[i]==lookup[j0]){
		        	 System.out.println(">>--"+h[i]);
		          if(j0+rotationFactor>lookup.length){
		            int newl= (j0+rotationFactor)%lookup.length;		            
		             h2[i]=lookup[newl];
		             System.out.println("replacement -"+h2[i]); 
		           }else{
		            h2[i]=lookup[j0+rotationFactor];
		            System.out.println("replacement -"+h2[i]); 
		          }
		         }
		         }
		      }
		      
		      for(int j=0;j<lookup3.length;j++){
			        
			        if(Character.toString(h[i]).matches("^[A-Z]*$")){
			         if(h[i]==lookup3[j]){
			        	 System.out.println(">>--"+h[i]);
			          if(j+rotationFactor>lookup3.length){
			            int newl= (j+rotationFactor)%lookup3.length;		            
			             h2[i]=lookup3[newl];
			             System.out.println("replacement -"+h2[i]); 
			           }else{
			            h2[i]=lookup3[j+rotationFactor];
			            System.out.println("replacement -"+h2[i]); 
			          }
			         }
			         }
			      }
		        for(int j1=0;j1<lookup2.length;j1++){
		        if(Character.toString(h[i]).matches("^[0-9]*$")){
		        	System.out.println("issue");
		         if(h[i]==lookup2[j1]){
		          if(j1+rotationFactor>lookup2.length){
		           int newl= (j1+rotationFactor)%lookup2.length;
		            h2[i]=lookup2[newl];
		           }else{
		           h2[i]=lookup2[j1+rotationFactor];
		           }
		          }
		         }
		        }
		      }
		      
		    System.out.println(Arrays.toString(h2));
		    return new String(h2);
		  }











		  // These are the tests we use to determine if the solution is correct.
		  // You can add your own at the bottom, but they are otherwise not editable!
		  int test_case_number = 1;
		  void check(String expected, String output) {
		    boolean result = (expected.equals(output));
		    char rightTick = '\u2713';
		    char wrongTick = '\u2717';
		    if (result) {
		      System.out.println(rightTick + " Test #" + test_case_number);
		    }
		    else {
		      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
		      printString(expected); 
		      System.out.print(" Your output: ");
		      printString(output);
		      System.out.println();
		    }
		    test_case_number++;
		  }
		  void printString(String str) {
		    System.out.print("[\"" + str + "\"]");
		  }
		  
		  public void run() {
		    String input_1 = "All";
		    int rotationFactor_1 = 4;
		    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
		    String output_1 = rotationalCipher(input_1, rotationFactor_1);
		    check(expected_1, output_1);

		    String input_2 = "abcdZXYzxy-999.@";
		    int rotationFactor_2 = 200;
		    String expected_2 = "stuvRPQrpq-999.@";
		    String output_2 = rotationalCipher(input_2, rotationFactor_2);
		    check(expected_2, output_2);

		    // Add your own test cases here
		    
		  }
		  
		  public static void main(String[] args) {
		    new RotationalCipher().run();
		  }
		  
		  
		}
	

