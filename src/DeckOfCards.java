import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        // Define the suits and ranks of the cards
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        char continueChoice;
        
        do {
            System.out.print("Enter Card Number (1-52): ");
            // Check if the next input is an integer
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number. Please enter a number between 1 and 52: ", input);
            }
            int cardNumber = scanner.nextInt() - 1; // Array starts at 0, so subtract 1
            
            // Check if the entered number is within the valid range
            if (cardNumber < 0 || cardNumber > 51) {
                System.out.println("Invalid card number. Please enter a number between 1 and 52.");
            } else {
                // Calculate the suit and rank of the card
                String suit = suits[cardNumber / 13];
                String rank = ranks[cardNumber % 13];
                // Display the result
                System.out.println("Your selected card is " + rank + " of " + suit);
            }
            
            // Ask user if they want to continue
            System.out.println("Do you want to pick another card? (Y/N): ");
            continueChoice = scanner.next().toUpperCase().charAt(0);
            
            // Consume the newline character
            scanner.nextLine();
            
        } while (continueChoice == 'Y'); // Continue until user inputs 'N'
        
        System.out.println("Thank you for using the Deck of Cards program!");
        
        // Close the scanner
        scanner.close();
    }
}