package hw;

public class Homework002 {

	public static void main(String[] args) {
		// 1至1000偶數和為何？
		// 純數學解法
		System.out.println("1至1000偶數和=" + (2 + 1000) * 500 / 2);
		// 迴圈解法
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0)
				sum += i;
		}

		System.out.println("1至1000偶數和=" + sum);
		System.out.println("====================================================");
		// 計算1~10之連乘積，for迴圈
		int multiple = 1;
		for (int i = 1; i <= 10; i++) {
			multiple *= i;
		}
		System.out.println("1~10之連乘積=" + multiple);
		// 計算1~10之連乘積，while迴圈
		multiple = 1; // reset
		int x = 1;//
		while (x <= 10) {
			multiple *= x;
			x++;
		}
		System.out.println("1~10之連乘積=" + multiple);
		System.out.println("====================================================");
		// 設計一隻程式輸出結果為1 4 9 16 25 36 49 64 81 100
		// 令i=0，k=1，n1=i+k、n2=n1+(k+2)、n3=n2+(k+2+2)
		for (int j = 0, k = 1; j < 100; k += 2) {
			j += k;
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("====================================================");
		// 阿文很熱衷大樂透，但不喜歡4，請列出1~49中不含有4之數字，無論個位或十位，共有幾個。
		int count = 0;
		System.out.print("可選數字為：");
		for (int i = 1; i <= 49; i++) { // 外迴圈列出1到49之數字
			if ((i % 10) != 4 && (i / 40 != 1)) { // if區塊條件判斷，個位數不為4(%10=4)&&十位數不為4(/40=1)
				System.out.print(i + " "); // print符合條件之數字
				count++; // 初始值為0，每進入if區塊之次數+1
			}
		}
		System.out.println();
		System.out.println("共有：" + count + "個數可選");
		System.out.println("====================================================");
		// 列出1-10，每列最大值減1，直到最後一列僅剩1。
		for (int i = 1, k = 0; i <= 10; i++) { // 設定列數，k值為讓最大值減少用
			for (int j = 1; j <= (10 - k); j++) { // 設定小迴圈列印值，條件判斷即為最大值上限故減k
				System.out.print(j + " ");
			}
			k++; // 小迴圈重複一次即讓k+1，以減少下次小迴圈之最大值
			System.out.println();
		}
		System.out.println("====================================================");
		//輸出： A BB CCC DDDD EEEEE FFFFFF (垂直排列)
		for (int i = 1; i <= 6; i++) { // 設定輸入數值1=A，2=B...6=F
			for (int j = 1; j <= i; j++) {// 設定輸入幾次
				switch (i) { // 外層迴圈中的i值為何
				case 1: // i值為1，輸出A，內迴圈數入次數<=i
					System.out.print("A");
					break;
				case 2:
					System.out.print("B");
					break;
				case 3:
					System.out.print("C");
					break;
				case 4:
					System.out.print("D");
					break;
				case 5:
					System.out.print("E");
					break;
				case 6:
					System.out.print("F");
					break;
				}
			}
			System.out.println();
		}
	}
}