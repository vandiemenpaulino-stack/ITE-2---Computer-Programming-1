import java.util.Scanner;

  public class Concatenate2 {
     public static void main (String [] args) {

     Scanner inputDevice = new Scanner (System.in);
     String name, gender, email, phone; int age;

     System.out.print("Please enter your name: ");
	 name = inputDevice.nextLine();
	 System.out.print("Please aenter your age: ");
     age = inputDevice.nextInt();
           inputDevice.nextLine();
     System.out.print("Please enter your gender: ");
     gender = inputDevice.nextLine();
     System.out.print("Please aenter your email: ");
     email = inputDevice.nextLine();
     System.out.print("Please aenter your phone: ");
     phone = inputDevice.nextLine();

     System.out.println();
     System.out.println("Hi !");
     System.out.println("My name is" + name + " I'm " + age + " year's old, and I'm a " + gender + " My email is " + email + " My number is " + phone);
     System.out.println("Thankyou !");
  }
}
