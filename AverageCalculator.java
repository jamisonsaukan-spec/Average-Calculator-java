Faculty     :Science
program     :Bachelors of education
Department  :Computer study
course code :COM 312
From        :Jamison Saukan
TO          :MR.G.Mkwapatira
REG NO      :NCE/SCI/096/23
Task        :write the program that calculate the average of four number entered bt user
            
            CODE OF A PROGRAM
// program to calculate the average of 4 numbers after getting from the user
import java.util.Scanner;
// Define the main class(AverageCalculator)
public class AverageCalculator { 
 // Entry point of program(This is where execution starts)  
    public static void main(String[] args){
        //creating Scanner object to read input  
        Scanner input = new Scanner (System.in);
// Tell the user to enter the first number
System.out.print("Enter first number;");
double num1 = input.nextDouble();
// Ask the user to enter second number
System.out.print("Enter second number:");
double num2 = input.nextDouble();
// prompt the user to enter third number
System.out.print("Enter third number:");
double num3 = input.nextDouble();
// Qet last user number (fourth number)
System.out.print("Enter last number:");
double num4 = input.nextDouble();
// Calculate the average of 4 numbers
double average = (num1+num2+num3+num4)/4;
// Show the result on the screen
System.out.println("The average of the four numbers is:" + average);
// Close the scanner to free system resources
input.close();
    }
}