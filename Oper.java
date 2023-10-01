import java.util.Scanner;
public class Oper
{
    public static void main()
    {
        double n1,n2,n3,r;
        char ope;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter 1 or 2 or 3 or  ");
        String t=d.nextLine();
        ope=t.charAt(0);
        switch (ope)
        {
            case '1' :
            System.out.println("Dilshad "+"PineApple");
            break;
            case '2' : 
            System.out.println("Vishal "+"Mango");
            break;
            case '3' : 
            System.out.println("Armaan "+"Apple");
            break;
            case '4' :
            System.out.println("Ankita "+"Orange");
            break;
            case '5' :
            System.out.println("Nupur "+"Strawberry ");
            break;
            default :
            System.out.println("Fool ");
        }
    }
}

            