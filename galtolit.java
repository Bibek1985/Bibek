/*
This is my second program on github.
This program is to show how to convert gallons to liters.
*/
import java.util.*;

class galtolit
{
    public static void main(String args[])
    {
        double liters,gallons;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Number of gallon: ");
        gallons=sc.nextDouble();
        //gallons= 10;

        liters= gallons* 3.7854;

        System.out.println(gallons+ " gallons is " + liters+ " liters. ");

    }
}
