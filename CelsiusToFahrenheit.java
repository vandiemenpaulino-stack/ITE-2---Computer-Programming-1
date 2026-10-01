import java.util.Scanner;
public class CelsiusToFahrenheit
{ public static void main (String [] args)
   { Scanner inputDevice = new Scanner (System.in);
     System.out.print ("Enter temperature in Celsius: ");
     double celsius = inputDevice.nextInt();
     double fahrenheit = (9.0 / 5)* celsius + 32;
     System.out.println ("Equivalent Fahrenheit Temperature is: " + fahrenheit);
   }
}