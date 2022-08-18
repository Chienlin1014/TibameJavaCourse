package hw;

public class Homework001 {

	public static void main(String[] args) {
		// 計算12、6兩個數值之和與積
		System.out.println("12、6之和為" + (12 + 6));
		System.out.println("12、6之積為" + 12 * 6);
		System.out.println("====================================================");
		// 計算200顆蛋共是幾打幾顆(1打12顆)
		System.out.println("200顆蛋為" + (200 / 12) + "打，" + (200 % 12) + "顆");
		System.out.println("====================================================");
		// 256559秒為幾天、幾小時、幾分、幾秒
		int totalSec = 256559;
		int day = totalSec / 86400;
		int hr = (totalSec % 86400) / 3600;
		int min = (totalSec % 3600) / 60;
		int sec = (totalSec % 60);
		System.out.println("256559秒為" + day + "天" + hr + "小時" + min + "分" + sec + "秒");
		System.out.println("====================================================");
		// 定義Pi為3.1415，求半徑為5的圓面積及周長;
		double pi = 3.1415;
		System.out.printf("圓面積為：" + "%7.4f%n", (Math.pow(5, 2) * pi));
		System.out.printf("圓半徑為" + "%7.4f%n", (5 * 2 * pi));
		System.out.println("====================================================");
		// 某人存150萬，利息為2%，以複利計算10年後本利和為何
		double money = 1500000;
		for (int i = 1; i <= 10; i++) {
			money *= 1.02;
		}
		System.out.println("存150萬，十年後本利和為" + (int) money + "元");
		System.out.println("====================================================");
		// 5+5 純整數型別相加，故答案為10
		System.out.println("5+5=" + 5 + 5);
		// '5'Unicore字元編碼為0x35，換算10進位為53，故相加為58
		System.out.println("5+'5'=" + (5 + '5'));// 若不用括號把5+'5'包起來會變成字串串接(ˊ_>ˋ)
		// 5+"5"，整數型別+字串，會直接串接在一起，故為55
		System.out.println("5+\"5\"=" + 5 + "5");
	}
}