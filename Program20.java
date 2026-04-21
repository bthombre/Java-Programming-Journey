// to calculate electricity bill from number of units consumed

import java.util.*;

public class Program20
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int unit = 0;

        System.out.println("Enter number of units of electricity used");
        unit = sobj.nextInt();

        //1 unit = 3 rupees
        
        int bill = 0;
        bill = unit*3;

        System.out.println("total bill for given units is "+bill);
    }
}
