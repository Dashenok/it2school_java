package lesson_2.inga;

import java.util.Scanner;

public class Task2_4{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Your name: ");
    String name = in.nextLine();

    System.out.print("Your surname: ");
    String surname = in.nextLine();

    System.out.print("Your age: ");
    int age = in.nextInt();

    System.out.println("Your name is " + name + " and your surname is " + surname +  " and your age is " + age);
    in.close();

  }
}
