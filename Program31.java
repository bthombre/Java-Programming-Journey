// to check whether given number is divisible by 5

import java.util.*;

public class Program31
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       int num;
        System.out.println("Enter a number to check it is divisible by 5");
        num = sobj.nextInt();

        if(num%5==0)
        {
            System.out.println("given number is divisible by 5");
        }
        else
        {
            System.out.println("given number is not divisible by");
        }
    }
}
