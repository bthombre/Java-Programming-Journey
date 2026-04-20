//Swapping with using third variable
import java.util.Scanner;

public class Program10
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

        System.out.println("Before swapping \nNum1 = "+num1+" Num2 = "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping\nNum1 = "+num1+" Num2 = "+num2);
    }
}