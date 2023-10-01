import java.util.Scanner;
public class divisible
{
    public static void main()
    {
        Scanner d= new Scanner(System.in);
        boolean div2=false,div4=false,div5=false;
        int n,ld,l2d;
        System.out.println("Enter An Integer : ");
        n=d.nextInt();
        ld=n%10;
        l2d=n%100;
        if(ld==0 || ld==2 || ld==4 || ld==6 || ld==8 )
        {
            div2=true;
        }
        if(ld==0 || ld==5)
        {
            div5=true;
        }
        if(l2d % 4 == 0)
        {
            div4=true;
        }
        if(div2==true && div5==true && div4==true)
        
             System.out.println(n+" Is Divisible By 2,4 And 5 ");
            else 
             System.out.println(n+" Is Not Divisible By 2,4 And 5 ");
            }
        }