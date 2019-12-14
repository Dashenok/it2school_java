package lesson_2.alexey;

import java.util.Scanner;
public class Task2_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("FizzBuzz");
    double chislo = scanner.nextDouble();
    if (chislo % 3 == 0 & chislo % 4 == 0) {
      System.out.println("FizzBuzz");}
    else if (chislo % 4 == 0) {
      System.out.println("Buzz");
    }
    else if (chislo % 3 == 0) {
      System.out.println("Fizz");
    }
    else {
      System.out.println("Nothing");
    }
  }
}

