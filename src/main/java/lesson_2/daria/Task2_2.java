package lesson_2.daria;
import java.util.Scanner;
public class Task2_2 {
	public static void main(String[] args) {
		System.out.print("Введите число, а я вам покажу все его делители от 1 до 10: ");
		Scanner in = new Scanner(System.in);
		if (in.hasNextInt()) {
			int inputNumber = in.nextInt();
			int i = 1;
			while (i <= 10) {
				if (inputNumber % i == 0) System.out.println("Can be divided by " + i);
				i++;
			}
		}

	}
}
