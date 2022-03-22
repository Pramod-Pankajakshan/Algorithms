package advancedjava;



public class Lambda {
public static void main(String arg[]){

	MathRun square = (n) -> (n*n);
	System.out.println(square.runTest(6));
}
//Functional interface
interface MathRun{
	int runTest(int n);
}






}




