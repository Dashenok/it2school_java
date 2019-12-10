package lesson_2.daria;
import java.util.Scanner;
public class Task2_1 {
	public static void main(String[] args) {
		System.out.println("Введите число, а я вам скажу четное оно или нет");
		Scanner in = new Scanner(System.in);
		if (in.hasNextInt()) {
			int inputNumber = in.nextInt();
			if (inputNumber % 2 == 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println("Вводите пожалуйста только числа в следующий раз");
		}
	}
}
