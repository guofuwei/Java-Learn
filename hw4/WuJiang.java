/**
 * 三国人物类，包含姓名、智慧值、攻击值、防御值四个属性，然后由3个
 */
public class WuJiang {
	String name; // 名字
	int zhihui; // 智慧值
	int gongji; // 攻击值
	int fangyu; // 防御值
	int nengli; // 能力值（智慧+攻击+防御）

	// 构造方法
	public WuJiang(String name, int zhihui, int gongji, int fangyu) {
		this.name = name;
		this.zhihui = zhihui;
		this.gongji = gongji;
		this.fangyu = fangyu;
		setNengli();
	}

	// 计算能力值（智慧+攻击+防御）
	public void setNengli() {
		nengli = zhihui + gongji + fangyu;
	}

	// 改写该解析程序，将字符串信息解析出来，存放在WuJiang数组中
	public static void parse(WuJiang[] wj, String str) {
		String str1 = str;
		int num = 0;

		while (str1 != null) {
			// 主要改写这个部分
			int i = str1.indexOf(';');
			if (i >= 0) {
				// System.out.println(str1.substring(0, i));
				String str2 = str1.substring(0, i);
				str1 = str1.substring(i + 1);
				// System.out.println(str2);
				int count = 0;
				String name = "none";
				int zhihui = 0;
				int gongji = 0;
				int fangyu = 0;
				while (str2 != null) {
					count++;
					if (count == 5)
						break;
					int j = str2.indexOf(",");
					// System.out.println(j);
					switch (count) {
						case 1:
							name = str2.substring(0, j);
							// System.out.println(name);
							break;
						case 2:
							zhihui = Integer.parseInt(str2.substring(0, j));
							// System.out.println(zhihui);
							break;
						case 3:
							gongji = Integer.parseInt(str2.substring(0, j));
							// System.out.println(gongji);
							break;
						case 4:
							fangyu = Integer.parseInt(str2);
							// System.out.println(fangyu);
							break;
					}
					// System.out.println(str2.substring(0, j));
					str2 = str2.substring(j + 1);
				}
				wj[num] = new WuJiang(name, zhihui, gongji, fangyu);
				num++;
			} else {
				str1 = null;
			}
		}
	}

	// 以字符串形式格式化输出WuJiang对象
	public String toString() {
		return name + "(" + zhihui + "," + gongji + "," + fangyu + ")";
	}

	// 遍历输出WuJiang数组
	public static void printAll(WuJiang[] wj) {
		for (int i = 0; i < wj.length; i++)
			if (wj[i] != null) {
				System.out.println(wj[i].toString());
			}
	}

	public static void main(String[] args) {
		// WuJiang gy = new WuJiang("关羽",90,98,95);
		// WuJiang zf = new WuJiang("张飞",85,95,90);
		// WuJiang lb = new WuJiang("刘备",88,85,90);
		WuJiang[] wj = new WuJiang[5];
		String str = "gy,90,98,95;zf,85,95,90;lb,88,85,90;";
		parse(wj, str);
		printAll(wj);
	}

}
