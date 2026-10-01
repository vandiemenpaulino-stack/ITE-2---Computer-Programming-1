import java.util.Scanner;
public class AveMaxMin1
{ public static void main (String [] args)
   { String name;
     int score1, score2, score3,score4, max, min;
     double Average;

	 Scanner inputDevice = new Scanner (System.in);

     System.out.print("Enter your name: ");
     name = inputDevice.nextLine();

     System.out.print ("Enter your first score: ");
     score1 = inputDevice.nextInt ();

     System.out.print ("Enter your second score: ");
     score2 = inputDevice.nextInt ();

     System.out.print ("Enter your third score: ");
     score3 = inputDevice.nextInt ();

     System.out.print ("Enter your forth score: ");
     score4 = inputDevice.nextInt ();


     Average = (score1 + score2 + score3 + score4) / 4;

     System.out.println();
     System.out.println("Your Average is: " + Average);

     max = score1;
     if (score2 > max) {
		 max = score2; }
	 if (score3 > max) {
		 max = score3; }
     if (score4 > max) {
		 max = score4; }

     min = score1;
     if (score2 < min) {
		 min = score2; }
     if (score3 < min) {
		 min = score3; }
	 if (score4 < min) {
		 min = score4; }

     System.out.println();
	 System.out.println("The Maximum Number is: " + max);
	 System.out.println("The Minimum Number is: " + min);

     System.out.println();
	 if (Average >= 75) {
		 System.out.println("Hello " + name + " Congratulations!! YOU PASSED ");
	    }else{
			System.out.println("Hello " + name + " Im sorry!! YOU FAILED ");



    }
  }
}