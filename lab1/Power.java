import java.util.*;

public class Power {
    public static void main (String [] args)
    {
        int x,y,i=1,ans=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the base :");
        x=sc.nextInt();
        System.out.print("enter the power :");
        y=sc.nextInt();

        while (i<=y)
        {
            ans =ans *x;
            i++;
        }
        System.out.println(+ans);
    }
}