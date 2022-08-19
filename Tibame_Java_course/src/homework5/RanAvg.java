package homework5;

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
