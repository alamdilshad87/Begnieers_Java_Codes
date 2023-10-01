import java.util.Scanner;
public class IFaotrs
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int cho,s,l,b,h;
        int aor,aot,aos;
        System.out.println("1 For Area Of Rectangle ");
        System.out.println("2 For Area Of Triangle ");
        System.out.println("3 For Area Of Square ");
        System.out.println("Enter Your Choice ");
        cho=d.nextInt();
        
        
        if(cho==1)
        {
            System.out.println("                    Area Of Rectangle ");
            System.out.println("Enter The Length ");
            l=d.nextInt();
            System.out.println("Enter The Breadth ");
            b=d.nextInt();
            aor=l*b;
            System.out.println("Result :  "+aor);
        }
        if(cho==2)
        {
            System.out.println("                    Area Of Triangle ");
            System.out.println("Enter The Height ");
            h=d.nextInt();
            System.out.println("Enter The Base ");
            b=d.nextInt();
            aot=(h*b)/2;
            System.out.println("Result :  "+aot);
        }
        if(cho==3)
        {
            System.out.println("                     Area Of Square ");
            System.out.println("Enter The Side ");
            s=d.nextInt();
            aos=s*s;
            System.out.println("Result :  "+aos);
        }
    }
}