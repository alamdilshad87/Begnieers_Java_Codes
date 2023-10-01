public class yard_miles
{
    public static void main()
    {
        final double yard=3.0;
        final double mile=1760;
        double distf=1056;
        double distm=0;
        double disty=0;
        disty=distf/yard;
        distm=disty/mile;
        System.out.println("1056 feet are equal to"+disty+"yards");
        System.out.println("1056 feet are equal to"+distm+"miles");
    }
}
