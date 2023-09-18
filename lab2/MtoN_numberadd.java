import java.util.*;
public class MtoN_numberadd {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int n;
          System.err.println("enter array of size:");
          n=sc.nextInt();
          int []a =new int [n];
          
            System.out.println("enter elements :");
          for (int i=0;i<=n;i++)
          {
            a[i]=sc.nextInt();
          }
          int c;
          int d ;
          System.out.println("enter c :");
          d=sc.nextInt();
          System.out.println("enter d:");
          c=sc.nextInt();
          int sum=0;
          for(int i=0;i<=n;i++)
          {
            sum =sum+i;
          }
          System.out.print(+sum+"");
    }
}
