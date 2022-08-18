package hw;

public class ChiaHomeworkTest4Number {

	public static void main(String[] args) {
		System.out.println("for迴圈寫法");
		System.out.println("4的倍數有：");
		for (int i = 0; i <= 100; i++/* i+=4 */) { // i屬於for迴圈之區域變數
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
		System.out.println("\n");
		System.out.println("while迴圈寫法");
		System.out.println("4的倍數有：");
		int i = 0; // 可重新再宣告一次i
		while (i <= 100) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i++/* i+=4 */;
		}
		System.out.println("\n");
		System.out.println("do...while迴圈寫法");
		System.out.println("4的倍數有：");
		int j = 0;
		do {
			if (j % 4 == 0) {
				System.out.print(j + " ");
			}
			j++/* j+=4 */;
		} while (j <= 100);
	}

}
