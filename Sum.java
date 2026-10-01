import java.util.Scanner;
public class Sum
 {
	 public static void main (String [] args)
	 {
		 int num1, num2, Total;

		 Scanner inputDevice = new Scanner(System.in);

		 System.out.print("Enter First no.> ");
		 num1 = inputDevice.nextInt();
		 System.out.print("Enter Second Number.> ");
		 num2 = inputDevice.nextInt();
		 Total = num1 + num2;
		 System.out.println("Sum is.> " + Total);
      }
}
