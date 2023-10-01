import java.util.Scanner;
public class for_powers
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int n,i,pwr,p;
              
        System.out.print("Enter A Number For Their Powers : ");
        n=d.nextInt();
        pwr=n;
        for(i=1;i<=4;i++,pwr*=n)
        {
            System.out.println(n+"^"+i+" = "+pwr);
        }
    }
}