class Outer {
  private String info = "Hello World";
  class Inner {
    public void print() {
      System.out.println(info);
    }
  }
}
public class Demo3 {
  public static void main(String[] args) {
    Outer out = new Outer();
    Outer.Inner in = out.new Inner();
    in.print();
  }
}
