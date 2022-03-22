package beforeexam;


import java.util.ArrayList;
import java.util.HashMap;

public class Practise2018 {
	
	class Ans{
		Ans(int x, int y){
			this.x=x;
			this.y=y;
		}
		int x,y;
	}
public static void main(String arg[]){
    char cc[]= new char[3];
    cc[0]='z';
    for(char ch:cc) {
    		System.out.println(ch-'a');
    }
	System.out.println("Hello");
}
// sort in lamda
//listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
// 1 2 3 4 sum=5
private void twoSumApple(int[] a, int sum) {
	
	java.util.List<Ans> ls= new ArrayList();
	
	HashMap<Integer,Integer> hm= new HashMap<>();
	
	for(int in:a) {
		if(hm.get(sum-in)!=null){
			ls.add(new Ans(in, sum-in));
			int c=hm.get(sum-in);
			if(c==1) {
            hm.remove(sum-in);
			}else {
			c--;
			hm.put(sum-in,c);
			}
		}else {
			if(hm.get(in)!=null) {
				int y=hm.get(in);
				hm.put(in,y);
			}
		}
	}
	
}


}



