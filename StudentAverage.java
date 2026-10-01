import java.util.Scanner;
public class StudentAverage
{ public static void main (String [] args)
  { Scanner inputDevice = new Scanner (System.in);
    System.out.print ("Enter Score for Exam1: ");
    int exam1 = inputDevice.nextInt ();
    System.out.print ("Enter Score for Exam2: ");
    int exam2 = inputDevice.nextInt ();
    System.out.print ("Enter Score for Exam3: ");
    int exam3 = inputDevice.nextInt ();
    System.out.print ("Enter Score for Exam4: ");
    int exam4 = inputDevice.nextInt ();
    double average = (exam1 + exam2 + exam3 + exam4) / 4.0;
    System.out.println ( "Student's Average Score is: " + average);
  }
}