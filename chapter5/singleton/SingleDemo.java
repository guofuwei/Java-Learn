public class SingleDemo {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    s1.print();
  }
}

class Singleton {
  private static Singleton instance = new Singleton();
  private Singleton() {
  }
  public static Singleton getInstance() {
    return instance;
  }
  public void print() {
    System.out.println("Hello");
  }
}
