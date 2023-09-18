import java.util.*;
public class Vowel {
     public static void main(String [] args)
     {
        char c;
        Scanner sc =new Scanner(System.in);
        c=sc.next().charAt(0);
        if (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
        {
            System.out.println("char is vowel");
        }
        else
        {
            System.out.println("char is not vowel");
        }       
     }
}