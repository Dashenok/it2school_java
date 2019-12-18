package lesson3.natan.task3;

import java.util.TreeSet;
public class Calculator {
  public double sum(double firstNumber, double secondNumber){
    return firstNumber + secondNumber;
  }
  public double sub(double firstNumber, double secondNumber){
    return firstNumber - secondNumber;
  }
  public double mult(double firstNumber, double secondNumber){
    return firstNumber * secondNumber;
  }
  public double div(double firstNumber, double secondNumber){
    return firstNumber / secondNumber;
  }
  public double sqrt(double number){
    return number * number;
  }
  public double min(double firstNumber, double secondNumber){
    if (firstNumber < secondNumber) {
      return firstNumber;
    }else {
      return secondNumber;
    }
  }
  public double min3(double firstNumber, double secondNumber, double thirdNumber){
    if (firstNumber < secondNumber & firstNumber < thirdNumber) {
      return firstNumber;
    }
    if (secondNumber < firstNumber & secondNumber < thirdNumber) {
      return secondNumber;
    }
    if (thirdNumber < secondNumber & firstNumber > thirdNumber) {
      return thirdNumber;
    }else {
      return 0;
    }
  }

  public double max(double firstNumber, double secondNumber){
    if (firstNumber > secondNumber) {
      return firstNumber;
    }else {
      return secondNumber;
    }
  }
  public double max3(double firstNumber, double secondNumber, double thirdNumber){
    if (firstNumber > secondNumber & firstNumber > thirdNumber) {
      return firstNumber;
    }
    if (secondNumber > firstNumber & secondNumber > thirdNumber) {
      return secondNumber;
    }
    if (thirdNumber > secondNumber & firstNumber < thirdNumber) {
      return thirdNumber;
    }else {
      return 0;
    }
  }
  public double average(double firstNumber, double secondNumber){
    return (firstNumber + secondNumber)/2;
  }
  public double nod(int firstNumber, int secondNumber) {
    if (firstNumber < 0) {
      firstNumber = -firstNumber;
    }
    if (secondNumber < 0) {
      secondNumber = -secondNumber;
    }
    if (firstNumber == 0 & secondNumber != 0) {
      return secondNumber;
    }
    if (firstNumber != 0 & secondNumber == 0) {
      return firstNumber;
    } else {
      while (firstNumber != secondNumber) {
        if (firstNumber > secondNumber) {
          firstNumber = firstNumber - secondNumber;
        } else {
          secondNumber = secondNumber - firstNumber;
        }
      }
      return firstNumber;
    }
  }
  public double nok(int firstNumber, int secondNumber) {
    if (firstNumber < 0){
      firstNumber = -firstNumber;
    }
    if (secondNumber < 0){
      secondNumber= -secondNumber;
    }
    if (firstNumber == 0 | secondNumber == 0) {
      return 0;
    } else {
      int multy = firstNumber * secondNumber;
      while (firstNumber != secondNumber) {
        if (firstNumber > secondNumber) {
          firstNumber = firstNumber - secondNumber;
        } else {
          secondNumber = secondNumber - firstNumber;
        }
      }
      return multy / firstNumber;
    }
  }
  public double sumOfArray(double [] numbers){
    int arrLength = 0;
    double summ = 0;
    while (arrLength < numbers.length){
      summ =  summ + numbers[arrLength];
      arrLength++;
    }
    return summ;

  }

    
    
}
