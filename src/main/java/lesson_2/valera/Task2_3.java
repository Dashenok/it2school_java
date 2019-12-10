package lesson_2.valera;

import java.util.Scanner;
public class Task2_3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scanner.nextInt();

		if ((number%3)==0 & (number%4)==0){
			System.out.println("FizzBuzz");
		}
		else if ((number%3)==0){
			System.out.println("Fizz");
		}
		else if ((number%4)==0){
			System.out.println("Buzz");
		}
		else{
			System.out.println("Nothing");
		}
	}
}
