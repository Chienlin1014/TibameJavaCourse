package homework5;
//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳
public class MaxElement {

    public static void maxElement(int x[][]) {
        int max=x[0][0];
        for(int i =0;i<x.length;i++){
            for(int j =0;j<x[i].length;j++){
                if(max<=x[i][j]){
                    max=x[i][j];
                }
            }
        }
        System.out.println("整數二維陣列最大值："+max);
    }
    public static void maxElement(double x[][]) {
        double max=x[0][0];
        for(int i =0;i<x.length;i++){
            for(int j =0;j<x[i].length;j++){
                if(max<=x[i][j]){
                    max=x[i][j];
                }
            }
        }
        System.out.println("整數二維陣列最大值："+max);
    }
    public static void main(String[] args) {
        int[][] intArray = {{1, 6, 3,}, {9, 5, 2}};
        double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
        maxElement(intArray);
        maxElement(doubleArray);
    }
}
