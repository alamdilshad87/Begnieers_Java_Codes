import java.util.Scanner;
public class Palindrome
{
    public static void main()
    {
        Scanner pa=new Scanner(System.in);
        int n;
        System.out.print("Enter 2 Digit Number : ");
        n=pa.nextInt();
        int first,last;
        last=n%10;
        first=n/10;
        if(first==last)
        {
            System.out.println(n+" Is A Palindrome Number ");
        }
        else
         System.out.println(n+" Is Not A Palindrome Number ");
        }
    }
        