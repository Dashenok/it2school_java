package lesson_2.daria;

import java.util.Scanner;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("We are solving E=mc2 problem. Please enter parameter you want to find: ");
        char parameter = scanner.nextLine().charAt(0);
        if (parameter == 'E') {
            System.out.print("Enter m (kg): ");
            if (scanner.hasNextDouble()) {
                double m = scanner.nextDouble();
                System.out.print("Enter c (m/s): ");
                if (scanner.hasNextDouble()) {
                    double c = scanner.nextDouble();
                    System.out.println("Result: E = " + Math.pow(c, 2) * m + " J");
                }
            }
        } else if (parameter == 'm') {
            System.out.print("Enter E (J): ");
            if (scanner.hasNextDouble()) {
                double e = scanner.nextDouble();
                System.out.print("Enter c (m/s): ");
                if (scanner.hasNextDouble()) {
                    double c = scanner.nextDouble();
                    System.out.println("Result: m = " + e / Math.pow(c, 2) + " kg");
                }
            }
        } else if (parameter == 'c') {
            System.out.print("Enter m (kg): ");
            if (scanner.hasNextDouble()) {
                double m = scanner.nextDouble();
                System.out.print("Enter E (J): ");
                if (scanner.hasNextDouble()) {
                    double e = scanner.nextDouble();
                    System.out.println("Result: c = " + Math.sqrt(e / m) + " m/s");
                }
            }
        } else {
            System.out.println("Please choose one of the options: E, m, c");
        }
        scanner.close();
    }
}
