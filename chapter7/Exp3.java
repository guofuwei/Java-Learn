import java.io.*;



public class Exp3 {

  String str;

  public void method1() {

    str.length();

  }

  public void method2() {

    method1();

  }

  public void method3() {

    method2();

  }

  public static void main(String[] args) {

    Exp3 exp = new Exp3();

    try {

      exp.method3();

    } catch (Exception ex) {

      System.out.println("捕获异常：" + ex.toString());

      ex.printStackTrace();

    } finally {

      System.out.println("执行扫尾工作");

    }

  }

}
