import java.util.Scanner; // import the scanner

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // initialize the scanner to read input.
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        double priceOfItem = 0; // price of item
        double shippingCosts = 0; // shipping costs
        double totalCost = 0; // total cost of price plus shipping
        String trash = ""; // for if the user provides an invalid output

        // Obtain input
        System.out.println("Enter the price of an item:");
        if (in.hasNextDouble()) {
            // reads the input from user and sets to variable
            priceOfItem = in.nextDouble();

            // checks for if the price is above or below the $100 threshold
            if (priceOfItem >= 100) {
                // sets shipping cost to free if $100 or more
                shippingCosts = 0;

                // sets price of item as total cost since shipping is free
                totalCost = priceOfItem;
            } else {
                // calculates and set shipping cost to 2% of item
                shippingCosts = priceOfItem * 0.02;

                // calculates the total cost
                totalCost = shippingCosts + priceOfItem;
            }

            // outputs the price item, shipping cost and total cost
            System.out.println("You inputted the item price as: " + priceOfItem);
            System.out.println("The shipping cost for your item is: " + shippingCosts);
            System.out.println("The total cost for item and shipping is: " + totalCost);
        }
        else {
            // if the input is invalid, force user to restart program and enter valid input
            trash = in.nextLine();
            System.out.println("Error: You said the price of the item was: " + trash);
            System.out.println("This was an invalid input. Rerun program and input an valid price.");
        }
    }
}