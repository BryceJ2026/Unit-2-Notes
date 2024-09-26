import java.util.Scanner; // import the Scanner class

public class Main{

public static void main (String []args) {
   System.out.println("Testing methods that RETURN values...");

   // Construct a Scanner object
   // note: System.in() is the computer's keyboard!
   Scanner scan = new Scanner(System.in);

   // Take input with the Scanner methods
   System.out.println("Enter some text: ");
   String inputStr = scan.nextLine();
   System.out.println("Enter a whole number: ");
   int inputInt = scan.nextInt();
   System.out.println("Enter a decimal.number: ");
   double inputDouble = scan.nextDouble();

   // Handle the user input (do something with the values)
   // Use athe value in a print statement
   System.out.prinln("You entered: " + inputStr);
   // Use values in an expression
   in sum = inputInt + inputDouble;
   
   }
}