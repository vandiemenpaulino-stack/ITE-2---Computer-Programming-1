import java.util.Scanner;

   public class Coke {
        public static void main (String [] args) {

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

		}
	}
