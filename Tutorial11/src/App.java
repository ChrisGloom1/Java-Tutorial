public class App {
  public static void main(String[] args) {

    String[] words = new String[3];
    words[0] = "Hello";
    words[1] = "to";
    words[2] = "you";

    System.out.println(words[2]);

    String[] fruits = {"apple", "banana", "peach", "yuzu", "bergamot", "lemon", "melon"};

    for(int i = 0; i < fruits.length; i++){
      System.out.println(fruits[i]);
    }

    for(String fruit: fruits){
      System.out.println(fruit);
    }

    byte value = 2;

    String text = null;
    System.out.println(text);

    String[] texts = new String[2];

    System.out.println(texts[0]);

    texts[0] = "one";

  }
}
