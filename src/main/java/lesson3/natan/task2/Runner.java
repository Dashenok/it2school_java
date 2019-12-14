package lesson3.natan.task2;

public class Runner {
  public static void main(String[] args) {
    Person natan = new Person();
    natan.name = "Natan";
    natan.surname = "Chachko";
    natan.age = 16;
    System.out.println(natan.getName());
    System.out.println (natan.getSurnameName());
    System.out.println(natan.getAll());
  }
}