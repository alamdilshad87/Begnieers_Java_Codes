import java.util.Scanner;
public class blue
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int ch,n1,n2,n3,n4;
        System.out.print("");
        n1=d.nextInt();
           
            n2=d.nextInt();
        System.out.print("");
        n3=d.nextInt();
        System.out.print("");
        n4=d.nextInt();
        System.out.print("Enter :");
        ch=d.nextInt();
        if(ch==1 && n1>n2 && n1>n3 && n1>n4)
          {
               System.out.println("1st is : "+n1);
          }
        if(ch==2 && n1>=n2 || n3>=n2 || n4>=n2)
          {
               System.out.println("2nd is  : "+n2);
          }n2=d.nextInt();
        System.out.print("");
        n3=d.nextInt();
        System.out.print("");
        n4=d.nextInt();
        System.out.print("Enter :");
        ch=d.nextInt();
        if(ch==1 && n1>n2 && n1>n3 && n1>n4)
          {
               System.out.println("1st is : "+n1);
          }
        if(ch==2 && n1>=n2 || n3>=n2 || n4>=n2)
          {
               System.out.println("2nd is  : "+n2);
          }
               
       
    }
}
