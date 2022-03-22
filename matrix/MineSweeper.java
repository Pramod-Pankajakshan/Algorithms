package matrix;

import java.util.ArrayList;

import base.Block;

public class MineSweeper {


public static void main(String[] args) {
	MineSweeper m= new MineSweeper();
	int h[][]= new int[4][4];	
	ArrayList<Block<Integer>> bombList=new ArrayList<Block<Integer>>();
	Block<Integer> b= new Block<Integer>();
	b.x=3;b.y=1;
	Block<Integer> b2= new Block<Integer>();
	b2.x=2;b2.y=1;
	Block<Integer> b3= new Block<Integer>();
	b3.x=1;b3.y=1;
	bombList.add(b);bombList.add(b2);bombList.add(b3);
	ArrayList<Block<Integer>> all=m.prepareBlock(4,4,h);
	m.checkAndPrintNbr(all,bombList);
	for(Block<Integer> op:all) {
		System.out.println(op.t+"- for "+op.x+"x"+op.y+"y");
	}
	
}

public ArrayList<Block<Integer>> prepareBlock(int x,int y,int[][]h){
	ArrayList<Block<Integer>> al= new ArrayList<Block<Integer>>();
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){		
			Block<Integer> b= new Block<Integer>();
			b.x=i;
			b.y=j;
		    b.t=0;
			al.add(b);
		}
	}	
	return al;
}

public void checkAndPrintNbr(ArrayList<Block<Integer>> al,ArrayList<Block<Integer>> bombs){
	for(Block<Integer> bomb:bombs){	
	for(Block<Integer> b:al){		
		if((!bomb.equals(b))&&bomb.isNeighbor(b)){			
			b.t=b.t+1;
		}		
	}
	}
}



}
