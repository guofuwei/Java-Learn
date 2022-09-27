public class test {

//···
  public static void main(String[] args) {
    Power v5Power = new V5Power();
    System.out.println("my power is " + v5Power.power);
  }
}
class Power {
  int power;
}

class V5Power extends Power {
  int power = 5;

  public V5Power() {
    System.out.println("my power is 5V...");
  }
}
