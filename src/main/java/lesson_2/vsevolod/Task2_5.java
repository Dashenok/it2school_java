package lesson_2.vsevolod;

import java.util.Scanner;

public class Task2_5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("input your name : ");
		String name = scanner.nextLine();

		System.out.print("input your surname : ");
		String surname = scanner.nextLine();

		System.out.print("input your age : ");
		int age = scanner.nextInt();

		System.out.print("Do you have cats : ");
		boolean cats = scanner.nextBoolean();

		scanner.nextLine();

		if(cats==true){

			System.out.print("Сat name: ");
			String CatName = scanner.nextLine();

			System.out.print("Your name is "+name+" and your surname is "+surname+" and your age is "+age+" you have a cat and his name is "+CatName+".");

		}else{
		System.out.print("Your name is "+name+" and your surname is "+surname+" and your age is "+age+" you don’t have a cat.");
		}
	}
}
