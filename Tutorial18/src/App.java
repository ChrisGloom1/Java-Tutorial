class Machine{
  private String name;
  private int code;

  public Machine(){
    this("Alice", 69);
    System.out.println("First constructor running.");

  }

  public Machine(String name) {
    this(name, 69);
    System.out.println("Second constructor running.");
    this.name = name;
  }

  public Machine(String name, int code){
    System.out.println("Third constructor running.");
    this.name = name;
    this.code = code;
  }
}

public class App {
  public static void main(String[] args) {
    Machine machine1 = new Machine();
    /*
     new Machine();
     ^ This is the same as the line above because it's a constructor.

     Machine machine2 = new Machine("Bob");
     Machine machine3 = new Machine("Caroline", 69);
    */

  }
}
