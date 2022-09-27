/**
* 三国人物类，包含姓名、智慧值、攻击值、防御值四个属性，然后由3个
*/
public class WuJiang {
  String name;  //名字
  int zhihui;   //智慧值
  int gongji;   //攻击值
  int fangyu;   //防御值
  int nengli;   //能力值（智慧+攻击+防御）

  //构造方法
  public WuJiang(String name, int zhihui, int gongji, int fangyu) {
    this.name = name;
    this.zhihui = zhihui;
    this.gongji = gongji;
    this.fangyu = fangyu;
    this.nengli = -1;
  }

  //计算能力值（智慧+攻击+防御）
  public void setNengli() {
    this.nengli = this.zhihui + this.gongji + this.fangyu;
  }

  //与输入的武将进行战斗，能力和大的情况输出true
  public String zhanDou(WuJiang w) {
    //if(？)两个武将任何一个能力值为-1
    if (w.nengli == -1 || this.nengli == -1) {
      return "没有计算能力值";
    } else if (this.nengli > w.nengli) {
      return "赢";
    }
    //else if(？)自己比另一个武将w的能力要大
    else return "不能赢";
  }

  public static void main(String[] args) {
    WuJiang gy = new WuJiang("关羽", 90, 98, 95);
    WuJiang zf = new WuJiang("张飞", 85, 95, 90);
    WuJiang lb = new WuJiang("刘备", 88, 85, 90);
    gy.setNengli();
    zf.setNengli();
    lb.setNengli();
    System.out.println("关羽 Vs 刘备结果：" + gy.zhanDou(lb));
    System.out.println("张飞 Vs 关羽结果：" + zf.zhanDou(gy));
  }

}
