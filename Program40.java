// to check that the person is elligible for Driving license or not

import java.util.*;

public class Program40
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sobj.nextInt();

        if(age > 18)
        {
            System.out.println("Elligible for Driving license");
        }
        else
        {
            System.out.println("Not Elligible for Driving license");
        }

    }
}