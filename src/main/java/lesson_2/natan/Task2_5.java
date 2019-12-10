package lesson_2.natan;

import java.util.Scanner;
public class Task2_5{

    public static void main (String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name: ");
		String name = scanner.nextLine();
		System.out.print("Your surname: ");
		String surname = scanner.nextLine();
		System.out.print("Your age: ");
		int age = scanner.nextInt();
		System.out.print("Do you have cats (1 if yes; 0 if no): ");
		int cat = scanner.nextInt();
		if (cat==1){
			System.out.print("Cat name: ");
			Scanner catty = new Scanner(System.in);
			String namecat = catty.nextLine();
			System.out.print("Your name is " + name + " and your surname is " + surname + " and your age is " + age + " and you have a cat and it's name is " + namecat + ".");
		}
		if (cat==0){
			System.out.print("Your name is " + name + " and your surname is " + surname + " and your age is " + age + " and you don't have a cat.");
		}
	}
}
