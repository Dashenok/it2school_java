package lesson_2.daria;

import java.util.Scanner;

public class Task2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("Your surname: ");
        String surname = scanner.next();

        System.out.print("Your age: ");
        int age = scanner.nextInt();


        System.out.println("Your name is " + name + " your surname is " + surname + " and your age is " + age);

    }
}
