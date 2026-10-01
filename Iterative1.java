import java.util.Scanner;

  public class Iterative1 {
    public static void main (String [] args) {

      int i, num; char ans;
      do {
		    Scanner input = new Scanner (System.in);

		    System.out.println("Programming using Iterative / Loop");
		    System.out.print("Enter a no. you want to display in the list:");
		    num = input.nextInt();
		    System.out.println("\n Nos.       Odd           Even");
		    for (i=1; num >= i; i++)  {
				System.out.printf("\n No.%d        %d             %d", +i, +i*2-1,+i*2);
		    }
		    System.out.println();
		    System.out.println();
		    System.out.print("Do you want to continue? (y/n)");
		    ans = input.next().charAt (0);
		    }
		    while (ans == 'Y' || ans == 'y');
            System.out.println();
            System.out.println("THANKYOU FOR USING THIS PROGRAM");
            System.out.println();
   }
}