public class CalVal
{
    public void CalValTest()
    {
        int orig = 10;
        System.out.println("The orginal value is "+orig);
        System.out.println("Return value of method change() is "+change(orig));
        System.out.println("The value after method change() is over: "+orig);
    }
    public static int change(int a)
    {
        a = 20;
        return a;
    }
}

        