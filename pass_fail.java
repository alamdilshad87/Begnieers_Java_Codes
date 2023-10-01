import java.util.Scanner;
public class pass_fail
{
    public static void main()
    {
        Scanner d = new Scanner(System.in);
        boolean bio=false,phy=false,chem=false,math=false,hindi=false;
        int maths,bios,phys,chems,hind;
        System.out.println("Enter Marks Of Maths : ");
        maths=d.nextInt();
        System.out.println("Enter Marks Of Biology : ");
        bios=d.nextInt();
        System.out.println("Enter Marks Of Physics : ");
        phys=d.nextInt();
        System.out.println("Enter Marks Of Chemistry : ");
        chems=d.nextInt();
        System.out.println("Enter Marks Of Hindi : ");
        hind=d.nextInt();
        if(maths>40 && bios>40 && phys>40 && chems>40 && hind>40)
        {
        System.out.println("You Are Passed ");
        }
        else
        {
        System.out.println("You Are Failed ");      
        }
}
}

        