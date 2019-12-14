package lesson_2.inga;

import java.util.Scanner;
public class Task2_1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number: ");
    int  a = scanner.nextInt();
    System.out.println(a%2==0);
  }
}