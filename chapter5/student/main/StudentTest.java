package main;
import student.*;
public class StudentTest {
  public static void main(String[] args) {
    Student stu1 = new Student("1", "bob", 10, 20, 30);
    System.out.println(stu1.avg());
  }
}
