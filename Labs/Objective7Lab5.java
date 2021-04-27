public class Objective7Lab5 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("____Menu____");
      System.out.println("1. Say Hello");
      System.out.println("2. List my Favorite Foods");
      System.out.println("3. Exit");
      System.out.println();

      selection = scanner.nextInt();
      if (selection == 1) {
        System.out.println("Hello World");
      }
      if(selection == 2) {
        System.out.println("Chicken, Fruit, Peanut Butter");
      }
      if(selection == 3) {
        System.out.println("Goodbye");
        break;
      }
}
}
}
