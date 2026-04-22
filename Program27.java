// to check student is pass or fail

import java.util.*;

public class Program27
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       int marks = 0;
        System.out.println("Enter your marks out of 100");
        marks = sobj.nextInt();
        
        //passing is on 35 marks out off 100

        if(marks>=35)
        {
            System.out.println("you are pass");
        }
        else
        {
            System.out.println("you are fail!\nBetter luck next time");
        }
    }
}
