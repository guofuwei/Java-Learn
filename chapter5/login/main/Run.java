package main;
import login.*;
public class Run {
  public static void main(String[] args) {
    LoginCheck login1 = new LoginCheck(args);
    if (login1.login()) {
      System.out.println("登陆成功");
    } else {
      System.out.println("登陆失败");
    }
  }
}
