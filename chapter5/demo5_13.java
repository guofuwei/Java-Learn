class Person {
  private String name;
  private int age;
  public Person() {
    this.name = "none";
    this.age = 0;
  }
  public Person(String name) {
    this.name = name;
  }
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void tell() {
    System.out.println("姓名:" + getName() + ",年龄:" + getAge());
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public boolean setName(String newName) {
    name = newName;
    return true;
  }
  public boolean setAge(int newAge) {
    if (newAge >= 0 && newAge < 150) {
      age = newAge;
      return true;

    }
    return false;
  }
}

public class demo5_13 {
  public static void main(String[] args) {
    Person per = new Person();
    per.setName("张三");
    per.setAge(18);
    per.tell();
    Person per2 = new Person("李四", 20);
    per2.tell();
  }
}
