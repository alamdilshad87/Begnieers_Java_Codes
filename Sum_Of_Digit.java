import java.util.Scanner;
public class Sum_Of_Digit
{
    public static int Dil(int ns)
    {
        int ns2=ns;
        int r,q,sum=0;
        while(ns2>0)
        {
            q=ns2/10;
            r=ns2 % 10;
            sum=sum+r;
        }
        return sum;
    }
    
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n1=d.nextInt();
        int s=0;
        s=Dil(n1);
        System.out.print("Sum Of DIgits Of "+n1 +" is : "+s);
    }
}
