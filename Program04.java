//Addition
import java.util.Scanner;

public class Program04
{
    public static void main(String[] args)
    {
        Scanner sobj = new  Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter first numbers: ");
        num1 = sobj.nextInt();
        System.out.println("Enter second number");
        num2 = sobj.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is: "+sum);
    }
}