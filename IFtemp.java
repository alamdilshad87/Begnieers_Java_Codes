public class IFtemp
{
    public static void main(int choice)
    {
       //1 For -C to -F and 2for vice versa 
       // temp to be converted is 98.4-F or 37-C
       double tempC,tempF;
       if (choice==1)
       {
           tempC=37;
           tempF=(tempC*1.8F)+32;
           System.out.println("Temperature in Farhenheit is : "+tempF);
        }
       else if (choice==2)
       {
           tempF=98.4;
           tempC=(tempF-32)/1.8F;
           System.out.println("Temperature in Celsius is : "+tempC);
        }
        else
        System.out.println("Enter 1 for C- to F- aand 2 for F- to C- conversion");
    }
}
      