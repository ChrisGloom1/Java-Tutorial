class Frog{
  private String name;
  private int age;

  public void setName(String newName){
    name = newName;
  }

  public void setAge(int newAge) {
    age = newAge;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  // this. in front of setName/setAge is obsolete.
  public void setInfo(String name, int age){
    setName(name);
    setAge(age);
  }

}

public class App {
  public static void main(String[] args) {

    Frog frog1 = new Frog();

    // frog1.name = "Kuken";
    // frog1.age = 2;

    frog1.setName("Kuken");
    frog1.setAge(2);

    System.out.println(frog1.getName());
    System.out.println(frog1.getAge());

  }
}
