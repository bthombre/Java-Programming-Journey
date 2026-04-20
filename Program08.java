//Square of number
import java.util.Scanner;

public class Program08
{
    public static void main(String[] args)
    {
        Scanner sobj = new  Scanner(System.in);

        int num = 0;

        System.out.println("Enter a numbers: ");
        num = sobj.nextInt();

        int Square = num*num;
        System.out.println("Square of "+num+" is "+Square);
    }
}