import java.util.Scanner;
public class Positive_Number
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int num=0;
        int sum=0;
        while(num!=-1)
        {
            sum=sum+num;
            System.out.print("Enter The Next Positive Number To Add(-1 to Exit) : ");
            num=d.nextInt();
        }
        System.out.println("Sum Of The Input Number Are : "+sum+ " ");
    }
}
