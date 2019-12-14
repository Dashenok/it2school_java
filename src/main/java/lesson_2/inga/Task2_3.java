package lesson_2.inga;

import java.util.Scanner;

public class Task2_3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number: ");
    int a = scanner.nextInt();

    if(a%3==0 & a%4==0 ){

      System.out.println("FizzBuzz ");
    }
    else if (a%3==0){
      System.out.println("Fizz");
    }
    else if (a%4==0){
      System.out.println("Buzz");
    }
    else if (a%4!=0 & a%3!=0){
      System.out.println("Nothing");
    }

  }
}