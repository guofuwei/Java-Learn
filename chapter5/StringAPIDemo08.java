public class StringAPIDemo08 {
  public static void main(String[] args) {
    String str = "192.168.2.1";
    String ret[] = str.split("\\.") ;
    for (int i = 0; i < ret.length; i++) {
      System.out.println(ret[i] + "\\");
    }
  }
}
