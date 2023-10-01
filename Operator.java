import java.util.Scanner;
public class Operator
{
    public static void main()
    {
        double n1,n2,n3,r;
        char op;
        r=0;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter 1st Number ");
        n1=d.nextDouble();
        System.out.println("Enter 2st Number ");
        n2=d.nextDouble();
        d.nextLine();
        System.out.println("Enter Operator + - * / % ");
        String t=d.nextLine();
        op=t.charAt(0);
        switch (op)
        {
            case '+' : 
            r = n1+n2;
            System.out.println("Sum Of Two Number Is : "+r);
            break;
            case '-' : 
            r = n1-n2;
            System.out.println("Difference Of Two Number Is : "+r);
            break;
            case '*' : 
            r = n1*n2;
            System.out.println("Product Of Two Number Is : "+r);
            break;
            case '/' : 
            r = n1/n2;
            System.out.println("Quotient Of Two Number Is : "+r);
            break;
            case '%' : 
            r = n1%n2;
            System.out.println("Remainder Of Two Number Is : "+r);
            break;
            default :
            System.out.println("Invalid Operator");
        }
    }
}

            