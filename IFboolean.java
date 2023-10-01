import java.util.Scanner;
public class IFboolean
{
    public static boolean main(int n)
    {
        if (n%2==0)
        return true;
        else
        return false;
    }
    public static void mai()
    {
        Scanner d=new Scanner(System.in);
        int no;
        System.out.println("Enter An Integer : ");
        no=d.nextInt();
        if(main(no)==true)
        System.out.println(no+" is an EVEN no ");
        else
        System.out.println(no+ " is an ODD no ");
    }
}