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
  // 2. Subroutines (methods)

  // methods should always start with a lowercase letter
  void speak() {
      System.out.println("My name is " + name + ", and I'm " + age + " years old!");
  }
  void sayHello(){
    System.out.println("Hello!");
  }

}

public class App {
  public static void main(String[] args) {
    System.out.println("Heey!");
    System.out.println("You look cute <3");

    Person person1 = new Person();
    person1.name = "John Doe";
    person1.age = 69;
    person1.sayHello();
    person1.speak();

    Person person2 = new Person();
    person2.name = "Jane Doe";
    person2.age = 35;
    person2.sayHello();
    person2.speak();


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
