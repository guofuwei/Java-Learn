public class ArrayRefDemo02 {
  public static void main(String[] args) {
    int temp[] = fun();
    java.util.Arrays.sort(temp);
    print(temp);
  }
  public static void print(int x[]) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
    System.out.println();
  }
  public static int[] fun() {
    int ss[] = {11,246,232,1, 3, 5, 7, 9};
    return ss;
  }
}
