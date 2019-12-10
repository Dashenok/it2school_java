package lesson_2.valera;

import java.util.Scanner;
public class Task2_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number = scanner.nextInt();

		System.out.print("Enter second number: ");
		int number2 = scanner.nextInt();

		int number3 = number%number2;
		System.out.print("Third number " + number3);

			if (number3 == 0){
				System.out.println(" true");
			}
			else{
				System.out.println(" false");
			}
	}
}
