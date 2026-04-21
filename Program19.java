// to calculate total salary with allowounces

import java.util.*;

public class Program19
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int salary = 0;

        System.out.println("Enter your salary");
        salary = sobj.nextInt();
       
       /* DA = 12% 
          HRA = 10% */
        
        int DA = 0;
        int HRA = 0;

        DA = salary*12/100;
        HRA = salary*10/100;

        int total = 0;
        total =salary+DA+HRA;

        System.out.println("total salary with allowances is "+total);
        
    }
}
