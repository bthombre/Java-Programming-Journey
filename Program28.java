// to calculate grade of student based on marks

import java.util.*;

public class Program28
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       int marks = 0;
        System.out.println("Enter your marks out of 100");
        marks = sobj.nextInt();
        
        /*passing is on 35 marks out off 100
        marks >=90 grade A
        marks >=75 grade B
        marks >=60 grade C
        marks >=35 grade D
        marks <35 grade F
        */
        if(marks>=90)
        {
            System.out.println("Grade A");
        }
        else if(marks>=75)
        {
            System.out.println("Grade B");
        }
        else if(marks>=60)
        {
            System.out.println("Grade C");
        }
        else if(marks>=35)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
