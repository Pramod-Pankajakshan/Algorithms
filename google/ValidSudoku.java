package google;

import java.util.*;


public class ValidSudoku {

	public static void main(String args[]) {
		String [][] multi = new String[][]{
			  {"5","3",".",".","7",".",".",".","."},
			  {"6",".",".","1","9","5",".",".","."},
			  {".","9","8",".",".",".",".","6","."},
			  {"8",".",".",".","6",".",".",".","3"},
			  {"4",".",".","8",".","3",".",".","1"},
			  {"7",".",".",".","2",".",".",".","6"},
			  {".","6",".",".",".",".","2","8","."},
			  {".",".",".","4","1","9",".",".","5"},
			  {".",".",".",".","8",".",".","7","9"}
			};
	}
		


	private static boolean fn(String[][] input) {

		Set<String> rows= new HashSet<>();
		Set<String> cols= new HashSet<>();
		Set<String> sq= new HashSet<>();
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(input[i][j]!="."&&rows.add("r"+i+"-"+input[i][j])) {
					return false;
				}
				if(input[i][j]!="."&&cols.add("c"+j+"-"+input[i][j])) {
					return false;
				}
				
				if(input[i][j]!="."&&i<3&&j<3&&sq.add("sqa"+"-"+input[i][j])) {
					return false;
				}
				if(input[i][j]!="."&&i>=3&&i<6&&j<3&&sq.add("sqb"+"-"+input[i][j])) {
					return false;
				}
				if(input[i][j]!="."&&i>=6&&i<9&&j<3&&sq.add("sqc"+"-"+input[i][j])) {
					return false;
				}
				
			}
		}
	
	return true;}
}

