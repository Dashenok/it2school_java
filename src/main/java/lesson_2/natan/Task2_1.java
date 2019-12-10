package lesson_2.natan;

import java.util.Scanner;
public class Task2_1{

    public static void main (String args[]){
		System.out.print("Write your number: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a%2;
		if(b==0){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
