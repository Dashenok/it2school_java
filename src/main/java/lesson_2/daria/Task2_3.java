package lesson_2.daria;
import java.util.Scanner;
public class Task2_3 {
	public static void main(String[] args) {
		System.out.println("Input numner");
		Scanner in  = new Scanner(System.in);
		if (in.hasNextInt()) {
			int inputNumber = in.nextInt();
			if (inputNumber % 3 == 0 && inputNumber % 4 == 0) {
				System.out.println("FizzBuzz");
			} else if (inputNumber % 3 == 0) {
				System.out.println("Fizz");
			} else if (inputNumber % 4 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println("Nothing");
			}
		}
	}
}
