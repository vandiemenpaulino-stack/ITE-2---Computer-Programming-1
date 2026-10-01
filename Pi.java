import java.util.Scanner;
public class Pi
{ public static void main (String [] args)
   { int r; double pi;
     Scanner inputDevice = new Scanner (System.in);
     System.out.println ("Pi Computation");
     System.out.print("Enter the value of Radius: ");
     r = inputDevice.nextInt ();
     pi = (r*r) * 3.1415;
     System.out.println("The Pi Result is: " + pi);
   }
}