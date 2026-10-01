import java.util.Scanner;

   public class Concatenate4 {
       public static void main (String [] args) {

       Scanner inputDevice = new Scanner (System.in);
       String name; double score1, score2, score3, score4, score5, total;

       System.out.print("Please enter your name: ");
       name = inputDevice.nextLine();
       System.out.print("Please enter your first score: ");
       score1 = inputDevice.nextDouble();
       System.out.print("Please enter your second score: ");
       score2 = inputDevice.nextDouble();
       System.out.print("Please enter your third score: ");
       score3 = inputDevice.nextDouble();
       System.out.print("Please enter your forth score: ");
       score4 = inputDevice.nextDouble();
       System.out.print("Please enter your fifth score: ");
       score5 = inputDevice.nextDouble();

       total = (score1 + score2 + score3 + score4 + score5);

       System.out.println();
       System.out.println("The sum is: " + total);

       System.out.println();
       System.out.println("Your name is" + name + " Your score no.1 is: " + score1 + " Your score no.2 is: " + score2 + " Your score no.3 is: " + score3 + " Your score no.4 is: " + score4 + " Your score no.5 is: " + score5 +" The total score is: " + total);

   }
}