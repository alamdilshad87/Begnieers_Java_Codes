import java.util.Scanner;
public class For_Loop
{
    public static void main()
    {
        int n;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Any Number To Display Odd Or Even Number :");
        n=d.nextInt();
        if(n%2==0)
          {
            System.out.println("It Is An Even Number");
            int i;
            System.out.println("5 Consecutive Number Are : ");
            for(i=n;i<=10;i+=2)
            {
                System.out.println(i);
            }
        }
            else 
            {
             System.out.println("It Is An Odd Number");
            } 
          }
    }

