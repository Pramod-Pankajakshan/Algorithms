package leetcode;

import java.util.*;
import java.io.*;
import java.util.*;

/**

Its come to our attention that some of our customers are sending us CSVs with rogue quotation marks, which are breaking our CSV parser.

We would like to implement a method that will escape these rogue quotes:
 escapeRogueQuotes(csv: String): String

However, note that CSVs can have valid quotation marks surrounding fields:
-----
hi there,"field two, has a comma",field 3  
first field,"another field","field three, also with comma"

first field,"field two \n has a new line", field three starts with a space
-----
-----
first "fie"ld,"another "fie"ld",extra field,"field four, with comma"
-----
-----
first \"fie\"ld,"another \"fie\"ld",extra field,"field four, with comma"\n
-----
// if the quote is not next to a comma then mark it and mark the quote prior
**/

public class Axon {

	  public static void main(String[] args) {
	    Axon mai= new Axon();
	    String in="first \"fie\"ld,\"another \"fie\"ld\",extra field,\"field four,\" with comma\"";
	    mai.format(in);
	  }
	  //first "fie"ld,"another "fie"ld",extra field,"field four, with comma"
	  //first \"fie\"ld,"another \"fie\"ld",extra field,"field four, with comma"\n
	  //first \"fie\"ld,"another \"fie\"ld",extra field,"field four," with comma\"
	  //first \"fie\"ld,"another "fie\"ld",extra field,"field four, with comma"
	  private String format(String st){
	    char [] ch= st.toCharArray();
	    StringBuilder sb= new StringBuilder();
	    boolean ex=false; int pos=0; //char next='';
	    boolean quoteStarted=false;
	    for(int i=0;i<ch.length;i++){
	     char c=ch[i]; char next=ch[i];
	      if(i<ch.length-1) next=ch[i+1];
	      //System.out.println(quoteStarted);
	       System.out.println(ex+"--"+c+"--"+quoteStarted);
	      if(c=='"'&&!ex){
	        if(!(next==',')){
	         sb.append("\\"); 	        
	        }else{
	          quoteStarted=false;
	        }
	      }
	      if(c==','){
	        ex=true;
	        quoteStarted=true;
	      }else{
	        ex=false;
	      }
	      sb.append(c);
	    }
    	
	    System.out.println(sb.toString());
    return sb.toString();
  }

}

