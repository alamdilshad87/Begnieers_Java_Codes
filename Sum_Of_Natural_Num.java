import java.util.Scanner;
public class Sum_Of_Natural_Num
{
    public static void main()
    {
        int current_num=1;
        int sum=0;
        while( current_num<=100)
        {
            sum=sum+current_num;
            current_num=current_num+1;
        }
        System.out.println("The Sum Of The Numbers From 1 To 100 Is : "+sum + "");
    }
}
