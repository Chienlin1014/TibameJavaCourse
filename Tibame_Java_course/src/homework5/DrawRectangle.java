package homework5;

import java.util.Scanner;
//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
public class DrawRectangle {
    //用*號畫出長方形
    public static void starSqiare(int width, int height) {
        for(int i=0; i<height;i++){
            for(int j =0;j<width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("請輸入寬：");
        Scanner sc =new Scanner(System.in);
        int width = sc.nextInt();
        System.out.println("請輸入高：");
        int height = sc.nextInt();
        starSqiare(width,height);
    }
}
