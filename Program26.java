// to check Elligibility for voting by using age

import java.util.*;

public class Program26
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       int age = 0;
        System.out.println("Enter your age");
        age = sobj.nextInt();
        
        if(age>=18)
        {
            System.out.println("you are elligible to vote");
        }
        else
        {
            System.out.println("you are not elligible to vote");
        }
    }
}
