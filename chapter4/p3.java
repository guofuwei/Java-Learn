public class p3 {
  public static void main(String[] args) {
    int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 0, 5, 4, 7, 6, 7, 0, 5};
    System.out.println("oldArr");
    for (int var : oldArr) {
      System.out.print(var+" ");
    }
    System.out.println();
    //int[] newArr={1,3,4,5,6,6,5,4,7,6,7,5};
    int [] newArr = getNewArr(oldArr);
    System.out.println("newArr");
    for (int var : newArr) {
      System.out.print(var+" ");
    }
    System.out.println();
  }
  public static int[] getNewArr(int[] oldArr) {
    int count = 0;
    for (int i = 0; i < oldArr.length; i++) {
      if (oldArr[i] != 0)count++;
    }
    int newArr[] = new int[count];
    int j = 0;
    for (int i = 0; i < oldArr.length; i++) {
      if (oldArr[i] != 0) {
        newArr[j] = oldArr[i];
        j++;
      }
    }
    return newArr;
  }
}
