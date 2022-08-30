public class NewDemo01 {
  public static void main(String[] args) {
    fun(1);
    fun(1, 2, 3);
    fun(1, 23, 4, 56);
  }
  public static void fun(int... args) {
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i]+"\t");
    }
    System.out.println();
  }
}
