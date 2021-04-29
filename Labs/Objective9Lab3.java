public class Objective9Lab3 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection;
    printMenu();


    while(true) {
    selection = scanner.nextInt();
    if (selection == 1) {
      System.out.println("Hello Kim");
      printMenu();
    }
    if(selection == 2) {
      System.out.println("Chicken wings, Fruit salad, PBandJ");
      printMenu();
    }
    if(selection == 3) {
      System.out.println("Goodbye!");
      scanner.close();
    }
  }
}

  public static void printMenu(){
    System.out.println("___Menu___");
    System.out.println("1. Say Hello");
    System.out.println("2. List my Favorite Foods");
    System.out.println("3. Exit");
    System.out.println();

}

}
