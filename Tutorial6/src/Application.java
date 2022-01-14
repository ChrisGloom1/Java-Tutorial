public class Application {
  public static void main(String[] args) {

    int loop = 0;
    int myInt = 15;

    if(myInt < 10){
      System.out.println("Yes, it's true.");
    }
    else if(myInt > 20){
      System.out.println("Nope, it's false.");
    }
    else{
      System.out.println("Neither true or false.");
    }

    while(loop < 5){
      System.out.println("Looping: " + loop);
      if(loop == 5){
        break;
      }
      loop++;
      System.out.println("Running");
    }
  }
}
