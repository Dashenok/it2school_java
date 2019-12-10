package lesson_2.vsevolod;

import java.util.Scanner;
public class Task2_4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input your name : ");
        String name = scanner.nextLine();
        System.out.print("input your surname : ");
        String surname = scanner.nextLine();
        System.out.print("input your age : ");
        int age = scanner.nextInt();
        System.out.println("Your name is " + name + "and your surname is " + surname + " and your age " + age + ".");
    }
}
