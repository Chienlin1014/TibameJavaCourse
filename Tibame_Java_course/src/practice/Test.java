package practice;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
// 		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
// 		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
// 		的號碼與總數，如圖：
// 		(提示：Scanner)
// 		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

 		int num, count = 0;
 		Scanner cin = new Scanner(System.in);
 		System.out.println("輸入不想要的數字 :");
 		int c = cin.nextInt();
 		
 		for (num = 1; num <= 49; num++) {
 			if (num % 10 == c || num / 10 == c) {
 			
 			}
 			if (count % 7 == 0) {
 				System.out.println();
 			}
 			System.out.print(num + "\t");
 			count++;
 		}
 		System.out.println();
 		System.out.print("總共可以選 :" + count + "個號碼");
 		System.out.println("隨機生成 六 號碼:");
 
         Random r = new Random();
 		int[] ran = new int[6];
 		for (int i = 0; i < ran.length; i++) {
 			ran[i] = (int) (Math.random() * 49) + 1;
 			for (int j = 0; j < i; j++) {
 				if (ran[i] == ran[j] || ran[i] == c) {
 					ran[i] --;
 					continue;
 				}
 			}
 		   System.out.print(ran[i] + " ");
 		}
	}

}
