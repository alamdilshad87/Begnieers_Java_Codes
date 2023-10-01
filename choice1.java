import java.util.Scanner;
public class choice1
{
    public static void main()
    {
        int ch;
        Scanner d=new Scanner(System.in);
        System.out.println("1 For Rectangle ");
        System.out.println("2 For Triangle ");
        System.out.println("3 For Circle ");
        System.out.println("4 For Square ");
        System.out.print("Enter Your Choice : ");
        ch=d.nextInt();
if(ch==1)
            {
               int r;
               System.out.println("\t"+"\t"+"\t"+"Rectangle ");
               System.out.println("1 For Area Of Rectangle ");
               System.out.println("2 For Perimeter Of Rectangle ");
               System.out.print("Enter Your Choice : ");
               r=d.nextInt();
        if(r==1)
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
        if(r==2)
              {
                  int l,b,por;
                  System.out.println("\t"+"\t"+"\t"+" Perimeter Of Rectangle ");
                  System.out.print("Enter The Length : ");
                  l=d.nextInt();
                  System.out.print("Enter The Breadth : ");
                  b=d.nextInt();
                  por=2*(l+b);
                  System.out.print("Perimeter Of Rectangle :"+por);
              }
        }
if(ch==2)
        {
               int r;
               System.out.println("\t"+"\t"+"\t"+"Triangle ");
               System.out.println("1 For Area Of Triangle ");
               System.out.println("2 For Perimeter Of Triangle ");
               System.out.print("Enter Your Choice : ");
               r=d.nextInt();
        if(r==1)
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
        if(r==2)
              {
                  int s1,s2,s3,pot;
                  System.out.println("\t"+"\t"+"\t"+" Perimeter Of Triangle ");
                  System.out.print("Enter The 1st Side : ");
                  s1=d.nextInt();
                  System.out.print("Enter The 2nd Side : ");
                  s2=d.nextInt();
                  System.out.print("Enter The 3rd Side : ");
                  s3=d.nextInt();
                  pot=s1+s2+s3;
                  System.out.print("Perimeter Of Rectangle :"+pot);
              }
        }
if(ch==3)
        {
               int c;
               System.out.println("\t"+"\t"+"\t"+"Circle ");
               System.out.println("1 For Area Of Circle ");
               System.out.println("2 For Circumference Of Circle ");
               System.out.print("Enter Your Choice : ");
               c=d.nextInt();
        if(c==1)
              {
                  double r,aoc;
                  System.out.println("\t"+"\t"+"\t"+" Area Of Circle ");
                  System.out.print("Enter The Radius : ");
                  r=d.nextInt();
                  aoc=3.14*(r*r);
                  System.out.print("Area Of Circle :"+aoc);
              }
        if(c==2)
              {
                  double r,coc;
                  System.out.println("\t"+"\t"+"\t"+" Circumference Of Circle ");
                  System.out.print("Enter The Radius : ");
                  r=d.nextInt();
                  coc=2*3.14*r;
                  System.out.print("Circumference Of Circle :"+coc);
              }
        }
if(ch==4)
        {
               int cho;
               System.out.println("\t"+"\t"+"\t"+" Square ");
               System.out.println("1 For Area Of Square ");
               System.out.println("2 For Perimeter Of Square ");
               System.out.print("Enter Your Choice : ");
               cho=d.nextInt();
        if(cho==1)
              {
                  int s,aos;
                  System.out.println("\t"+"\t"+"\t"+" Area Of Square ");
                  System.out.print("Enter The Side : ");
                  s=d.nextInt();
                  aos=s*s;
                  System.out.print("Area Of Square :"+aos); 
              }
        if(cho==2)
              {
                  int s1,pos;
                  System.out.println("\t"+"\t"+"\t"+" Perimeter Of Square ");
                  System.out.print("Enter The Side : ");
                  s1=d.nextInt();
                  pos=4*s1;
                  System.out.print("Perimeter Of Square :"+pos); 
              }
        }
}
}