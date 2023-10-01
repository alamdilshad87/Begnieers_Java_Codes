public class aot
{
    public static void main()
    {
        double side1=10.5,side2=15.5,side3=20;
        double area,s=0;
        s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area of Triangle : "+area);
    }
}
