import java.util.Scanner;
public class No_Of_Days
{
public static  void Week(int dow)
{
    String ans;
    switch(dow)
    {
        case 1 :
            ans=" Sunday";
            break;
        case 2 :
            ans=" Monday";
            break;
        case 3 :
            ans=" Tuesday";
            break;
        case 4 :
            ans=" Wednsday";
            break;
        case 5 :
            ans=" Thursday";
            break;
        case 6 :
            ans=" Friday";
            break;
        case 7 :
            ans=" Saturday";
            break;
            default : ans="Wrong Day Number ";
        }
         System.out.println("Day Number "+dow+" Is "+ans); 
    }
    
}