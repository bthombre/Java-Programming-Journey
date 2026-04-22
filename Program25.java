// to check given year is leap year or not

import java.util.*;

public class Program25
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       int year = 0;
        System.out.println("Enter three numbers to check greatest from them");
        year = sobj.nextInt();
        
        double res = 0.0;
        res = year/4;
        
        if(res==0)
        {
            System.out.println("Given year is a leap year");
        }
        else
        {
            System.out.println("Given year is not a leap year");
        }
    }
}
