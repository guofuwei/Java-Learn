interface A {
  String AUTHOR="hanshan";
  // public static final String AUTHOR="hanshan";
  void print();
  // public abstract void print();
  String getInfo();
  // public abstract String getInfo();
}

interface B {
  void say();
}

class X implements A,B {
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

public class InterfaceDemo1 {
  public static void main(String[] args) {
    X x = new X();
    x.print();
    x.say();
  }
}
