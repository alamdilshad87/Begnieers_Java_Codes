class First 
{
    static float cube(float a)
    {
        float n = a*a*a;
        return n;
    }
    public void FirstTest()
    {
        float x = 7.5f, y=0;
        y = cube(x);
        System.out.println("the cube of"+x+"is:"+y);
    }
}
