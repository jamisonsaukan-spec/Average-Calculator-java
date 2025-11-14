/* Jamison Saukan NCE/SCI/096/23*/
import java.util.Scanner; // Import Scanner class to get input from user

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        double sum = 0; // Initialize sum variable to store the total of numbers

// Loop  function to get 4 numbers from the user
    for (int i = 1; i <= 4; i++) {
        System.out.print("Enter number " + i + ": "); // Tell the user to enter a number
        sum += scanner.nextDouble(); // Read  entered number and add it to sum
        }

   double average = sum / 4; // Calculate average by dividing sum by 4
    System.out.println("The average of four entered numbers is: " + average); // Display the average

        scanner.close(); // Close the scanner to free resources
    }
}
