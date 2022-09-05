class Person {
  void print() {
    System.out.println("Person print");
  }
  void fun() {
    this.print();
  }
}
class Student extends Person {
  public void print() {
    System.out.println("Student print");
  }
}
public class Demo1 {
  public static void main(String[] args) {
    new Person().print();
    new Student().print();
    new Person().fun();
    new Student().fun();
  }
}
