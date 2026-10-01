import java.util.Scanner;

   public class HOROSCOPE1 {
      public static void main (String [] args) {

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

	 }
 }
