import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    /*
    System.out.print("Enter a number: ");
    int value = input.nextInt();

    while(value != 5){
      System.out.print("Enter a number: ");
      value = input.nextInt();
    }*/
    int value = 0;
    do {
      System.out.print("Enter a number: ");
      value = input.nextInt();
    }
    while(value != 5);
    System.out.println("Finally got 5!");

  }
}
