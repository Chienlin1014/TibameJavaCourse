package hw;

public class ChiaHomeworkMyBMI {

	public static void main(String[] args) {
		// 題目：計算BMI值，並判斷結果為過瘦、正常或超重
		double myHeight = 1.68;
		double myWeight = 60.0;
		// 不把BMI算出，直接判斷
		if (myWeight / (myHeight * myHeight) >= 24) {
			System.out.println("過重，該運動囉！");
		} else if (myWeight / (myHeight * myHeight) < 18.5) {
			System.out.println("過瘦，該多吃點囉！");
		} else {
			System.out.println("正常，請繼續保持。");
		}

		// 宣告變數儲存計算出之BMI，保留2位小數，並判斷
		double myBMI = myWeight / Math.pow(myHeight, 2);
		System.out.printf("我的BMI： %.2f%n", myBMI);
		if (myBMI >= 24) {
			System.out.println("過重，該運動囉！");
		} else if (myBMI < 18.5) {
			System.out.println("過瘦，該多吃點囉！");
		} else {
			System.out.println("正常，請繼續保持。");
		}
	}

}
