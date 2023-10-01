import java.util.Scanner;
public class week_day_end
{
    public static void week(int day)
    {
        switch(day)
        {
        case 1 :
        case 7 :
        System.out.println("It Is Weekend ");
        break;
        case 2 :
        case 3 :
        case 4 :
        case 5 :
        case 6 :
        System.out.println("It Is Weekday ");
        break;
        default :
        System.out.println("Invalid day Number ");
     }
}      
    public static void main()
    {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter Day Number : ");
        int daynum=k.nextInt();
        week(daynum);
    }
}
        