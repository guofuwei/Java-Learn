interface Window {
  public void open();
  public void close();
  public void activated();
  public void iconified();
  public void deiconified();
}
class WindowAdapter implements Window {
  public void open() {}
  public void close() {}
  public void activated() {}
  public void iconified() {}
  public void deiconified() {}
}
class WindowImple extends WindowAdapter {
  public void open() {
    System.out.println("window open");
  }
  public void close() {
    System.out.println("window close");
  }
}

public class AdapterDemo1 {
  public static void main(String[] args) {
    WindowImple win = new WindowImple();
    win.open();
    win.close();
  }
}
