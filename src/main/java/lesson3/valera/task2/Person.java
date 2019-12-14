package lesson3.valera.task2;

public class Person {
  public String name;
  public String surname;
  public String age;

  public String getName() {
    return name;
  }
  public String getSurname() {
    return surname;
  }
  public String getAll() {
    return name+ " " + surname+ " " + age;
  }
}