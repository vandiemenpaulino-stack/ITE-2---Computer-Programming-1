import java.util.Scanner;

public class Paulino_Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("Final Project");
        System.out.println("in");
        System.out.println();
        System.out.println("ITE 2 - Computer Proramming 1");
        System.out.println("Compilation of Programming Activities");
		System.out.println("Programmer: Van Paulino, 1/B");
		System.out.println("1st Semeste (2024)");


        while (continueProgram) {
			System.out.println();
			System.out.println("====================================");
            System.out.println("\t Main Menu Option");
		    System.out.println("====================================");
			System.out.println("Activity 1: AveMaxMin");
			System.out.println("Activity 2: Average");
			System.out.println("Activity 3: Biodata");
			System.out.println("Activity 4: CelsiusToFahrenheit");
			System.out.println("Activity 5: Coke");
			System.out.println("Activity 6: Comp2nos");
			System.out.println("Activity 7: Concatenate2");
			System.out.println("Activity 8: Concatenate3");
			System.out.println("Activity 9: Concatenate4");
			System.out.println("Activity 10: Horoscope1");
			System.out.println("Activity 11: Info");
			System.out.println("Activity 12: Iterative1");
			System.out.println("Activity 13: Pi");
			System.out.println("Activity 14: StudentAverage");
			System.out.println("Activity 15: Sum");
			System.out.println("Activity 16: Welcome");
            System.out.println("====================================");
            System.out.println();
			System.out.print("Select an option to compile [1-15]:");



            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AveMaxMin();
                    break;
                case 2:
                    Average();
                    break;
                case 3:
                    Biodata();
                    break;
                case 4:
                    CelsiusToFahrenheit();
                    break;
                case 5:
                    Coke();
                    break;
                case 6:
                    Comp2nos();
                    break;
                case 7:
                    Concatenate2();
                    break;
                case 8:
                    Concatenate3();
                    break;
                case 9:
                    Concatenate4();
                    break;
                case 10:
	                Horoscope1();
                    break;
                case 11:
                    Info();
                    break;
                case 12:
                    Iterative1();
                    break;
                case 13:
                    Pi();
                    break;
                case 14:
                    StudentAverage();
                    break;
                case 15:
                    Sum();
                    break;
                case 16:
                    Welcome();
                    break;


                default:
                    System.out.println("Invalid option. Please select a valid option (1-15).");
                    break;
            }
            System.out.println();
            System.out.print("Do you want to continue? (y/n): ");
            char continueChoice = scanner.next().charAt(0);
            if (continueChoice != 'y' && continueChoice != 'Y') {
                continueProgram = false;
            }
        }
        System.out.println();
        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
    }

    private static void AveMaxMin() {
		System.out.println("Compiling Program 1...");
		System.out.println();
		     String name;
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
			System.out.println("Hello " + name + " Im sorry!! YOU FAILED "); }

			      // Add compilation logic here
    }

    private static void Average() {
		System.out.println("Compiling Program 2...");
		System.out.println();
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

		          // Add compilation logic here
    }

    private static void Biodata() {
        System.out.println("Compiling Program 3...");
        System.out.println();
           String name = "Van Paulino";
		   String address = "Brgy. San Policarpo, P.12,Calbayog City, Samar";
		   String university = "Northwest Samar State University (NwSSU)";
		   String senior = "San Policarpo National High School (SPNHS)";
		   String track = "Science Technology Engineering and Mathematics (STEM) Strand";
		   String birthdate = "August 01, 2006";
		   String age = "eighteenth (18th)";
		   String program = "Bachelor of Science in Computer Science (BSCS)";
		   String department = "College of Computing and Information Sciences (CCIS)";
		   String hobbies = "Playing a guitar, Coding, Listening to music, and Cooking,";
		   String nationality = "Half Filipino, and a Half Spanish,";
		   String religion = "Christian Born Again,";
		   String immersion = "Adventist Hospital Calbayog Incorporated (AHCI)";
		   String pets = "Cats and Dogs";
		   System.out.println("Hi !! ");
		   System.out.println("My name is " + name + " I live in " + address);
		   System.out.println("I'm now a bonafide student at " + university);
		   System.out.println("I'm a recent graduate at " + senior + " where I graduated with high honors ");
		   System.out.println("I was born on " + birthdate + " and, I'm now on my " + age + " level ");
		   System.out.println("pursuing the " + program);
		   System.out.println("In the department of " + department);
		   System.out.println(hobbies + " this are just my mainly to do list whenever I feel anxious ");
		   System.out.println("I'm a " + nationality + " and I used to be " + religion + " but I got baptized in Roman Catholic ");
		   System.out.println("I do have an experience of getting the basic vital signs of the patients back when I was a senior and immersing at");
		   System.out.println(immersion);
		   System.out.println("My favorite pets are " + pets + " and the name of my dog is alphas and the cat is saphla ");
           System.out.println("Thankyou !! ");

                   // Add compilation logic here
    }

    private static void CelsiusToFahrenheit() {
	        System.out.println("Compiling Program 4...");
	        System.out.println();
	        Scanner inputDevice = new Scanner (System.in);
			     System.out.print ("Enter temperature in Celsius: ");
			     double celsius = inputDevice.nextInt();
			     double fahrenheit = (9.0 / 5)* celsius + 32;
                 System.out.println ("Equivalent Fahrenheit Temperature is: " + fahrenheit);

	                   // Add compilation logic here
    }

    private static void Coke() {
        System.out.println("Compiling Program 5...");
        System.out.println();
        Scanner inputDevice = new Scanner (System.in);
		        String item1, item2, item3; double price1, price2, price3, totalPrice;

		            System.out.print("Enter description for item 1: ");
		            item1 = inputDevice.nextLine();
		            System.out.print("Enter price for item 1: ");
		            price1 = inputDevice.nextDouble();
		                     inputDevice.nextLine();

		            System.out.print("Enter description for item 2: ");
				    item2 = inputDevice.nextLine();
					System.out.print("Enter price for item 2: ");
		            price2 = inputDevice.nextDouble();
		                     inputDevice.nextLine();
		            System.out.print("Enter description for item 3: ");
					item3 = inputDevice.nextLine();
					System.out.print("Enter price for item 3: ");
		            price3 = inputDevice.nextDouble();
		                     inputDevice.nextLine();
		            totalPrice = (price1 + price2 + price3);

		            System.out.println("\nItem Details: ");
		            System.out.println("-----------------------------");
		            System.out.println("Item 1: " + item1 + " \t- \tPrice: p" + price1);
		            System.out.println("Item 2: " + item2 + " \t- \tPrice: p" + price2);
		            System.out.println("Item 3: " + item3 + " \t- \tPrice: p" + price3);
		            System.out.println("-----------------------------");
                    System.out.println("Total Price: P" + totalPrice);

                   // Add compilation logic here
    }

    private static void Comp2nos() {
        System.out.println("Compiling Program 6...");
        System.out.println();
        int num1, num2, Total;
			 Scanner inputDevice = new Scanner (System.in);

			 System.out.print("Enter First no.> ");
			 num1 = inputDevice.nextInt();
			 System.out.print("Enter Second no.> ");
			 num2 = inputDevice.nextInt();
		     Total = num1 + num2;
             System.out.println(" Sum is.> " + Total);

                   // Add compilation logic here
    }

    private static void Concatenate2() {
        System.out.println("Compiling Program 7...");
        System.out.println();
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

                    // Add compilation logic here
    }

    private static void Concatenate3() {
	        System.out.println("Compiling Program 8...");
	        System.out.println();
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

	                 // Add compilation logic here
    }

    private static void Concatenate4() {
	        System.out.println("Compiling Program 9...");
	        System.out.println();
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

	                 // Add compilation logic here
    }

    private static void Horoscope1() {
	        System.out.println("Compiling Program 10...");
	        System.out.println();
	        Scanner inputDevice = new Scanner (System.in);
			      String name; int month, day;

			      System.out.print("Enter your name: ");
			      name = inputDevice.nextLine();

			      System.out.print("Enter your month: ");
			      month = inputDevice.nextInt();
			              inputDevice.nextLine();
			      System.out.print("Enter your day: ");
				  day = inputDevice.nextInt();
				        inputDevice.nextLine();

				  System.out.println();
				  if ((month == 3) && (day >= 21) || (month == 4) && (day <= 19)) {
				     System.out.println();
				     System.out.println("Your Zodiac Sign is Aries (RAM)");
				     System.out.println("Congratulations It's your Lucky Day!!" + name); }
				     else if ((month == 4) && (day >= 20) || (month == 5) && (day <= 20)){
			                 System.out.println();
			                 System.out.println("Your Zodiac Sign is Taurus (BULL)");
			         System.out.println("Horray it's your chinese week!!" + name); }
			         else if ((month == 5) && (day >= 21) || (month == 6) && (day <= 21)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Gemini (TWINS)");
			         System.out.println("Happy Lucky Zodiac Day!!" + name); }
			         else if ((month == 6) && (day >= 22) || (month == 7) && (day <= 22)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Cancer (CRAB)");
			         System.out.println("OMG You're going to accomplish Magna Cum LauDAY!!" + name); }
			         else if ((month == 7) && (day >= 23) || (month == 8) && (day <= 22)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Leo (LION)");
			         System.out.println("Congratulations your a Summa Cum LauDAY!!" + name); }
			         else if ((month == 8) && (day >= 23) || (month == 9) && (day <= 22)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Virgo (VIRGIN)");
			         System.out.println("Happy Birthday to you!!" + name); }
			         else if ((month == 9) && (day >= 23) || (month == 10) && (day <= 23)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Libra (BALANCE)");
			         System.out.println("Bravooo its your born Day!!" + name); }
			         else if ((month == 10) && (day >= 24) || (month == 11) && (day <= 21)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Scorpius (SCORPION)");
			         System.out.println("Welcome to the Christian World!!" + name); }
			         else if ((month == 11) && (day >= 22) || (month == 12) && (day <= 19)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Capricorn (GOAT)");
			         System.out.println("Hello hooman I'm CICI proudly saying congratulations!!"); }
			         else if ((month == 12) && (day >= 20) || (month == 1) && (day <= 18)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Aquarius (WATER BEARER)");
			         System.out.println("This Day is your Lucky Day!!" + name); }
			         else if ((month == 1) && (day >= 19) || (month == 2) && (day <= 20)){
					          System.out.println();
					          System.out.println("Your Zodiac Sign is Pisces (FISH)");
                     System.out.println("Merry Birthday hooman!!"); }

	                  // Add compilation logic here
    }

    private static void Info() {
	        System.out.println("Compiling Program 11...");
	        System.out.println();
	        String name;
			   int age;
			   Scanner inputDevice = new Scanner(System.in);
			   System.out.print("Please enter your name: ");
			   name = inputDevice.nextLine();
			   System.out.print("Please aenter your age: ");
			   age = inputDevice.nextInt();
			   System.out.println("Your name is " + name + ", and your age is " + age);

			   	       // Add compilation logic here

    }

    private static void Iterative1() {
	        System.out.println("Compiling Program 12...");
	        System.out.println();
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

	                  // Add compilation logic here
    }

    private static void Pi() {
	        System.out.println("Compiling Program 13...");
	        System.out.println();
	        int r; double pi;
                 Scanner inputDevice = new Scanner(System.in);
			     System.out.println ("Pi Computation");
			     System.out.print("Enter the value of Radius: ");
			     r = inputDevice.nextInt ();
			     pi = (r*r) * 3.1415;
                 System.out.println("The Pi Result is: " + pi);

	                  // Add compilation logic here
    }

    private static void StudentAverage() {
	        System.out.println("Compiling Program 14...");
	        System.out.println();
	        Scanner inputDevice = new Scanner (System.in);
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

      	              // Add compilation logic here
    }

    private static void Sum() {
	        System.out.println("Compiling Program 15...");
	        System.out.println();
	        int num1, num2, Total;

					 Scanner inputDevice = new Scanner(System.in);

					 System.out.print("Enter First no.> ");
					 num1 = inputDevice.nextInt();
					 System.out.print("Enter Second Number.> ");
					 num2 = inputDevice.nextInt();
					 Total = num1 + num2;
		             System.out.println("Sum is.> " + Total);

	       	           // Add compilation logic here
    }

    private static void Welcome() {
	        System.out.println("Compiling Program 16...");
	        System.out.println();
	         { System.out.println("Welcome To Programming Language!! ");}

	         	        // Add compilation logic here

    }
}