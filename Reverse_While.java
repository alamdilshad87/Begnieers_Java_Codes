public class Reverse_While
{
    public static int RE(int n)
    {
        int n2=n;
        int r,q,rn=0;
        while(n2>0)
        {
            q=n2/10;
            r=n2%10;
            rn=rn*10+r;
            n2=q;
        }
        return rn;
    }
    
    public static void main()
    {
        int n1=345;
        int s=0;
        s=RE(n1);
        System.out.println("Reverse Of "+n1 +" Is : "+s);
    }
}

        