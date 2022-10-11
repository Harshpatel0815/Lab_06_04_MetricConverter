import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;

        System.out.print("Enter your measurement in meters: ");

        if(in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("This is not a valid input, Try again!");
        }
        miles = (meters/1609.334);
        feet = (meters * 3.281);
        inches = ((meters * 3.281)*12);

        System.out.println("Your measurement in miles is: " + miles + " miles");
        System.out.println("Your measurement in feet is: " + feet + " feet");
        System.out.println("Your measurement in inches is: " + inches + " inches");
    }
}