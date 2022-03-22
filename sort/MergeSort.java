package sort;




public class MergeSort {
	  private int[] numbers;
	  private int[] helper;


	  private int number;

	  public void sort(int[] values) {
	    this.numbers = values;
	    number = values.length;
	    this.helper = new int[number];
	    mergesort(0, number - 1);
	  }

	  private void mergesort(int low, int high) {	
		  int mid=(low+high)/2;
		  if(mid>=1)
		  mergesort( low,  mid);
		  mergesort( mid,  high);
	      merge(low,high);	    
	  }

	  private int[] merge(int low, int high){
		  int middle=high+low/2;	
		  for(int i=low;i<high;i++){
			  helper[i]=numbers[i];
		  }
		  for(int i=low;i<middle;i++){
			  for(int j=middle;j<high;j++){
				  if(hh[i]<hh[j]){
					  helper[i]=hh[j];
				  }else{
					  helper[i]=hh[j];
				  }
			  }
		  }
	  }
	} 