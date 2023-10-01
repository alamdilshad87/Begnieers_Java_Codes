import java.util.Scanner;
public class Sides
{
    public static void Type(int sides)
    {
        
        System.out.print("Figures with "+sides+"  sides");
        switch(sides)
        {
            case 6 :
            System.out.print("Hexagon");
            break;
            case 5 :
            System.out.println("Pentagon");
            break;
            case 4 :
            System.out.print("Rectangle");
            break;
            case 3 :
            System.out.print(" Triangle");
            break;
        }
    }
    public static void main()
    {
        int sides;
        Scanner d=new Scanner(System.in);
        System.out.print("Enter Number Of Sides : ");
        sides=d.nextInt();
        Type(sides);
    }
}
         