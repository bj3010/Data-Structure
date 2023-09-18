import java.util.*;
public class AreaofCircle{
    public static void main (String [] args){
         double r;
         
         Scanner sc =new Scanner(System.in);
         r=sc.nextInt();
         double ans= Math.PI*r*r;
         System.out.println(+ans);
    }
}