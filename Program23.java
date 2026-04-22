// to check greatest in three numbers

import java.util.*;

public class Program23
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Enter three numbers to check greatest from them");
        num1 = sobj.nextInt();
        num2 = sobj.nextInt();
        num3 = sobj.nextInt();

        if(num1>num2)
        {
            if(num1>num3)
            {
            System.out.println("num1 is greatest");
            }
        }
        else if(num2>num3)
        {
            System.out.println("num2 is greatest");
        }
        else
        {
            System.out.println("num3 is greatest");
        }
    }
}
