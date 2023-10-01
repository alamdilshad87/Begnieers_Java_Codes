import java.util.Scanner;
public class choice
{
    public static void main()
    {
        int ch;
        Scanner d=new Scanner(System.in);
        System.out.println("1 For Area Of Rectangle ");
        System.out.println("2 For Area Of Triangle ");
        System.out.println("3 For Area Of Circle ");
        System.out.println("4 For Simple Interest ");
        System.out.print("Enter Your Choice : ");
        ch=d.nextInt();
        {
        if(ch==1)
        {
            int l,b,aor;
            System.out.println("\t"+"\t"+"\t"+" Area Of Rectangle ");
            System.out.print("Enter The Length : ");
            l=d.nextInt();
            System.out.print("Enter The Breadth : ");
            b=d.nextInt();
            aor=l*b;
            System.out.print("Area Of Rectangle :"+aor);
        }
        if(ch==2)
        {
            int b,h,aot;
            System.out.println("\t"+"\t"+"\t"+" Area Of Triangle ");
            System.out.print("Enter The Base : ");
            b=d.nextInt();
            System.out.print("Enter The Height : ");
            h=d.nextInt();
            aot=(b*h)/2;
            System.out.print("Area Of Triangle :"+aot);
        }
        if(ch==3)
        {
            double r,aoc;
            System.out.println("\t"+"\t"+"\t"+" Area Of Circle ");
            System.out.print("Enter The Radius : ");
            r=d.nextInt();
            aoc=3.14*(r*r);
            System.out.print("Area Of Circle :"+aoc);
        }
        if(ch==4)
        {
            int p,r,t,si;
            System.out.println("\t"+"\t"+"\t"+" Simple Intrest ");
            System.out.print("Enter The Principal : ");
            p=d.nextInt();
            System.out.print("Enter The Rate : ");
            r=d.nextInt();
            System.out.print("Enter The Amount : ");
            t=d.nextInt();
            si=(p*r*t)/100;
            System.out.print("Simple Interest :"+si);
        }
    
        else
        System.out.println("Wrong Choice ");
    }
}
}
