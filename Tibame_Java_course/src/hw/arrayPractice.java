package hw;

public class arrayPractice {

	public static void main(String[] args) {
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		System.out.println("x陣列為");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 30);
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("y陣列為");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				y[i][j] = (int) (Math.random() * 30);
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("z陣列為");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	}
}
