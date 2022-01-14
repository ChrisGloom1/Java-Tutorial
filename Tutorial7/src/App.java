import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Create scanner object (also check top of document)
    Scanner input = new Scanner(System.in);

    // Output the prompt
    System.out.print("Enter a floating point value: ");

    // Wait for the user to enter something
    double value = input.nextDouble();

    //Tell them what you entered
    System.out.println("You entered " + value);

  }
}
