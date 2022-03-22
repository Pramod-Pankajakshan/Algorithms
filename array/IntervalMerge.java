package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalMerge
{
  private class Interval
  {
  int startTime;
  int endTime;
  int price;

  Interval( int startTime, int endTime, int price )
  {
    this.startTime = startTime;
    this.endTime = endTime;
    this.price = price;
  }
  }

  private List<Interval> getLowestPrices( List<Interval> vendors )
  {
    // sort it by time
    Interval []in= new Interval[vendors.size()];
    int j=0; int k=0;
    for(Interval inn: vendors){
       in[k]=inn;
      k++;
    }
    
    for(int i=1;i<in.length;i++){
    
      if(in[j].endTime>in[i].startTime){
         if(in[j].price>in[i].price){
        
           in[j].endTime=in[i].startTime;
           
         }else{
         
           in[i].startTime=in[j].endTime;
         }
        j++;
      
      }
    }
    
    
    
    
  return Arrays.asList(in);
  }

  /**
   * Returns true if the tests pass. Otherwise, false.
   */
  private boolean doTestsPass()
  {
  Interval[] sampleInput = { new Interval( 1, 5, 20 ), new Interval( 3, 8, 15 ), new Interval( 7, 10, 8 ) };
  Interval[] expectedOutput = { new Interval( 1, 3, 20 ), new Interval( 3, 7, 15 ), new Interval( 7, 10, 8 ) };

  List<Interval> inputList = new ArrayList<>( Arrays.asList( sampleInput ) );
  List<Interval> expectedList = new ArrayList<>( Arrays.asList( expectedOutput ) );

  return expectedList.equals( getLowestPrices( inputList ) );
  }

  /**   v  ccvccccccxzz          
   * Execution entry point.
   */
  public static void main( String[] args )
  {
  IntervalMerge solution = new IntervalMerge( );
  if ( solution.doTestsPass( ) )
  {
    System.out.println( "All tests passed" );
  }
  else
  {
    System.out.println( "Tests failed" );
  }
  }
}



