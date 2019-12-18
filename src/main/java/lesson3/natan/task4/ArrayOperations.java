package lesson3.natan.task4;


public class ArrayOperations {
  public boolean has2or3(int[] array) {
    if (array[0] == 2 | array[0] == 3 | array[1] == 2 | array[1] == 3) {
      return true;
    } else {
      return false;
    }
  }

  public boolean no23(int[] array) {
    if (array[0] != 2 & array[0] != 3 & array[1] != 2 & array[1] != 3) {
      return true;
    } else {
      return false;
    }
  }

  public int maxTriple(int[] array) {
    int i = 1;
    int max = array[0];
    while (i < array.length){
      if (max < array[i]){
        max = array[i];
        i++;
      }else{
        i++;
      }
    }
    return max;
  }

  public int sum3(int[] array) {
    int arrLength = 0;
    int summ = 0;
    while (arrLength < array.length) {
      summ = summ + array[arrLength];
      arrLength++;
    }
    return summ;
  }
  public int[] front11(int[] array1, int[] array2){
    return new int[]{array1[0], array2[0]};
  }
}