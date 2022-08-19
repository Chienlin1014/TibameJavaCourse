package homework5;

public class RandomString {
    public static void getAuthCode() {
        int num;
        for (int i = 1; i < 8; i++) {
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
        getAuthCode();
    }
}
