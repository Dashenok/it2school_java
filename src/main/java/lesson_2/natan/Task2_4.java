package lesson_2.natan;

import java.util.Scanner;
public class Task2_4{

    public static void main (String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name: ");
		String name = scanner.nextLine();
		System.out.print("Your surname: ");
		String surname = scanner.nextLine();
		System.out.print("Your age: ");
		int age = scanner.nextInt();

		System.out.print("Your name is " + name + " and your surname is " + surname + " and your age is " + age + ".");
	}
}
