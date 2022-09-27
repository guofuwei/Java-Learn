interface A {
  String AUTHOR="hanshan";
  // public static final String AUTHOR="hanshan";
  void print();
  // public abstract void print();
  String getInfo();
  // public abstract String getInfo();
}

abstract class B implements A {
  public abstract void say();
}

class X extends B {
  public void print() {
    System.out.println("AUTHOR:"+AUTHOR);
  }
  public String getInfo() {
    return "HELLO JAVA";
  }
  public void say() {
    System.out.println("Hello world");
  }
}

public class InterfaceDemo2 {
  public static void main(String[] args) {
    X x = new X();
    x.print();
    x.say();
  }
}
