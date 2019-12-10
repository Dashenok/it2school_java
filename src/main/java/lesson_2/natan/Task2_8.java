package lesson_2.natan;

import java.util.Scanner;
public class Task2_8 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int random = (int) (Math.random()*100);
		int x = 7;
		System.out.println(random);
		System.out.println("You have 7 tries to guess number from 0 to 100");
		while (x != 0){
			if(scanner.hasNextInt()) {
				int b = scanner.nextInt();
				if (b==random){
					System.out.println("Congratulations! You are right!");
				}
				if (b<random){
					System.out.println("Try greater number");
					x = x-1;
					System.out.println(x + " tries left");
				}
				if (b>random){
					System.out.println("Try lower number");
					x = x-1;
					System.out.println(x + " tries left");
				}
			}else{
				System.out.println("You should write number");
				x = x-1;
				System.out.println(x + " tries left");
			}
		}
	}
}
