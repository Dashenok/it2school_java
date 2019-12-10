package lesson_2.daria;

import java.util.Scanner;

public class Task2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number :");
        if (scanner.hasNextDouble()) {
            double firstNumber = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Input one of operations + - * / :");
            char operation = scanner.nextLine().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                System.out.print("Input second number :");
                if (scanner.hasNextDouble()) {
                    double secondNumber = scanner.nextDouble();
                    if (operation == '+') {
                        sum(firstNumber, secondNumber);
                    } else if (operation == '-') {
                        sub(firstNumber, secondNumber);
                    } else if (operation == '*') {
                        mult(firstNumber, secondNumber);
                    } else if (operation == '/') {
                        div(firstNumber, secondNumber);
                    }
                } else {
                    System.out.println("Please enter a number next time");
                }
            } else {
                System.out.println("Please enter one of the following operation: + - * /");
            }
        } else {
            System.out.println("Please enter a number next time");
        }
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void sub(double a, double b) {
        System.out.println(a - b);
    }

    public static void mult(double a, double b) {
        System.out.println(a * b);
    }

    public static void div(double a, double b) {
        System.out.println(a / b);
    }
}
