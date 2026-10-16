/* Simple Shopping Cart Program
Take 3 inputs from user - product, price of the item, quantity
Then display the total amount the customer should pay
*/

import java.util.Scanner;

public class Shopping_Cart
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // get product from customer
        System.out.print("What would you like to buy? ");
        String product = scan.nextLine();

        // get price of the item
        System.out.print("What is the cost of the item? (Rs.)? ");
        double price = scan.nextDouble();

        // get the quantity
        System.out.print("How many " + product + " do you need? ");
        int qty = scan.nextInt();

        // calculate total bill = price of the item * quantity
        double total = price * qty;

        System.out.println("\nYou have bought " + qty + " " + product);
        System.out.println("Your total bill amount to is: Rs." + total);

        scan.close();
    }
}