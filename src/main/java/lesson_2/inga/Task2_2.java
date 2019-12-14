package lesson_2.inga;

import java.util.Scanner;

public class Task2_2
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number: ");
    int a = scanner.nextInt();

    if (a % 1 == 0) {
      ;
    }
    int i = 1;
    do {
      if (a % i == 0) {
        System.out.println("Can be divided by: " + i);
      }
      i++;
    }
    while (i < 11);
  }
}