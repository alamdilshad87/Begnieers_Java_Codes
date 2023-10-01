import java.util.Scanner;
public class nextedifmedian
{
    public static void main()
    {
        Scanner d=new Scanner (System.in);
        int n1,n2,n3,med=0;
        System.out.println("Enter  integers ");
        n1=d.nextInt();
        n2=d.nextInt();
        n3=d.nextInt();
        med=median (n1,n2,n3);
        System.out.println("Median number of 3 no are : "+med );
        
    }
    public static int median(int x,int y,int z)
    {
        if(x<y)
        {
            if(z<x)
            {
                return x;
            }
            else if (y<z)
            {
                return y;
            }
            else
            {
                //y<z<x
                return z;
            }
        }
        else
        {
            if(z<y)
            {
                return y;
            }
            else if(x<z)
            {
                return x;
            }
            else 
            {
                //y<z<x
                return z;
            }
        }
    }
}


        