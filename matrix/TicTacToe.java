package matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import base.Block;
import base.Column;
import base.Diagonal;
import base.Row;

public class TicTacToe {
	//other qns
	//tax calculations
	//
	
	int SIZE;
	boolean initialized;
	HashMap<Integer,Column> columnMap= new HashMap<Integer,Column>();
	HashMap<Integer,Row> rowMap= new HashMap<Integer,Row>();
	Diagonal d1= new Diagonal();
	ArrayList<Block> d2;
	public void init(int size){
		this.SIZE=size;
		this.initialized=true;
		this.d2=prepareSecondDiagonalBlockList(size);
	}
	
	public String checkForWinner(Block<String> block){
	  
	  addBlockToRow(block);
	  addBlockToColumn(block);
	  actOnDiagonals(block);		
	}
   
	private boolean addBlockToRow(Block<String> block){
	
		boolean status=false;
		Row r=rowMap.get(block.x);	
		r.counter=r.counter+1;
		r.datas.add(block.t);
		rowMap.put(block.x, r);
		if(r.counter==SIZE&&r.datas.size()==1) return true;
		
		return status;
	}
	private boolean addBlockToColumn(Block<String> block){
		
		boolean status=false;
		Column r=columnMap.get(block.y);	
		r.counter=r.counter+1;
		r.datas.add(block.t);
		columnMap.put(block.y, r);
		if(r.counter==SIZE&&r.datas.size()==1) return true;
		
		return status;
	}
	
	private boolean checkDiagonals(Block<String> block){
		boolean status=false;
		if(block.x==block.y){
			checkDiagonal1(block);
		}else if(isSecondDiagonal(block)){
			
		}else{
			return status;
		}
		return status;
	}
	
	boolean checkDiagonal1(Block<String> block){		
		d1.counter=d1.counter+1;
		d1.al.add(block);
		if(d1.counter==SIZE&&d1.al.size()==1) return true;		
		return false;
	}
	
	boolean isSecondDiagonal(Block b){
		return d2.contains(b);
	}
	
	ArrayList<Block> prepareSecondDiagonalBlockList(int size){
    	ArrayList<Block> al= new ArrayList<Block>();
    	int t=size;
		for(int i=0;i<size;i++){
			Block b= new Block();
			b.x=i; b.y=t;
			al.add(b);
			t=t-1;
		}
		
		return al;
	}
	
}
