//Cube of number
import java.util.Scanner;

public class Program09
{
    public static void main(String[] args)
    {
        Scanner sobj = new  Scanner(System.in);

        int num = 0;

        System.out.println("Enter a numbers: ");
        num = sobj.nextInt();

        int cube = num*num*num;
        System.out.println("Square of "+num+" is "+cube);
    }
}