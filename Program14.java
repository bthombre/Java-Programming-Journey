// to convert temprature from celcius to fahrenheit

import java.util.*;

public class Program14
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        float tempC =0.0f;
        
        System.out.println("Enter temprature in celcius");
        tempC = sobj.nextInt();
        
         double tempf =0.0;
         tempf = (tempC*9/5)+32;

        System.out.println("temprature in farenheit is "+tempf);
    }
}
