package matrix;

import java.util.*;


public class Template2 {

	public static void main(String args[]) {
		 String f=""; char [] s=new char[]{'l','e','e','t'};
		 bfs(0,0);
		 System.out.println(f);
	}
 static	char[][] ch= new char[][]{
        {'a','b','c','d','e'}, 
        {'f','g','h','i','j'}, 
        {'k','l','m','n','o'}, 
        {'p','q','r','s','t'}, 
        {'u','v','w','x','y'}
  };
  
  
  private static void bfs(int i, int j) {
	  
	  Queue<int[]> q= new LinkedList<>();
	  q.add(new int[] {i,j});
	  Set<String> vis= new HashSet<>();
	  int c=1; int level=0;
	  while(!q.isEmpty()) {	
		  while(c>0) {
		  int pos[]=q.poll();
		  int x=pos[0];
		  int y=pos[1];		  
		  
		  if(x<0||y<0||y>ch[0].length-1||x>ch.length-1||vis.contains(""+x+"-"+y)) {
		  } else {
		  q.add(new int[] {x+1,y});		 
		  q.add(new int[] {x,y+1});	
		  System.out.print(ch[x][y]);
		  
		  if(ch[x][y]=='s') {
			  System.out.println("--->"+level);
		  }
		  }
		  
		  vis.add(""+x+"-"+y);
		  c--;
		  }
		 
		  System.out.println("--"+level);
		  level++;
		  c=q.size();
	  }
	  System.out.println(level);
	  
	  
  }

}

