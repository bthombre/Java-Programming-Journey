//Division
import java.util.Scanner;

public class Program07
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

        int Division = num1/num2;
        System.out.println("Division is: "+Division);
    }
}