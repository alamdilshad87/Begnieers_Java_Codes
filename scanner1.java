import java.util.Scanner;
public class scanner1
{
    public static void main()
    {
        int  n1,n2,n3,n4,Sum;
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter 4 integers : ");
        n1=kb.nextInt();
        n2=kb.nextInt();
        n3=kb.nextInt();
        n4=kb.nextInt();
        Sum=n1+n2+n3+n4;
        System.out.println("You Entered :"+n1+","+n2+","+n3+","+n4);
        System.out.println("Sum : "+Sum);
    }
}
