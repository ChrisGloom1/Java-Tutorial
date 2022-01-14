public class Application {
  public static void main(String[] args) {
    int myInt = 4;
    double myDouble = 6.9;
    String myString = "Follow the white rabbit,";
    String blank = " ";
    String name = "Neo";
    String greeting = myString + blank + name;

    System.out.println(greeting);
    System.out.println("Neo" + "." + blank + myString);
    System.out.println("My number is " + myDouble);
  }
}
