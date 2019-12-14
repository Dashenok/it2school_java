package lesson_2.inga;

import java.util.Scanner;

public class Task2_5
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Your name: ");
    String name = in.nextLine();

    System.out.print("Your surname: ");
    String surname = in.nextLine();

    System.out.print("Your age: ");
    int age = in.nextInt();

    System.out.print("Do you have cats: (1 - yes, 0 - no )");
    int cat = in.nextInt();

    if (cat == 1) {

      System.out.println("Cat name: ");

      String tCat = in.nextLine();
      System.out.println("Your name is " + name + " and your surname is " + surname + " and your age is " + age +
          " you have a cat and his name is " + tCat);
    }
    else {

      System.out.println("Your name is " + name + " and your surname is " + surname + " and your age is " + age +
          " and you don't have a cat");
    }  


  }
}
