// to check given number is zero or non-zero

import java.util.*;

public class Program33 {

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter a number");
        num = sobj.nextInt();

        if (num == 0) {
            System.out.println("given number is zero");
        } else {
            System.out.println("given number is non-zero");
        }
    }
}
