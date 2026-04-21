// to calculate average of three numbers

import java.util.*;

public class Program16 {

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Enter three numbers to find average");
        num1 = sobj.nextInt();
        num2 = sobj.nextInt();
        num3 = sobj.nextInt();
        
        double avg = 0;
        avg = (num1+num2+num3)/3;

        System.out.println("Average of given three numbers is " + avg);
    }
}
