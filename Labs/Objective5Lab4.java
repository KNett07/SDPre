public class Objective5Lab4 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println(" Please enter a number: ");
    int num1 = scanner.nextInt();

    if(num1 % 2 == 0) {
      System.out.println(" The number is even. ");
    }
    else {
      System.out.println(" The number is odd. ");
    }
  }
}
