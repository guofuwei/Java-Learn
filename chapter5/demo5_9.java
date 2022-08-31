class Person {
  private String name;
  private int age;
  public void tell() {
    System.out.println("姓名:" + getName()+",年龄:"+getAge());
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
    age = newAge;
    return true;
  }
}

public class demo5_9 {
  public static void main(String[] args) {
    Person per=new Person();
    per.setName("张三");
    per.setAge(18);
    per.tell();
  }
}

