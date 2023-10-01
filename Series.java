import java.util.Scanner;
public class Series
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int n=0;
        int res=0;
        System.out.print("Enter Starting Number : ");
        n=d.nextInt();
        while(res<100)
        {
            res=n*(n+1);
            System.out.println(n + " x"+(n+1)+" = "+res);
            n=n+1;}
        }
    }
    