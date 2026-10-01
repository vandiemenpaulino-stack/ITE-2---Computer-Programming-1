import java.util.Scanner;

public class Average{
	public static void main (String [] args){
		int num1, num2, Total, Div;

     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Enter First no.> ");

   	 num1 = inputDevice.nextInt();
   	 System.out.print("Enter Second no.> ");

   	 num2 = inputDevice.nextInt();

     Total = num1 + num2;
     System.out.println("Sum is.> " + Total);

     Div = num1 + num2;

     System.out.println("Average is.> " + Div);
  }
}