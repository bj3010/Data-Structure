import java.util.*;
public class onetonnumberarray {
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
    }
}
