import java.util.Scanner;
public class Squares_Of_1_to_n
{
    public static void main()
    {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter A Number To Print Squares Upto The Entered Number : ");
        int n=d.nextInt();
        int current_num = 1;
        while(current_num <=n)
        {
            int sq=current_num*current_num;
            System.out.println(sq+ " ");
            current_num=current_num+1;
        }
        System.out.println();
    }
}
