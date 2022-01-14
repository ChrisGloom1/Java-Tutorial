import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // int and String are the most common data types to check with switch/case
    System.out.print("Please enter a command: ");
    String text = input.nextLine();

    switch (text) {
      case "start" -> System.out.println("Machine started!");
      case "stop" -> System.out.println("Machine stopped..");
      default -> System.out.println("Unknown command.");
    }
  }
}