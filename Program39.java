// to check that the customer is elligible to free shipping or not

import java.util.*;

public class Program39
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter order amount:");
        int amnt = sobj.nextInt();

        if(amnt > 500)
        {
            System.out.println("This customer is elligible for free shipping");
        }
        else
        {
            System.out.println("This customer is not elligible for free shipping");
        }

    }
}