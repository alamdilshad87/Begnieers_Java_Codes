import java.util.Scanner;
public class Factorial
{
    public static void main()
    {
        long i=0,fact=1,num;
        Scanner d=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        num=d.nextInt();
        i=num;
        while(i!=0)
        {
            fact=fact*i;
            --i;
        }
        System.out.println("The Factorial Of : "+num + "Is " +fact);
    }
}
