import java.util.*;
public class Primeornot {
    public static void main(String[] args) {
        int n ;
         Scanner sc =new Scanner(System.in);
         System.out.print("enter the number :");
         n=sc.nextInt();
         int flag=0;
         for(int i=0;i<=n/2;i++)
         {
            flag=1;
            break;
         }
         if(flag==1)
         {
            System.out.println(" no is prime ");
         }
         else 
         {
            System.out.println("num si not prime ");
         }

    }
}
