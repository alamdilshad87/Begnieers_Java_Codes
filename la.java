import java.util.Scanner;
public class la
{
    public static void main()
    {
        int n1,n2,n3,n4,ch;
        Scanner d=new Scanner(System.in);
        System.out.print("Enter 1st No ");
        n1=d.nextInt();
        System.out.print("Enter 2nd No. ");
        n2=d.nextInt();
        System.out.print("Enter 3rd No. ");
        n3=d.nextInt();
        System.out.print("Enter 4th No. ");
        n4=d.nextInt();
        System.out.print("E: ");
        ch=d.nextInt();
        switch(ch)
        {
            case 1 :
                 if(n1>n2 && n1>n3 && n1>n4)
                 {
                     System.out.println("1st grea");
                 }
            case 2 :
                 if(n2>n1 || n2>n3 ||n2>n4 && n3>n2 && n4>n2 )
                 {
                     System.out.println("2nd grea");
                 }
                }
}
}