package homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalTest {
    public static void main(String[] args) throws IOException {
        Calculator cal = new Calculator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        System.out.println("請輸入x值:");
        String str1, str2;
        str1 = br.readLine();
        System.out.println("請輸入y值:");
        str2 = br.readLine();
        boolean whileCtrl = true;
        while (whileCtrl) {
            try {
                x = Integer.parseInt(str1);
                y = Integer.parseInt(str2);
                System.out.println("x的y次方為：" + cal.powerXY(x, y));
                whileCtrl = false;
            } catch (CalException | NumberFormatException e) {
                if (e instanceof NumberFormatException) {
                    System.out.println("輸入格式不正確");
                }
                if (e instanceof CalException) {
                    System.out.println(e);
                }
                System.out.println("請重新輸入x值:");
                str1 = br.readLine();
                System.out.println("請重新輸入y值:");
                str2 = br.readLine();
            }
        }
    }
}
