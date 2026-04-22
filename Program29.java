// to check whether given character is vowel or consonent

import java.util.*;

public class Program29
{

    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

       char ch ;
        System.out.println("Enter a character");
        ch = sobj.next().charAt(0);
       
        if(ch=='a')
        {
            System.out.println("given character is vowel");
        }
        else if(ch=='e')
        {
            System.out.println("given character is vowel");
        }
        else if(ch=='i')
        {
            System.out.println("given character is vowel");
        }
        else if(ch=='o')
        {
            System.out.println("given character is vowel");
        }
        else if(ch=='u')
        {
            System.out.println("given character is vowel");
        }
        else
        {
            System.out.println("Given character is consonent");
        }
    }
}
