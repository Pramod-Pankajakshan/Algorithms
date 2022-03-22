package array;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		d2(sb,0,0,0);
		System.out.println(lss.size());
	}

	

	static int cnt = 0;
static List<String> lss= new ArrayList<String>();
	private static void d2(StringBuilder sb,int size,int ls, int rs) {
	// stop when size is 6
		if(size==8) {
			String h=sb.toString();
			System.out.println(h);
			lss.add(h);
			return;
		}else {
	// start with left
		if(ls<4) {
		sb.append("(");
		d2(sb,size+1,ls+1,rs);
		sb.deleteCharAt(size);
		}
		if(rs<4&&ls>rs) {
		sb.append(")");
		d2(sb,size+1,ls,rs+1);
		sb.deleteCharAt(size);
		}
		
	// add right
		}
		return;
		
	}

}
