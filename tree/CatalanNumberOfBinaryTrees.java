package tree;

public class CatalanNumberOfBinaryTrees {
public static void main(String arg[]){

System.out.println(numTrees(3));

}
//CatalanNumberOfBinaryTrees
static int numTrees(int n) {
    //Cantalan
    //C(2n,n)/(n+1)
    long ans =1;
    for(int i=n+1;i<=2*n;i++){
        ans = ans*i/(i-n);
    }
    return (int) (ans/(n+1));
}


}



