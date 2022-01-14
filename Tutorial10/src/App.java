public class App {
  public static void main(String[] args) {

    int singular = 69;

    int[] plural;
    plural = new int[3];

    System.out.println(plural[0]);

    plural[0] = 10;
    plural[1] = 20;
    plural[2] = 30;

    System.out.println(plural[0]);
    System.out.println(plural[1]);
    System.out.println(plural[2]);

    for(int i = 0; i < plural.length; i++){
      System.out.println(plural[i]);
    }

    int[] numbers = {1, 2, 3};
    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }

  }
}
