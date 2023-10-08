# Ecart
- Initializes a `Scanner` for user input and a `Cart` object to manage a shopping cart.
- Defines an array of menu options for an e-commerce cart system.
- Enters an infinite loop for displaying and handling menu options.
- Prints the menu options with a 1-second delay for each option.
- Asks the user to enter their choice from the menu.
- Reads the user's choice and consumes the newline character.
Switch Statement
  - Executes different actions based on the user's choice:
  - Case 1: Adds a product to the cart, prompting the user for product details.
  - Case 2: Updates the quantity of a product in the cart.
  - Case 3: Removes a product from the cart.
  - Case 4: Views the contents of the cart.
  - Case 5: Calculates and displays the total bill.
  - Case 6: Exits the program.
  - Default: Handles invalid choices.
- Defines a method to introduce a delay for a specified number of seconds using `Thread.sleep`.
# Cart
Fields:
   - `products`: A list to store `Product` objects representing items in the shopping cart.
   - `scanner`: A `Scanner` object for user input.
-Constructor Initializes an empty list of products and a `Scanner` object for user input.
- Adds a new product to the shopping cart with the specified name, price, and quantity.
- Creates a `Product` object and adds it to the list of products.
- Pauses for 1 second after adding the product.
- Updates the quantity of a product in the cart based on the product name.
- Iterates through the list of products and finds the matching product by name.
- Sets the new quantity for the product and prints a confirmation message.
- Pauses for 1 second after updating the quantity.
- Removes a product from the cart based on the product name.
- Iterates through the list of products and removes the matching product by name.
- Prints a confirmation message after removal.
- Pauses for 1 second after removing the product.
- Displays the contents of the cart, including product names, prices, and quantities.
- Pauses for 1 second after displaying the contents.
- Displays the contents of the cart, including product names, prices, and quantities.
- Calculates the total bill for all products in the cart by summing the product prices multiplied by their quantities.
- Returns the total bill amount.
- Provides a method to pause the program for a specified number of seconds using `Thread.sleep`.
