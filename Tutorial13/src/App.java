class Dog{
  String name;
  String owner;
  int age;
  int appearance;
}

class Person{
  // Instance variables (data or "state")
  String name;
  int age;

  // Classes can contain
  // 1. Data
  // 2. Subroutines (methods(similar to functions JS))
}

public class App {
  public static void main(String[] args) {
    System.out.println("Heey!");
    System.out.println("You look cute <3");

    Person person1 = new Person();
    person1.name = "John Doe";
    person1.age = 69;

    Person person2 = new Person();
    person2.name = "Jane Doe";
    person2.age = 35;

    System.out.println(person1.age);
    System.out.println();

    Dog dog1 = new Dog();
    dog1.name = "Pluto";
    dog1.owner = "Goofy";
    dog1.age = 93;
    dog1.appearance = 1930;

    System.out.println("The dog is called " + dog1.name + ".");
    System.out.println(dog1.name + " is owned by " + dog1.owner + ".");
    System.out.println(dog1.name + " is " + dog1.age + " years old. He first appeared in " + dog1.appearance + ".");


  }
}
