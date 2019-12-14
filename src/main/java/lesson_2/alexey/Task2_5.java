package lesson_2.alexey;

import java.util.Scanner;
public class Task2_5
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Your name: ");
    String name = scanner.next();
    System.out.println("Your surname: ");
    String surname = scanner.next();
    System.out.println("Your age: ");
    int age = scanner.nextInt();
    System.out.println("Do you have cats? (yes = 1, no = 0)");
    int doUHvCats = scanner.nextInt();
    if (doUHvCats == 1) {
      System.out.println("Cat's name: ");
      String catName = scanner.next();
      System.out.println("Your cat is male or female?");
      String cat_sex = scanner.next();
      if (cat_sex.length() == 6) {
        cat_sex = "her";
      }
      else {
        cat_sex = "his";
      }
      System.out.println("Your name is " + name + " and your surname is "
          + surname + " and your age is " + age + " . You have a cat and " + cat_sex + " name is" + catName + ".");
    }
    else {
      System.out.println("Your name is " + name + " and your surname is "
          + surname + " and your age is " + age + " . You don't have cat.");
    }
  }
}