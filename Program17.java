// to calculate total marks of five subjects

import java.util.*;

public class Program17 
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;
        int m5 = 0;

        System.out.println("Enter marks of first subject");
        m1 = sobj.nextInt();
        System.out.println("Enter marks of first subject");
        m2 = sobj.nextInt();
        System.out.println("Enter marks of first subject");
        m3 = sobj.nextInt();
        System.out.println("Enter marks of first subject");
        m4 = sobj.nextInt();
        System.out.println("Enter marks of first subject");
        m5 = sobj.nextInt();

        int total = 0;
        total = m1 + m2 + m3 + m4 + m5;

        System.out.println("total marks of given five subjects are " + total);
    }
}
