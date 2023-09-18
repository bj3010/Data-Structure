import java.util.*;

class FactorialR{
    public int findfact(int n){
        if(n==1)
        return 1;
        return n*findfact(n-1);
    }
   public static void main( String [] args ) 
   {
    FactorialR f1= new FactorialR();
    int n;
    Scanner sc = new Scanner(System.in );
    n=sc.nextInt();
    System.out.println(f1.findfact(n));
   }
}