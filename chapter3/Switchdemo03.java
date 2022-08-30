public class Switchdemo03 {
  public static void main(String[] args) {
    String str = "Hello";
    switch (str) {
    case "HELLO":
      System.out.println("content is HELLO");
      break;
    case "Hello":
      System.out.println("content is Hello");
      break;
    case "hello":
      System.out.println("content is hello");
      break;
    default:
      System.out.println("content is none");
    }
  }
}
