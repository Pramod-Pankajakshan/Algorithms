package advancedjava;

public class HumpyJumpy {
public static void main(String arg[]){
String h="abcddd";
String s="****a?c*";
	wildCardMatching(h.toCharArray(),s.toCharArray(),0,0);
}

// adceb *a*b
// aaaaaa *
// abc a?c
//'?' Matches any single character.
//'*' Matches any sequence of characters (including the empty sequence).
public static void wildCardMatching(char[] inStr, char[] vStr, int cp,int mp) {
	boolean isStar=false;
	while(cp<inStr.length) {
	
	if(mp>=vStr.length-1) {
		System.out.println("False");return;
	 }
	
	while(vStr[mp]=='*') {
		mp++;	
		isStar=true;
	}
	while(cp<inStr.length&&isStar){
		if(inStr[cp]==vStr[mp]) {				
			isStar=false;
			break;	
		}
		cp++;		
	}
	if(isStar&&cp==inStr.length) {
		System.out.println("false");
		return;
    }
	if(vStr[mp]=='?') {
		cp++;
		mp++;
	}
	if(vStr[mp]==inStr[cp]) {
	 mp++;
	 cp++;
	}else {
		System.out.println("false");
		break;
	}
}

	System.out.println("True");

}
}



