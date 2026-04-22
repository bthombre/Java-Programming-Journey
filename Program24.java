// to check greatest in two numbers

import java.util.*;

public class Program24
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;


        System.out.println("Enter three numbers to check greatest from them");
        num1 = sobj.nextInt();
        num2 = sobj.nextInt();

        if(num1>num2)
        {
        
            System.out.println("num1 is greatest");
        
        }
        else 
        {
            System.out.println("num2 is greatest");
        }
        
    }
}
