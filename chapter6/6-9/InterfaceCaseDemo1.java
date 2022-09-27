interface Fruit {
  public abstract void eat();
}
class Apple implements Fruit {
  public void eat() {
    System.out.println("Eat Apple");
  }
}
class Orange implements Fruit {
  public void eat() {
    System.out.println("Eat Orange");
  }
}

class Factory {
  public static Fruit getInstance(String className) {
    Fruit f = null;
    if ("apple".equals(className)) {
      f = new Apple();
    }
    if ("orange".equals(className)) {
      f = new Orange();
    }
    return f;
  }
}


public class InterfaceCaseDemo1 {
  public static void main(String[] args) {
    Fruit f = Factory.getInstance(args[0]);
    if (f != null) {
      f.eat();
    }
  }
}
