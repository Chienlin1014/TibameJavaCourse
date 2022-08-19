package homework5;

import java.io.FileReader;

//• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//        genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//        與數字的亂數組合,如圖:
public class RandomString {
    public static void getAuthCode() {
        int num;
        for (int i = 0; i < 8; i++) {
            num = (int) (Math.random() * 75 + 48);
            while ((num > '9' && num < 'A') || (num > 'Z' && num < 'a')) {
                num = (int) (Math.random() * 75 + 48);
            }
//            可用下列式子取代，數字代表的是unicode編碼
//            while ((num>57&&num<65)||(num>90&&num<97)){
//                num=(int)(Math.random()*75+48);
//            }
            System.out.print((char) num);
        }
    }
    public static void main(String[] args) {
        System.out.print("本次產生之驗證碼為：");
        getAuthCode();
   }
}
