package homework5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
public class RanAvg {
    public static void ranAvg() {
        int[] num=new int[10];
        int sum=0;
        System.out.println("本次亂數結果：");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 101);
            sum+=num[i];
            System.out.print(num[i]+" ");
        }
        System.out.println("平均："+(sum/num.length));
    }
    public static void main(String[] args) {
      ranAvg();
    }
}
