package login;
public class LoginCheck {
  private String[] args;
  public LoginCheck(String[] args) {
    this.args = args;
  }
  private boolean isExit() {
    if (this.args.length != 2) {
      System.out.println("输入的格式不正确，程序将退出");
      System.out.println("格式为java main.main username password");
      System.exit(1);
    }
    return true;
  }
  private boolean checkArgs() {
    //if (this.args[0] == "hanshan" && this.args[1] == "password") {
    if (this.args[0].equals("hanshan") && this.args[1].equals("password")) {
      return true;
    }
    return false;
  }
  public boolean login() {
    this.isExit();
    if (!this.checkArgs()) {
      System.out.println("用户名或密码不正确");
      return false;
    } else {
      System.out.println("欢迎,hanshan");
      return true;
    }
  }
}
