import java.util.Scanner;
public class For_Table
{
    public static void main()
    {
        int i,n;
        Scanner d= new Scanner(System.in);
        System.out.print("Enter A Number : ");
        n=d.nextInt();
        for(i=1;i<=10;i++)
         {
           System.out.println(n+"*"+i+"="+n*i);
         }
    }
}