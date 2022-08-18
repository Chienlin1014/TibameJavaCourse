package practice_temp;

import java.io.IOException;

public class practice001 {

	public static void main(String[] args) throws IOException {
		System.out.println("計算2的n次方，請輸入次方值：");
		char ch = (char) System.in.read();
		String str =Character.toString(ch);
		double pow =Double.parseDouble(str);
		System.out.println("2的"+pow+"次方等於"+Math.pow(2, pow));
		System.out.println("再算一次次方值");
		byte[] b=new byte[10];
		System.in.read(b);
		pow=Double.parseDouble(new String(b));//將位元陣列轉成字串再轉成double
		System.out.println("2的"+pow+"次方等於"+Math.pow(2, pow));

	}

}
