class Switch
{
    public static void main(int d)
    {
        System.out.println("1 for Cube " );
        System.out.println("2 for Cuboid " );
        System.out.println("3 for Sphere  " );
        System.out.println("4 for Cylinder " );
        double v;
        switch(d)
        {
            case 1:
            {
                int c=7;
                v=Math.pow(c,3);
                System.out.println("Cube :  "+v );
                break;
            }
            case 2:
            {
                int l=7,b=9,h=3;
                v=l*b*h;
                System.out.println("Cuboid : "+v );
                break;
            }
            case 3:
            {
                int r=7;
                v=4/3*3.14*Math.pow(r,2);
                System.out.println("Sphere :  "+v );
                break;
            }
            case 4:
            {
                int r=14,h=5;
                v=3.14*Math.pow(r,2)*h;
                System.out.println("Cylinder : "+v );
                break;
            }
            default :
            System.out.println("Wrong Choice ");
    }

}
}
                