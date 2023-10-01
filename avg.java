import java.util.Scanner;
public class avg
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        float n1,n2,n3,sum,avg;
        System.out.println("Enter 3 no : ");
        n1=d.nextFloat();
        n2=d.nextFloat();
        n3=d.nextFloat();
        sum=n1+n2+n3;
        avg=sum/3;
        System.out.println("You entered : "+n1+ " , "+n2+ " ,"+n3);
        System.out.println("Their Average is : "+avg);
    }
}
