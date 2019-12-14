package lesson_2.inga;

import java.util.Scanner;

public class Task2_8{
  public static void main(String[] args){

    Scanner newScanner = new Scanner(System.in);
    System.out.println("Number from 0 to 100");
    int x = (int) (Math.random() * 100);
    int number = -1;
    for (int attempt = 7; attempt > 0; attempt--) {
      number = newScanner.nextInt();
      if (number > x) {
        System.out.println("My number less");
      } else if (number < x) {
        System.out.println("My number more");
      } else {
        System.out.println("You winner");
        break;
      }
    }
    if ( number != x) {
      System.out.println("Lose");

    }
  }
}
