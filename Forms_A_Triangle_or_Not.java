import java.util.Scanner;
public class Forms_A_Triangle_or_Not
{
    public static boolean can(int s1,int s2,int s3)
    {
        boolean result;
        if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2)
        result=true;
        else
        result=false;
        return result;
    }
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        int ss1,ss2,ss3;
        System.out.print("Enter 1st Side :");
        ss1=d.nextInt();
        System.out.print("Enter 2nd Side :");
        ss2=d.nextInt();
        System.out.print("Enter 3rd Side :");
        ss3=d.nextInt();
        if(can(ss1,ss2,ss3)==true)
        System.out.print("It Forms A Triangle ");
        else
        System.out.print("It Does not Forms A Triangle ");
    }
}
