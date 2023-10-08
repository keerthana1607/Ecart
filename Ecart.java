/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ei;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author keerthana
 */
public class Ecart {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        String[] menuOptions = {
            "E-commerce Cart System",
            "1. Add Product to Cart",
            "2. Update Quantity",
            "3. Remove Product from Cart",
            "4. View Cart",
            "5. Checkout",
            "6. Exit"
        };

        while (true) {
            for (String option : menuOptions) {
                System.out.println(option);
                delay(1); // 1-second pause
            }

            System.out.print("Enter your choice: "); // Added statement

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter the quantity for '" + productName + "': ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(productName, productPrice, quantity);
                    System.out.println("Product added to cart. Quantity: " + quantity);
                    delay(1);
                    // 1-second pause
                    System.out.println();
                    break;
                case 2:
                    
                    System.out.print("Enter product name to update quantity: ");
                    String updateProductName = scanner.nextLine();
                    System.out.print("Enter the new quantity: ");
                    int newQuantity = scanner.nextInt();
                    cart.updateQuantity(updateProductName, newQuantity);
                    delay(1); // 1-second pause
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = scanner.nextLine();
                    cart.removeProduct(productToRemove);
                    System.out.println();
                    break;
                case 4:
                    cart.viewCart();
                    System.out.println();
                    break;
                case 5:
                    double totalBill = cart.calculateTotalBill();
                    System.out.println("Your total bill is $" + totalBill);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Sleep for the specified number of seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
