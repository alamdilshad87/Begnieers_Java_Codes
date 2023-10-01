import java.util.Scanner;
public class Sum_Of_Odd_Even
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n=d.nextInt();
        int s_e=0,s_o=0,ctr=1;
        while(ctr %2==0)
        {
            if(ctr%2==0)
            s_e+=ctr;
            else
            s_o+=ctr;
        }
        System.out.println("Sum Of Even Integers "+"upto "+n+"Is : "+s_e);
        System.out.println("Sum Of Odd Integers "+"upto "+n+"Is : "+s_o);
    }
}

    