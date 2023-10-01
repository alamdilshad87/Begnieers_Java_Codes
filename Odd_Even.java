import java.util.Scanner;
public class Odd_Even
{
    public static void main()
    {
        Scanner d=new Scanner (System.in);
        int n;
        System.out.print("Enter A Number : ");
        n=d.nextInt();
        if(n%2==0)
        
        System.out.println("It Is Even ");
        
        else
        System.out.println("It Is Odd " );
    }
}
