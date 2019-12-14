package lesson_2.inga;
import java.util.Scanner;
public class Task2_6
{
  public static void main(String[] args) {
    int num1 = getNumber();
    char operation = getOperation();
    int num2 = getNumber();
    int result = calc(num1, operation, num2);
    System.out.println("Result: " + result);
  }
  public static char getOperation() {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Operation:");
    if (scanner1.hasNext()) {
      return scanner1.next().charAt(0);
    }
    else {
      System.out.println("Error");
      scanner1.next();
      return getOperation();
    }
  }

  public static int getNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number: ");
    if (sc.hasNextInt()) {
      return sc.nextInt();
    }
    else {
      System.out.println("Error");
      sc.next();
      return getNumber();
    }
  }
  public static int calc(int num1, char operation, int num2) {
    int result;
    switch (operation) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        return num1 / num2;
    }
    return 0;
  }

}