/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ei;
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author keerthana
 */
public class Cart {
    
    private List<Product> products;
    private Scanner scanner;

    public Cart() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
public void addProduct(String productName, double productPrice, int quantity) {
        Product product = new Product(productName, productPrice, quantity);
        products.add(product);
    // Consume the newline character

        
        
        pauseForSeconds(1);
    }

    public void updateQuantity(String productName, int newQuantity) {
    for (Product product : products) {
        if (product.getName().equalsIgnoreCase(productName)) {
            product.setQuantity(newQuantity);
            System.out.println("Quantity updated for " + productName + " to " + newQuantity);
            return;
        }
    }
    System.out.println("Product not found in the cart: " + productName);
}


    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                products.remove(product);
                System.out.println("Product '" + productName + "' removed from the cart.");
                pauseForSeconds(1);
                return;
            }
        }
        System.out.println("'" + productName + "' is not found in the cart.");
        pauseForSeconds(1);
    }

    public void viewCartContents() {
        System.out.println("Cart Contents:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " x" + product.getQuantity());
        }
        pauseForSeconds(1);
    }
public void viewCart() {
    System.out.println("Cart Contents:");
    for (Product product : products) {
        System.out.println(product.getName() + " - $" + product.getPrice() + " x" + product.getQuantity());
    }
}

    public double calculateTotalBill() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    private void pauseForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
    }

    void updateQuantity(String productToUpgrade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
