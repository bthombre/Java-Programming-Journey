// to check number is even or odd

import java.util.*;

public class Program21
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter a number to check it is even or odd");
        num = sobj.nextInt();

        if(num%2==0)
        {
            System.out.println("Given number is Even!");
        }
        else
        {
            System.out.println("Given number is odd");
        }
    }
}
