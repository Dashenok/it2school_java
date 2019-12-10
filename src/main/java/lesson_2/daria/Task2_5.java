package lesson_2.daria;

import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("Your surname: ");
        String surname = scanner.next();

        System.out.print("Your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have cats (1 if yes, 0 if no): ");
        int hasCat = scanner.nextInt();

        if (hasCat == 1) {
            System.out.print("Cat name: ");
            scanner.nextLine();
            String catName = scanner.nextLine();
            System.out.println("Your name is " + name + " your surname is " + surname + " and your age is " + age + " you have a cat and his name is " + catName);
        } else {
            System.out.println("Your name is " + name + " your surname is " + surname + " and your age is " + age + " you don't have cats");
        }
    }
}
