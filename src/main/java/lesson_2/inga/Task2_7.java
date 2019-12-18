package lesson_2.inga;

import java.util.Scanner;

public class Task2_7 {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("You have a formula V = S/t . Write what symbol you want to find: ");
    String symbol1 = scanner.next();
    if (symbol1.equals("V")) {
      System.out.println("Please write s and t");
      double s = getNumber();
      double t = getNumber();
      System.out.println(s / t);
    } else if (symbol1.equals("s")) {
      System.out.println("Please write v and t");
      double v = getNumber();
      double t = getNumber();
      System.out.println(v * t);
    } else if (symbol1.equals("t")){
      System.out.println("Please write v and s");
      double v = getNumber();
      double s = getNumber();
      System.out.println(s / v);
    } else {
      System.out.println("Error");
    }
  }
  public static double getNumber() {
    System.out.println("Number: ");
    if (scanner.hasNextInt()) {
      return scanner.nextDouble();
    } else {
      System.out.println("Error");
      scanner.next();
      return getNumber();
    }
  }
}