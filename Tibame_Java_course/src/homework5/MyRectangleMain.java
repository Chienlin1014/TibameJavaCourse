package homework5;

public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle[] mr=new MyRectangle[2];
        mr[0]=new MyRectangle();
        mr[0].setWidth(10);
        mr[0].setDepth(20);
        System.out.println("無參數建構子");
        mr[0].getArea(); //無輸入參數
        System.out.println("有參數建構子");
        mr[1] = new MyRectangle(10, 20);
        mr[1].getArea();
    }
}
