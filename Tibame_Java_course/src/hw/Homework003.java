package hw;

import java.util.Scanner;

public class Homework003 {
	private static void triangleJudge() {
		System.out.println("請輸入三邊長度以判斷是否為三角形：");
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		double side1square, side2square, side3square;
		side1square = Math.pow(side1, 2);
		side2square = Math.pow(side2, 2);
		side3square = Math.pow(side3, 2);
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			if (side1 == side2 || side1 == side3) {
				if (side2 == side3) {
					System.out.println("正三角形");
				} else {
					System.out.println("等腰三角形");
				}
			} else if (side1square + side2square == side3square || side1square + side3square == side2square
					|| side2square + side3square == side1square) { //直角三角形判定
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("這不是三角形");
		}
	}

	private static void guessNum9() {
		int rightNum = (int) (Math.random() * 10);
		System.out.print("開始猜數字囉，請輸入0~9之整數：");
		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();
		while (guessNum != rightNum) {
			while (guessNum < 0 || guessNum > 9) {
				System.out.print("數字超出範圍，請重新輸入：");
				guessNum = sc.nextInt();
			}
			System.out.print("猜錯囉，請再猜一次：");
			guessNum = sc.nextInt();
		}
		System.out.println("答對了，答案就是" + rightNum);
	}

	private static void guessNum100() {
		int rightNum = (int) (Math.random() * 101);
		System.out.print("開始猜數字囉，請輸入0~100之整數：");
		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();
		while (guessNum!=rightNum) {
			while(guessNum < 0 || guessNum > 100) {
				System.out.print("數字超出範圍，請重新輸入：");
				guessNum = sc.nextInt();
			}
			if(guessNum>rightNum) {
				System.out.print("猜錯囉，您的數字比中獎數字大，請再猜一次：");
				guessNum = sc.nextInt();
			}
			if(guessNum < rightNum) {
				System.out.print("猜錯囉，您的數字比中獎數字小，請再猜一次：");
				guessNum = sc.nextInt();
			}
		}
		System.out.println("答對了，答案就是" + rightNum);
	}
	private static void lottery() {
		System.out.print("請輸入阿文不喜歡的數字(1~9)：");
		Scanner sc = new Scanner(System.in);
		int hateNum = sc.nextInt();
		int count = 0; //計算放數值進去likeNum[]的次數
		int[] likeNum = new int[49]; //設定一個陣列以容納阿文喜歡的數字
		while (hateNum > 9 && hateNum <= 0) {
			System.out.println("錯誤，數字範圍1~9，請重新輸入：");
			hateNum = sc.nextInt();
		}
		for (int i = 1; i <= 49; i++) {
			if ((i % 10) != hateNum) { //已把餘數為討厭數字去除
				if (hateNum >= 5) { //討厭的數字>=5，不可能出現在10位數，故%10餘數不為5即可
					likeNum[count] = i;
					System.out.print(i + " "); 
					count++;
				} else { 
					/*討厭的數字<5，考慮出現在10位數的情形
					 * i-hateNum*10>=10||i < hateNum * 10 表示10位數不出現hateNum
					 * ex: i=30，hatNum*10=20，30-20=10，i=19<hatNum*10
					 * */
					if (i - hateNum * 10 >= 10 || i < hateNum * 10) { 
						likeNum[count] = i;
						System.out.print(i + " "); 
						count++; 
					}
				}
			}
		}
		System.out.println();
		System.out.println("可選的數字有：" + count + "個");
		System.out.println("輸入1開始自動選號(輸入其他訊息則程式結束)：");
		int autoChoose = sc.nextInt(); //設定是否自動選號
		if (autoChoose == 1) {
			System.out.print("系統自動選號：");
	        int[] randomArr = new int[6]; 
	        for (int i = 0; i < 6; i++){ 
	        	randomArr[i] = (int) (Math.random() * (count)); 
	            for (int j = 0; j < i; j++){ 
	                if (randomArr[i] == randomArr[j]){ 
	                    i--;  
	                }
	            }
	        }
	        for(int i = 0; i < 6; i++) {
	        	System.out.print(likeNum[randomArr[i]]+" ");
	        }
		}
	}

	public static void main(String[] args) {
		System.out.println("======作業======");
		System.out.println("1.三角形判斷");
		System.out.println("2.猜數字遊戲");
		System.out.println("3.阿文買樂透");
		System.out.print("請輸入作業代號以檢閱作業內容：");
		Scanner sc = new Scanner(System.in);
		int homeWorkNum = sc.nextInt();
		while (homeWorkNum < 1 || homeWorkNum > 3) {
			System.out.print("僅能輸入1~3，請重新輸入：");
			homeWorkNum = sc.nextInt();
		}
		switch (homeWorkNum) {
		case 1:
			triangleJudge();
			break;
		case 2:
			System.out.println("請輸入你想要玩的猜字遊戲代號");
			System.out.println("1. 0~9猜字遊戲");
			System.out.println("2. 0~100猜字遊戲");
			int guessGameNum = sc.nextInt();
			switch (guessGameNum) {
			case 1:
				guessNum9();
				break;
			case 2:
				guessNum100();
			}
			break;
		case 3:
			lottery();
			break;
		}
	}
}
