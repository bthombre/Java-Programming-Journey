// to check user login is successfull or not  

import java.util.*;

public class Program35
{

    public static void main(String ar[]) {
        Scanner sobj = new Scanner(System.in);

        // login id = badrithombre Password  = Pass@1234

        System.out.println("Enter your login id");
        String id = sobj.nextLine();

        System.out.println("Enter your Password");
        String pass = sobj.nextLine();

        if(id == "badrithombre" && pass == "Pass@1234")
        {
            System.out.println("Login successfully!");
        }
        else
        {
            System.out.println("Login failed!\nPlease enter valid id or password");
        }
    }
}
