package practice;

public class multiplication_99 {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			int j=2;
			while(j<=9) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=2;i<10;i++) {
			int j=2;
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);
			System.out.println();
		}
		System.out.println();
		
		int i=2;
		while(i<=9) {
			int j=2;
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);
			i++;
			System.out.println();
		}
	}
}
