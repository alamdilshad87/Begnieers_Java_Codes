import java.util.Scanner;
public class If_largest
{ 
    public static void main()
    {
        int n1,n2,n3,n4;
        Scanner d=new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        n1=d.nextInt();
        System.out.print("Enter 2nd Number : ");
        n2=d.nextInt();
        System.out.print("Enter 3rd Number : ");
        n3=d.nextInt();
        System.out.print("Enter 4th Number : ");
        n4=d.nextInt();
        if(n1>n2&&n1>n3&&n1>n4)
        {
            System.out.print("1st Number " + " Is Greater ");
        }
        if(n2>n1&&n2>n3&&n2>n4)
        {
            System.out.print("2nd Number " + "Is Greater");
        }
        if(n3>n1&&n3>n2&&n3>n4)
        {
            System.out.print("3rd Number "+" Is Greater");
        }
        if(n4>n1&&n4>n2&&n4>n3)
        {
            System.out.print("4th Number "+" Is Greater ");
        }
        if(n1==n2&&n1==n3&&n1==n4)
        {
            System.out.println("All Are Equal " );
        }
}
}


 