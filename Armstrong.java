import java.util.Scanner;
public class Armstrong
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        System.out.print("Enter A 3 Digit Number To Be Checked : ");
        int n=d.nextInt();
        int n1=n;
        int check=0,r;
        do
        {
            r=n%10;
            check=check+(int)Math.pow(r,3);
            n=n/10;
        }
        while(n!=0);
        if(check==n)
        System.out.print(n+" Is An Armstrong Number");
        else
        System.out.print(n+" Is Not An Armstrong Number");
    }
}
