public class Try
{
    private static float feet;
    private static int inches;
    static String convertedto;
    public Try()
    {
        feet = 0;
        inches = 0;
        convertedto = "empty";
    }
    public Try(float f, int i)
    {
        feet = f;
        inches = i;
        convertedto = "yet not changed";
    }
    public static float convertedtofeet(Try obj)
    {
        int y = obj.inches;
        float f = y;
        int fts = y/12;;
        
        int ins = (int)(f-fts*12);
        f=fts;
        f+= (float)ins/10;
        convertedto = "feet";
        return f;
    }
    public static int convertedtoinches(Try obj)
    {
        int i;
        int fts = (int)obj.feet;
        int ins = obj.inches;
        convertedto = "inches";
        i = fts*12 + ins;
        return i;
    }
    public String Distance()
    {
        String distance = (int)feet+"\""+inches+"\"";
        return distance;
    }
    public void TryTest()
    {
        Try objforfeet = new Try(5, 2);
        System.out.println("Distance"+objforfeet.Distance()+"is equal to"+convertedtoinches(objforfeet)+" "+convertedto);
        Try objforinches = new Try(0, 16);
        System.out.println("Distance"+objforinches.Distance()+"is equal to"+convertedtofeet(objforinches)+" "+convertedto);
    }
}

