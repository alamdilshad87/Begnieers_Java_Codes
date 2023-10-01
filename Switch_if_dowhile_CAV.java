import java.util.*;
public class Switch_if_dowhile_CAV
{
    public void main()
    {
        Scanner read = new Scanner(System.in);
        System.out.print("HOW MANY TIMES YOU WANT TO DO IT: ");
        int n = read.nextInt();
        int x=1;
        
        do
        {
            
            
            System.out.println("PRESS 'R' FOR AREA OF RECTANGLE!");
            System.out.println("PRESS 'T' FOR AREA OF TRIANGLE!");
            System.out.println("PRESS 'C' FOR AREA OF CIRCLE!");
            System.out.println("PRESS 'TR' FOR AREA OF TRAPEZIUM!");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("ENTER YOUR CHOICE AS PER GIVEN ABOVE: ");
            String ckp = read.next();
            switch(ckp)
            {
                  case "R":
                  System.out.print("ENTER THE LENGTH: ");
                  float l = read.nextFloat();
                  System.out.print("ENTER THE WIDTH: ");
                  float w = read.nextFloat();
                  float ar = AreaofRect(l, w);
                  System.out.println("AREA OF THE RECTANGLE = "+ar+"unit square");
                  break;
                  case "T":
                  System.out.print("ENTER THE HEIGHT: ");
                  float h = read.nextFloat();
                  System.out.print("ENTER THE BASE: ");
                  float b = read.nextFloat();
                  float at = AreaofTri(h, b);
                  System.out.println("AREA OF THE TRIANGE = "+at+"unit square");
                  break;
                  case "C": 
                  System.out.print("ENTER THE RADIUS: ");
                  float r = read.nextFloat();
                  float ac = AreaofCir(r);
                  System.out.println("AREA OF THE CIRCLE = "+ac+"unit square");
                  break;
                  case "TR":
                  System.out.print("ENTER THE LENGTH OF FIRST || SIDES: ");
                  float lp1 = read.nextFloat();
                  System.out.print("ENTER THE LENGTH OF 2ND || SIDES: ");
                  float lp2 = read.nextFloat();
                  System.out.print("ENTER THE HEIGHT: ");
                  float ht = read.nextFloat();
                  float atr = AreaofTrap(lp1, lp2, ht);
                  System.out.println("AREA OF THE TRAPEZIUM = "+atr+"unit square");
                  break;
                  default:
                  System.out.println("INVALID CHOICE!!!");
                  break;
            }
            ++x;
                   
            
        }while(x<=n);
    }
    public float AreaofRect(float l1, float l2)
    {
        float aor = l1*l2;
        return aor;
        
    }
    public float AreaofTri(float h1, float b2)
    {
        float aot = ((h1*b2)/2);
        return aot;
    }
    public float AreaofCir(float r1)
    {
        float aoc = ((22/7)*r1*r1);
        return aoc;
    }
    public float AreaofTrap(float l1p, float l2p, float ht1)
    {
        float aotr = (((l1p+l2p)*ht1)/2);
        return aotr;
    }
        
}
