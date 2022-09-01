class Person {
  private String name;
  private int age;
  public Person() {
    System.out.println("一个新的Person被实例化");
  }
  public Person(String name, int age) {
    this();
    this.name = name;
    this.age = age;
  }
  public String getinfo() {
    return "姓名:" + this.name + ",年龄:" + this.age;
  }
}

public class ThisDemo03 {
  public static void main(String[] args) {
    Person per1 = new Person("张三", 18);
    System.out.println(per1.getinfo());
  }
}
