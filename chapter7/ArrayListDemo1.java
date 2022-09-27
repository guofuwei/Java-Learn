import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1 {
  public static void main(String[] args) {
    ArrayList<String> demo1=new ArrayList<String>(); 
    demo1.add("a");
    demo1.add("b");
    Iterator<String> iter=demo1.iterator(); 
    while(iter.hasNext()){
      System.out.println(iter.next());
    }
  }
}
