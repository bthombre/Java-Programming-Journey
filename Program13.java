// to find the Area of Rectangle

import java.util.Scanner;

public class Program13
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int breadth = 0;


        System.out.println("Enter length of a rectangle");
        length = sobj.nextInt();
        System.out.println("Enter breadth of a rectangle");
        breadth = sobj.nextInt();

        
         double area = 0;
          area = length*breadth;

        System.out.println("area of circle is "+area);
    }
}
