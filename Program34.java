// to calculate discount on purchase amount 

import java.util.*;

public class Program34 
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        int amnt = 0;
        System.out.println("Enter purchase amount");
        amnt = sobj.nextInt();

        int per = 0;
        System.out.println("Enter percentage of discount");
        per = sobj.nextInt();

        int dis = 0;
        dis = amnt*per/100;

        System.out.println("discount on given purchase amount is "+dis);
        
    }
}
