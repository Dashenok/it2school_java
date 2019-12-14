package lesson3.natan.task2;

public class Person {
  String name;
  String surname;
  int age;
  public String getName(){
    return name;
  }
  public String getSurnameName(){
    return surname;
  }
  public String getAll(){
    return name + " " + surname + " " + age;
  }
}