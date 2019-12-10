package lesson_2.natan;

import java.util.Scanner;
public class Task2_7{

    public static void main (String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to find from this fotmula: S=V*t? ");
		if(scanner.hasNextLine()) {
			char a = scanner.next().charAt(0);
			if (a=='S' |  a=='V' | a=='t'){
				if(a=='S'){
					System.out.println("Write given numbers:");
					System.out.print("V (km/h): ");
					if(scanner.hasNextDouble()) {
						double v = scanner.nextDouble();
						System.out.print("t (h): ");
						if(scanner.hasNextDouble()) {
							double t = scanner.nextDouble();
							System.out.println("Result: " + a + "=" + v + "*" + t + "=" + v*t + " (km)");
						}else{
							System.out.print("Sorry, try again.");
						}
					}else{
						System.out.print("Sorry, try again.");
					}
				}
				if(a=='V'){
					System.out.println("Write given numbers:");
					System.out.print("S (km): ");
					if(scanner.hasNextDouble()) {
						double c = scanner.nextDouble();
						System.out.print("t (h): ");
						if(scanner.hasNextDouble()) {
							double d = scanner.nextDouble();
							System.out.println("Result: " + a + "=" + c + "/" + d + "=" + c/d + " (km/h)");
						}else{
							System.out.print("Sorry, try again.");
						}
					}else{
						System.out.print("Sorry, try again.");
					}
				}
				if(a=='t'){
					System.out.println("Write given numbers:");
					System.out.print("S (km): ");
					if(scanner.hasNextDouble()) {
						double h = scanner.nextDouble();
						System.out.print("t (h): ");
						if(scanner.hasNextDouble()) {
							double k = scanner.nextDouble();
							System.out.println("Result: " + a + "=" + h + "/" + k + "=" + h/k + " (h)");
						}else{
							System.out.print("Sorry, try again.");
						}
					}else{
						System.out.print("Sorry, try again.");
					}
				}

			}else{
			System.out.print("Choose S V or t");
			}
		}else{
			System.out.print("Write a letter");
		}
	}
}
