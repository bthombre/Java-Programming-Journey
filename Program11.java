/*calculating simple interest by using Formula
        si = (P*R*T)/100        */
import java.util.Scanner;

public class Program11
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int principle = 0;
        int rate =0;
        int time = 0;

        System.out.println("Enter Principle amount ");
        principle = sobj.nextInt();
        
        System.out.println("Enter Rate of interest ");
        rate = sobj.nextInt();

        System.out.println("Enter Time Period ");
        time = sobj.nextInt();

        int si = 0;

        si = (principle*rate*time)/100;

        System.out.println("Simple interest for given data is "+si);

    }
}
