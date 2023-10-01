import java.util.Scanner;
public class even_odd
{
    public static boolean test(int n)
    {
        if(n%2==0)
        return true;
        else 
        return false;
    }
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int no;
        System.out.println("Enter An Number : ");
        no=d.nextInt();
        if(test(no)==true)
        System.out.println( no+" Is An Even Number " );
        else
        System.out.println( no + " Is An Odd Number ");
    }
}
