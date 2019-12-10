package lesson_2.vsevolod;

import java.util.Scanner;

public class Task2_3_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input your namber : ");
		int x = scanner.nextInt();
		if((x%3==0 && x%4==0) || x%3==0 || x%4==0){
			if(x%3==0 && x%4==0){
			System.out.println("FizzBuzz");
			}else if(x%3==0){
				System.out.println("Fizz");
			}else if(x%4==0){
				System.out.println("Buzz");
			}
		}else{
			System.out.println("Nothing");
		}
	}
}
