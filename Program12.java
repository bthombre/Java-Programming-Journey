// to find the Area of circle

import java.util.Scanner;

public class Program12
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        final double pi = 3.14;
        int r = 0;

        System.out.println("Enter radius of a circle to find its area");
        r = sobj.nextInt();
        
         double area = 0;
          area = pi*r*r;

        System.out.println("area of circle is "+area);
    }
}
