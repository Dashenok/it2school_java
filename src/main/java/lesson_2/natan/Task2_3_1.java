package lesson_2.natan;

import java.util.Scanner;
public class Task2_3_1{

    public static void main (String args[]){
		System.out.print("Write your number: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a%3;
		int c = a%4;
		if(b==0){
			System.out.print("Fizz");
		}
		if(c==0){
				System.out.print("Buzz");
		}
		if(b!=0 & c!=0){
			System.out.print("Nothing");
		}
	}
}
