public class Arraydemo09 {
  public static void main(String[] args) {
    int score[][] = {
      {67, 61}, {78, 89, 83}, {99, 100, 98, 66, 95}
    };
    for (int i = 0; i < score.length; i++) {
      System.out.println("Line " + (i + 1) + " length:" + score[i].length);
      for (int j = 0; j < score[i].length; j++) {
        System.out.print(score[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
