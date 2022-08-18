package hw;

public class ChiaHomeworkMulriple99 {

	public static void main(String[] args) {
		System.out.println("for...while迴圈版");
		for (int i = 1; i < 10; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("==============================================================");
		System.out.println("for...do...while迴圈版");
		for (int i = 1; i < 10; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		System.out.println("======================================================================");
		System.out.println("while+do...while迴圈版");
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
		System.out.println("======================================================================");
		System.out.println("單層for迴圈+條件控制版");
		for(int k=1,j=1;k<=9;) {
			System.out.print(k+"*"+j+"="+k*j+"\t");
			j++;
			if(j==10) {
				j=1;
				k++;
				System.out.println();
			}
		}
	}

}
