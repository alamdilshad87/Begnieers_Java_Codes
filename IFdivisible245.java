import java.util.Scanner;
public class IFdivisible245
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        
        boolean d2=false,d4=false,d5=false;
        int no,lastdigit,last2digit;
        System.out.println("Enter An Integer : ");
        no=d.nextInt();
        lastdigit=no%10;
        last2digit=no%100;
        if(lastdigit==0 ||lastdigit==2 ||lastdigit==4 ||lastdigit==6 ||lastdigit==8)
        d2=true;
        if(lastdigit==0 ||lastdigit==5)
        d5=true;
        if(last2digit % 4==0)
        d4=true;
        if(d2==true&&d4==true&&d5==true)
        System.out.println(no + " is divisible by all 2,4 and 5 ");
        else
        System.out.println(no + " is not divisible by all 2,4 and 5 ");
    }
}