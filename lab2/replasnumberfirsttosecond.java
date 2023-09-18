import java.util.*;
public class replasnumberfirsttosecond {
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
        
        for(int b:a)
        {
            System.out.println(b+"");
            
        }
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println("enter the number x:"+x+"and y:"+y);
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                a[i]=y;
            }
        }
        System.out.println("modifiad array");
        for(int bb:a)
        {
            System.out.println(bb+"");
        }
    }
}
