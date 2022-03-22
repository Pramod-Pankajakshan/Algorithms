package permutandcombi;

//Java program to print all combination of size r in an array of size n
import java.io.*;

class PermutationOfArray {


 static void combinationUtil(int inputArr[], int temp[], int start,
                             int end, int index, int size)
 {
     // Current combination is ready to be printed, print it
     if (index == size)
     {
         for (int j=0; j<size; j++)
             System.out.print(temp[j]+" ");
         System.out.println("");
         return;
     }

     // replace index with all possible elements. The condition
     // "end-i+1 >= r-index" makes sure that including one element
     // at index will make a combination with remaining elements
     // at remaining positions
     
     
     for (int i=start; i<=end && end-i+1 >= size-index; i++)
     {
     //	 System.out.println("end -i+1"+(end-i+1));
       //  System.out.println("size - index"+(size-index));
         temp[index] = inputArr[i];
         combinationUtil(inputArr, temp, i+1, end, index+1, size);
     }
 }

 // The main function that prints all combinations of size r
 // in arr[] of size n. This function mainly uses combinationUtil()
 static void printCombination(int arr[], int n, int r)
 {
     // A temporary array to store all combination one by one
     int temp[]=new int[r];

     // Print all combination using temprary array 'data[]'
     combinationUtil(arr, temp, 0, n-1, 0, r);
 }

 /*Driver function to check for above function*/
 public static void main (String[] args) {
     int arr[] = {1,0,0,0};
     int r = 4;
     int n = arr.length;
     printCombination(arr, n, r);
 }
}

