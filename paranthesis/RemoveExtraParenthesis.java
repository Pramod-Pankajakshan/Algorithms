package paranthesis;

public class RemoveExtraParenthesis {
	
	public static void main(String[] args) {
		RemoveExtraParenthesis rp= new RemoveExtraParenthesis();
		rp.remove(")(a()))c()b)");
		
	}
	// so the trick is - from left to right look for extra right parenthesis, add it to array and reset count
	// and do same for reverse
	private void remove(String in) {
		char [] ch= in.toCharArray();
		// positions to remove
		int[] toremo=new int[ch.length];
		// loop and check the balance
		int g=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(') {
				g++;
			}else if(ch[i]==')'){
				g--;
			}
			if(g<0) {
				System.out.println("push to "+i);
				toremo[i]=1;
				g=0; // reset
				System.out.println("reset...");
			}
		}
		
		System.out.println("reverse........");
		 g=0;
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==')') {
				g++;
			}else if(ch[i]=='('){
				g--;
			}
			System.out.println(g);
			if(g<0) {
				System.out.println("push to--- "+i);
				toremo[i]=1;
				g=0;
			}
		}
		// we do this to figure out whihc one to remove
		StringBuilder sb = new StringBuilder();
		 for (int i = 0; i < ch.length; i++) {
		        if (toremo[i]==0) sb.append(ch[i]);
		    }
	
		System.out.println(sb.toString());
		
	}


}
