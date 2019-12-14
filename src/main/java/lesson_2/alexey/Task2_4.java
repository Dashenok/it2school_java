package lesson_2.alexey;

import java.util.Scanner;

public class Task2_4
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Your name:");
    String name = scanner.next();
    System.out.println("Your surname:");
    String surname = scanner.next();
    System.out.println("Your age:");
    int age = scanner.nextInt();
    System.out.println("Your name is " + name + " and your surname is " + surname + " and your age is " + age + ".");
  }
}