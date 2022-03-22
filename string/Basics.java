package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Basics {
public static void main(String[] args) {
	System.out.println(50>>1);
	ArrayList<String> al= new ArrayList<String>();
	al.add("bbc");
	al.add("abc");	
   Collections.sort(al, new Comparator<String>() {
	   public int compare(String o1,String o2){
		   return (o1.compareTo(o2));	   
	   }
});
	//System.out.println(reverse("pprramod"));
	Basics b1= new Basics();
	b1.anagramsofeachother("aascscc","aasccc");
	String[] s= {"abc","bac","cba","ahn","anh",};
	b1.countwords("adba c \n m");
	String h="abc adcb gh";//op abcadcbgh
	b1.removeSpaces(h.toCharArray());
	for(int i=0;i<h.length();i++){		
		char[] a=h.toCharArray();
	//b1.firstnonrepeatinginStream(a[i]);
	}
}

// reverse a string

public static String reverse(String input){
	char toc[]=input.toCharArray();
	StringBuilder st= new StringBuilder();
	for(int i=toc.length-1;i>=0;i--){
		st.append(toc[i]);
	}
	return st.toString();
}

public static HashMap<Character, Integer> getCharCount(String input){
	char toc[]=input.toCharArray();
	HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
	HashMap<Character, ArrayList<String>> hl= new HashMap<Character,ArrayList<String>>();
	
	for(int i=0;i<toc.length;i++){
	if(hm.get(toc[i])==null){
		hm.put(toc[i], 1);	
	}else{
		hm.put(toc[i],hm.get(toc[i])+1);
	}	
	}
	
	for(Character s:hm.keySet()){
		
	}
	
	ArrayList<String> al= new ArrayList<String>();
	al.add("www");
	al.add("www");
	al.add("www");
	al.add("www");
	al.add("www");
	for(String h:al)System.out.println(h);
	
	return hm;
}

void nonrepeat(String h){
	char[] ca= h.toCharArray();
	HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
	for(int i=0;i<ca.length;i++){
		if(hm.get(ca[i])==null){
			hm.put(ca[i], 1);
		}else{
			hm.put(ca[i], hm.get(ca[i])+1);
		}
	}
	for(int i=0;i<ca.length;i++){
		if(hm.get(ca[i])==1){
			System.out.println(ca[i]); break;
		}
	}
	
}

void checkifallcharsofgivenword(String in,String ch){
	char[] ca= ch.toCharArray();
	char[] ina= in.toCharArray();
	HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
	HashMap<Character,Integer> hm2= new HashMap<Character, Integer>();

	for(int i=0;i<ina.length;i++){
		if(hm2.get(ina[i])==null){
			hm2.put(ina[i], 1);
		}else{
			hm2.put(ina[i], hm2.get(ina[i])+1);
		}
	}
	for(int i=0;i<ca.length;i++){
		if(hm2.get(ca[i])==null||hm2.get(ca[i])<=0){
			System.out.println("fail");
		}else{
			hm2.put(ca[i], hm2.get(ca[i])-1);
		}
	}
	
}

void checkifallcharsofgivenword2(String in,String ch){
	char[] ca= ch.toCharArray();
	char[] ina= in.toCharArray();
	int [] intar= new int[256];
	for(int i=0;i<ina.length;i++){
		intar[ina[i]]=1;
	}	
	for(int i=0;i<ca.length;i++){
		if(intar[ca[i]]!=1)
		System.out.println("fail");
	}
}

void divideastring(String h,int n){//4
	int l=h.length(); char[] c=h.toCharArray();
	if(l%n!=0){System.out.println("na"); return ;}
	ArrayList<String> al = new ArrayList<String>();
	StringBuilder b= new StringBuilder();
	Character cl=null;
	int ctr=0;
	for(int i=0;i<h.length();i++){
		b.append(c[i]); 
		ctr=ctr+1;
		if(ctr==n){
			System.out.println(b.toString());
			al.add(b.toString());
			ctr=0; b=new StringBuilder();
		}
	}
}

void reversewordsinstring(String st){
	char[] c=st.toCharArray();
	StringBuilder s= new StringBuilder();// took time to remember this
	for(int i=c.length-1;i>=0;i--){
		if(!(c[i]==' ')){
		s.append(c[i]);
		}else{		
			s.append(c[i]);
			System.out.println(s.toString());
			s= new StringBuilder();
		}
	}	
	System.out.println(s.toString());//missed this
}


void runlengthEncoding(String in){
	char inc[]= in.toCharArray();
	HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
	for(int i=0;i<inc.length;i++){	
	if(hm.get(inc[i])==null){
	  hm.put(inc[i],1);
	}else{
	 hm.put(inc[i],hm.get(inc[i])+1);
	}	
	}
	StringBuilder sb= new StringBuilder();
	for(char s:hm.keySet()){//logic
	sb.append(s);
	sb.append(hm.get(s));	
	}
	System.out.println(sb.toString());
}

// taestgtes  tes
void smallestWindow(String tochk,String val){
	char inc[]=val.toCharArray();
	char check[]=tochk.toCharArray();
	HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
	HashSet<Character> hs= new HashSet<Character>();
	for(int i=0;i<inc.length;i++){	
	if(hm.get(inc[i])==null){
	  hs.add(inc[i]);
	  hm.put(inc[i],1);
	}else{
	 hm.put(inc[i],hm.get(inc[i])+1);
	}	
	}
	int start=0; int end=0; boolean stf=false;
	for(int i=0;i<check.length;i++){	
		if(hm.get(check[i])!=null){
			if(!stf){
				stf=true;
				start=i;
			}
			if(hm.get(check[i])>1){
			hm.put(check[i],hm.get(check[i])-1);
			}else{
				hm.remove(check[i]);
			}			
		}
		if(hm.size()==0){			
			end=i; break;
		}		
	}
	// taeqstgtes tes
	int newend=0; int min=Integer.MAX_VALUE;
	for(int i=end+1;i<check.length;i++){
		if(check[i]==check[start]){
			newend=i;			
			while(start<end){
				start=start+1;
				
				if(hs.contains(check[start])){
					break;
				}
			}			
		}
		if(newend-start<min){
			min=newend-start+1;
			System.out.println(newend);
			System.out.println(start);
		}
	}
	System.out.println(min);
}

void interleaving(String a,String b,String c){
	char ca[]= a.toCharArray();
	char cb[]= b.toCharArray();
	char cc[]= c.toCharArray();
	//ab //cd  //acbd
	int ac=0;int bc=0; 
	boolean bb=true; boolean aa=true; boolean bdone=false; boolean adone=false;;
	for(int i=0;i<cc.length;i++){
		// check for a or b first
		//then flipflop
		//else fail
		// then edgecases =bdone and adone
		if(!adone&&aa&&cc[i]==ca[ac]||bdone){
			ac=ac+1;
			if(ac==a.length())adone=true;
			aa=false;bb=true;
		}else if(!bdone&&bb&&cc[i]==cb[bc]||adone){
			bc=bc+1;
			if(bc==b.length())bdone=true;
			bb=false; aa=true;
		}else{
			System.out.println("notok"); return;
		}
		
	}
	
	if(ac==a.length()&&bc==b.length()){
		System.out.println("ok");
	}else{
		System.out.println("nook");
	}
	
}


void printallAnagrams(String[] s){
	//use hashmap and arraylist
	HashMap<String,ArrayList<String>> hm= new HashMap<String, ArrayList<String>>();
	for(int i=0;i<s.length;i++){
		char[] c=s[i].toCharArray();
		Arrays.sort(c);	//sort
		String ss= new String(c);
		if(hm.get(ss)!=null){
			ArrayList<String> al=hm.get(ss);
			al.add(s[i]);
			hm.put(ss,al);
		}else{
			ArrayList<String> al=new ArrayList<String>();
			al.add(s[i]);
			hm.put(ss,al);
		}
	}
	
	for(String f:hm.keySet()){
		System.out.println(f);
		System.out.println("=");
      for(String d:hm.get(f))System.out.println(d);
		System.out.println("----");
	}
}
//na
void wildcard(String text){
	
	char[]t=text.toCharArray();
	Character dc='\u0000';
	for (int i = 0; i < t.length; i++) {
	
		if(t[i]=='b')t[i]=dc;
		if(t[i]=='a'&&i+1<t.length&&t[i+1]=='c')t[i]=t[i+1]=dc;
	
	}
	System.out.println(new String(t));
	
	}
//abc acdf, \n aaa
void countwords(String s){
	StringBuilder sb= new StringBuilder();
	char[] st= s.toCharArray();
	for (int i = 0; i < st.length; i++) {
		if((st[i]==' '||st[i]=='\t'||st[i]=='\n')){//dont complicate
			if(sb.length()>0){
			System.out.println(sb.toString());
			sb=new StringBuilder();
			}			
		}else{sb.append(st[i]);}
		
	}System.out.println(sb.toString());
}
//pass chars in a loop
// abcabdfgh  

LinkedList<Character> ln= new LinkedList<Character>();
HashMap<Character, Character> hm= new HashMap<Character, Character>();
// aabcdc
void firstnonrepeatinginStream(char in){
	//use linkedlist for store
	//hashmap for count
	if(hm.get(in)!=null){			
		try{		
		ln.remove(hm.get(in));//key is store the same object
		}catch(Exception e){
		System.out.println("ignored"+e.getLocalizedMessage());	
		}		
	}else{		
		hm.put(in, in);
		ln.add(in);
	}
	if(!ln.isEmpty())
System.out.println("NR now is "+ln.getFirst());	
}

void removeSpaces(char []str)
{
    // To keep track of non-space character count
    int count = 0; 
    // Traverse the given string. If current character
    // is not space, then place it at index 'count++'
    for (int i = 0; i<str.length; i++)
        if (str[i] != ' '){
            str[count++] = str[i]; // here count is}
                 // incremented
        }else{
        	//do nothing asx i increases
        }
    System.out.println(new String(str,0,count));
}

void checkifunique(String a){
	char[] ca= a.toCharArray();
	int iarr[]=new int[256];
	for(int i=0;i<ca.length;i++){
		if(iarr[ca[i]]==1){
			System.out.println("not unique"); 
			break;
		}
		iarr[ca[i]]=1;		
	}
}

void anagramsofeachother(String a,String b){
	char[] ca= a.toCharArray();
	char[] cb= b.toCharArray();
	int iarr[]=new int[256];
	
	for(int i=0;i<ca.length;i++){
		iarr[ca[i]]=iarr[ca[i]]+1;		
	}	
	for(int i=0;i<cb.length;i++){
		iarr[cb[i]]=iarr[cb[i]]-1;		
	}
	
	for(int i=0;i<iarr.length;i++){
		if(iarr[i]!=0){
			System.out.println("not an anagram");
			break;
		}
	}	
	System.out.println("yes");
}


static public void replacewith20(String in){
	char[] c= in.toCharArray();
	StringBuilder sb= new StringBuilder();
	boolean b=false;
	for(int i=0;i<c.length;i++){
		//abb v    b
	  if(c[i]==' '&&!b){			  
		sb.append("%20");
		b=true;
	  }else{
		  if(c[i]!=' '){
			  sb.append(c[i]);
			  b=false;
		  }          
		  
	  }
		
	}
  System.out.println(sb.toString());	
}

}
