package lesson_2.natan;

import java.util.Scanner;
public class Task2_2{

    public static void main (String args[]){
		System.out.print("Write your number: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a%2;
		int c = a%3;
		int d = a%4;
		int e = a%5;
		int f = a%6;
		int g = a%7;
		int h = a%8;
		int i = a%9;
		int j = a%10;
		System.out.println("Can be divided by 1");
		if(b==0){
			System.out.println("Can be divided by 2");
		}
		if(c==0){
			System.out.println("Can be divided by 3");
		}
		if(d==0){
			System.out.println("Can be divided by 4");
		}
		if(e==0){
			System.out.println("Can be divided by 5");
		}
		if(f==0){
			System.out.println("Can be divided by 6");
		}
		if(g==0){
			System.out.println("Can be divided by 7");
		}
		if(h==0){
			System.out.println("Can be divided by 8");
		}
		if(i==0){
			System.out.println("Can be divided by 9");
		}
		if(j==0){
			System.out.println("Can be divided by 10");
		}
	}
}
