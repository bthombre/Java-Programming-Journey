// to check whether given number is divisible by 10

import java.util.*;

public class Program32
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       int num = 0;
        System.out.println("Enter a number to check it is divisible by 10");
        num = sobj.nextInt();

        if(num%10==0)
        {
            System.out.println("given number is divisible by 10");
        }
        else
        {
            System.out.println("given number is not divisible by 10");
        }
    }
}
