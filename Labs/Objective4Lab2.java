import java.util.Scanner;
public class Objective4Lab2 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Please enter your age:");
    int num1 = input.nextInt();
    System.out.println("Please enter your father's age:");
    int num2 = input.nextInt();
    System.out.println("Please enter your mother's age:");
    int num3 = input.nextInt();
    System.out.println("The sum of your ages is" + (num1 + num2 + num3));
    System.out.println("Now enter your height in the form feet.inches:");
    double dub1 = input.nextDouble();
    System.out.println("Please enter your father's height:");
    double dub2 = input.nextDouble();
    System.out.println("Pleae enter your mother's height:");
    double dub3 = input.nextDouble();
    System.out.println("The height of you and your parents comes to a sum of" + (dub1 + dub2 + dub3));

  }
}
