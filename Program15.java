// to convert days into years

import java.util.*;

public class Program15
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

      int days = 0;

        System.out.println("Enter number of days");
        days = sobj.nextInt();

        double year = 0.0;
        year = days/365;

        System.out.println("total years of given days are "+year);
    }
}
