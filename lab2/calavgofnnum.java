 import java.util.*;
public class calavgofnnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");

        n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0 ;i<n;i++)
        {
            System.out.println("enter the elements");
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int b:a)
        {
            System.out.println(b+"");    
        }
         int sum =0;
         for(int i=0;i<a.length;i++)
         {
            sum=sum+a[i];   
         }
         double ave=(double)sum/n;
         System.out.println(ave+"");
    }
}

