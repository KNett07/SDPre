import java.util.Scanner;
public class Objective4Lab1 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("What is your first name?");
    String fname = input.nextLine();
    System.out.println("What is your last name?");
    String lname = input.nextLine();
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = input.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFood = input.nextLine();
    System.out.println("What is your favorite song?");
    String favoriteSong = input.nextLine();
    System.out.println("My name is" + fname + lname + "!");
    System.out.println("My favorite animal is a" + favoriteAnimal + ".");
    System.out.println("My favorite food is" + favoriteFood + "!");
    System.out.println("My favorite song is" + favoriteSong + ".");


  }
}
