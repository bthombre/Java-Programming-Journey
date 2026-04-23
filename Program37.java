// to calculate bonus based on salary

import java.util.*;

public class Program37
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your salary");
        int sal = sobj.nextInt();

        int bonus = 0;
        bonus = 2*sal;

        System.out.println("Your bonus is "+sal+" and total pay you get is "+bonus);

    }
}
