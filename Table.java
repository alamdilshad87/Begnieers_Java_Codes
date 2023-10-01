import java.util.Scanner;
public class Table
{
    public static void main()
    {
        int i,n;
        Scanner d=new Scanner (System.in);
        System.out.print("Enter Number : ");
        n=d.nextInt();
        System.out.println("Table Of " +n+ " is : ");
        for(i=1;i<=10;i++)
        {
            System.out.println(n*1);
        }
}
}