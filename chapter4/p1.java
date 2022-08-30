public class p1 {
  public static void main(String[] args) {
    long ret;
    for (int i = 1; i <= 30; i++) {
      ret = calFun(i);
      System.out.println(i + "!=" + ret);
    }
  }
  public static long calFun(int num) {
    if (num == 1)return 1;
    return num * calFun(num - 1);
  }
}
