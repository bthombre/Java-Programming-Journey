// to check given day is weekend or weekday

import java.util.*;

public class Program36
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a day");
        String day = sobj.nextLine();
        
        if(day == "Saturday")
        {
            System.out.println("Given day is weekend");
        }
        else if(day == "Sunday")
        {
            System.out.println("Given day is weekend");
        }
        else
        {
            System.out.println("given day is week day");
        }
    }
}
