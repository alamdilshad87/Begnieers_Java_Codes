public class DemoFnCalls
{
    public static int x = 10;
    public static int y = 30;
    public void DemoTest()
    {
        System.out.println("values iniially are x="+x+"and y="+y);
        callbyval(x, y);
        System.out.println("values after method callbyval() are x="+x+"and y="+y);
        DemoFnCalls ckp = new DemoFnCalls();
        callbtref(ckp);
        System.out.println("values after method callbyref() are x="+x+"and y="+y);
    }
    public static void callbyval(int p, int q)
    {
        int con=p;
        p=q;
        q=con;
        System.out.println("values inside callbyval() method are x="+p+"and y="+q);
    }
    public static void callbtref(DemoFnCalls scan)
    {
        int con = scan.x;
        scan.x = scan.y;
        scan.y = con;
        System.out.println("values inside callbyref() method are x="+scan.x+"and y="+scan.y);
    }
}

    
            
        