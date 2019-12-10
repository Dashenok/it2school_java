package lesson_2.vsevolod;

import java.util.Scanner;
public class Task2_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input your namber : ");
        double x = scanner.nextInt();
        if(x%1==0){
            System.out.println("Can be divided by 1");
        }
        if(x%2==0){
            System.out.println("Can be divided by 2");
        }
        if(x%3==0){
            System.out.println("Can be divided by 3");
        }
        if(x%4==0){
            System.out.println("Can be divided by 4");
        }
        if(x%5==0){
            System.out.println("Can be divided by 5");
        }
        if(x%6==0){
            System.out.println("Can be divided by 6");
        }
        if(x%7==0){
            System.out.println("Can be divided by 7");
        }
        if(x%8==0){
            System.out.println("Can be divided by 8");
        }
        if(x%9==0){
            System.out.println("Can be divided by 9");
        }
        if(x%10==0){
            System.out.println("Can be divided by 10");
        }
    }
}
