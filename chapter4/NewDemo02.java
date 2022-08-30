public class NewDemo02 {
  public static void main(String[] args) {
    fun(1);
    fun(1, 2, 3);
    fun(1, 23, 4, 56);
  }
  public static void fun(int... args) {
    for (int i:args) {
      System.out.print(i+"\t");
    }
    System.out.println();
  }
}
