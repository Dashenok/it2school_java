package lesson_2.vsevolod;

import java.util.Scanner;

public class Task2_6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("input x ");
		int x = scanner.nextInt();

		System.out.print("mathematical action ");
		String action = scanner.nextLine();

		System.out.print("input y ");
		int y = scanner.nextInt();

		double c = 0;

		if(action == "+"){
			c = x+y;
		}
		if(action == "-"){
			c = x-y;
		}
		if(action == "*"){
			c = x*y;
		}
		if(action == "/"){
			c = x/y;
		}
		System.out.print("Result: ‌"+ x + action + y + "=" + c);
	}
}
