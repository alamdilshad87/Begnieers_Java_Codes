import java.util.Scanner;
public class Total_Marks
{
    public static void main()
    {
        int c=0;
        double marks=0,total=0;
        Scanner d=new Scanner(System.in);
        do
        {
            System.out.print("Enter Marks In Subject "+(c+1)+" :");
            marks=d.nextDouble();
            total=total +marks;
            c=c+1;
        }
        while(c<5);
        System.out.print("Total Marks In "+c+" Subjects Are :"+total);
    }
}
