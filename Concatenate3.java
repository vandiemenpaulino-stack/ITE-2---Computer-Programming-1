import java.util.Scanner;

   public class Concatenate3 {
       public static void main (String [] args) {

       Scanner inputDevice = new Scanner (System.in);
       String name; double score1, score2, score3, average;

       System.out.print("Please enter your name: ");
       name = inputDevice.nextLine();
       System.out.print("Please enter your first score: ");
       score1 = inputDevice.nextDouble();
       System.out.print("Please enter your second score: ");
       score2 = inputDevice.nextDouble();
       System.out.print("Please enter your third score: ");
       score3 = inputDevice.nextDouble();

       average = (score1 + score2 + score3)/3;

       System.out.println();
       System.out.println("Your name is" + name + " Your score no.1 is: " + score1 + " Your score no.2 is: " + score2 + " Your score no.3 is: " + score3 + " The average score is: " + average);
  }
}


