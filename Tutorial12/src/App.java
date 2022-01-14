public class App {
  public static void main(String[] args) {

    // One dimentional array
    int[] values = {3,4,5};
    System.out.println("One dimentional array: " + values[2]);

    // Multi(2)-dimentional array, more than one array
    int[][] grid = {
            {3, 5, 7},
            {2, 4},
            {1, 2, 3, 4}
    };
    // Specify row then column - always that order
    System.out.println("Multi (two in this case) dimentional array: " + grid[1][1]);
    System.out.println("Multi (two in this case) dimentional array: " + grid[0][2]);

    String[][] texts = new String[2][3];

    texts[0][1] = "Hello there!";
    System.out.println(texts[0][1]);

    for(int row = 0; row < grid.length; row++){
      for(int col = 0; col < grid[row].length; col++){
        System.out.print(grid[row][col] + "\t");
      }
      System.out.println();
    }
    // You can set one of the arrays to a value and leave the second one empty to declare it later.
    String[][] words = new String[2][];
    System.out.println(words[0]);

    words[0] = new String[3];
    words[0][1] = "Hi there!";
    System.out.println(words[0][1]);

  }
}
