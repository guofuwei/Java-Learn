public class MethodDemo03 {
  public static void main(String[] args) {
    System.out.println("x+y=" + add(10, 20));
    System.out.println("x+y+z=" + add(10, 20, 30));
    System.out.println("x+y=" + add(10.5, 20.3));
  }
  public static int add(int x, int y) {
    return x + y;
  }
  public static double add(double x, double y) {
    return x + y;
  }
  public static int add(int x, int y, int z) {
    return x + y + z;
  }
}
