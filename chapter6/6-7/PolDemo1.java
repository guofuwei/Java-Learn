class A {
  public void fun1() {
    System.out.println("A fun1()");
  }
  public void fun2() {
    this.fun1();
  }
}

class B extends A {
  public void fun1() {
    System.out.println("B fun1()");
  }
}

public class PolDemo1 {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    print(a);
    print(b);
  }

  public static void print(A a) {
    a.fun1();
    a.fun2();
  }
}
