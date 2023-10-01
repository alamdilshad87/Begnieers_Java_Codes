import java.util.Scanner;
public class Divis_Count
{
    public static void gen(int n)
    {
        int i=2,count=2,lim=n/2;
        System.out.print("Other Than The Number Itself And 1, The Divisors Of "+n+" are : ");
        while(i<=lim)
        {
            if(n % i==0)
            {
                count++;
                System.out.print(i);
            }
            i++;
        }
        System.out.print("Total Number Of Divisors :"+count);
    }
    
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        System.out.print("Enter The Number Whoe Divisor Are To Be Generated : ");
        int num=d.nextInt();
        gen(n);
    }
}