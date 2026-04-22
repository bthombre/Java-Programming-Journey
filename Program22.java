// to check number is positive negative or zero

import java.util.*;

public class Program22
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter a number to check it is positive negative or zero");
        num = sobj.nextInt();

        if(num>0)
        {
            System.out.println("Given number is Positive");
        }
        else if(num<0)
        {
            System.out.println("Given number is negative");
        }
        else
        {
            System.out.println("Given number is zero");
        }
    }
}
