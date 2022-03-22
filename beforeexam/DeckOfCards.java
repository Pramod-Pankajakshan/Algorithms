package beforeexam;

import java.util.*;


public class DeckOfCards {

	static Set<String> completeSet;

	public static void main(String args[]) {
		completeSet=getPredefinedSet();
		DeckOfCards dk= new DeckOfCards();
		//boolean res=dk.fn(new String[]{"AH", "KH", "10D", "5H", "AC"});
        //System.out.println(res);
        boolean res2=dk.fn(new String[]{ "AH", "KH", "5H", "AC", "10S", "AS", "8H", "9D", "5S", "3D", "7S",
				"2D", "JH", "QS", "2H", "QD", "6S", "5D", "8D", "2C", "JC", "KS", "KD", "4H", "3H", "3C", "6D", "QH",
				"9H", "JD", "7D", "AD", "2S", "3S", "4S", "9S", "9C", "5C", "7C", "QC", "10H", "10C", "8S", "JS", "4D",
				"6H", "4C", "8C", "7H", "6C", "KC" });
        System.out.println(res2);
        
	}
    /**
     * check cards on deck are complete or not
     * @param input
     */
	private static boolean fn(String[] input) {
		// check total count of array
		// compare with a set of predefined complete set
		boolean result=true;
		// check for duplicates
		Set<String> dupeCheck=new HashSet<>();		
		for(String in:input) {
			if(completeSet.contains(in)) {
				if(!dupeCheck.add(in)) {
					result= false;
				}
			}else {
				
			}
		}
		
		if(dupeCheck.size()!=completeSet.size())result= false;
		
		for(String s:completeSet) {
			if(!dupeCheck.contains(s)) {
				System.out.println("Missing-->"+s+"|");
			}
		}
		
		return result;
	}
	
	private static Set<String> getPredefinedSet() {
		String[] compArr = new String[] { "AH", "KH", "10D", "5H", "AC", "10S", "AS", "8H", "9D", "5S", "3D", "7S",
				"2D", "JH", "QS", "2H", "QD", "6S", "5D", "8D", "2C", "JC", "KS", "KD", "4H", "3H", "3C", "6D", "QH",
				"9H", "JD", "7D", "AD", "2S", "3S", "4S", "9S", "9C", "5C", "7C", "QC", "10H", "10C", "8S", "JS", "4D",
				"6H", "4C", "8C", "7H", "6C", "KC" };
		;
		Set<String> completeSet = new HashSet<>();
		for (String str : compArr) {
			completeSet.add(str);
		}
		return completeSet;

	}
	
	/**
	 * 
A J Q K
2 - 10 Suit
D - Diamond
S - Spade
H - Heart
C - Club
	 * @param args
	 */
}

