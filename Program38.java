// to classify person into (child,adult,Senior) based on age

import java.util.*;

public class Program38
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sobj.nextInt();

        if(age < 18)
        {
            System.out.println("You are a child");
        }
        else if(age < 60)
        {
            System.out.println("You are an Adult");
        }
        else        
        {
            System.out.println("You are a Senior citizen");
        }

    }
}