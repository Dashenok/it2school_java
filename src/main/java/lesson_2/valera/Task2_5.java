package lesson_2.valera;

import java.util.Scanner;
public class Task2_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Your name: ");
		String name = scanner.next();

		System.out.println("Your surname: ");
		String surname = scanner.next();

		System.out.print("Your age: ");
		int age = scanner.nextInt();

		System.out.println("Do you have cats? Enter 1 if you have cats, enter 0 if you do not have cats.: ");
		int cat = scanner.nextInt();
			if (cat == 1){
				System.out.println("What is your cat name?: ");
				String catName = scanner.next();
				System.out.println("Your name is " + name + " and your surname is " + surname + " and your age is " + age + " and you have cat which name is " + catName);
			}
			else {
				System.out.println("Your name is " + name + " and your surname is " + surname + " and your age is " + age + " and you don't have cat.");
			}

	}
}
