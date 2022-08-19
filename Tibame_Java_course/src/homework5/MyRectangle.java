package homework5;

public class MyRectangle {
    private double width;
    private double depth;

    public void setWidth(double width) {
        this.width=width;
    }

    public void setDepth(double depth) {
        this.depth=depth;
    }
    public MyRectangle() {
    }
    public MyRectangle(double width, double depth) {
        this.width=width;
        this.depth=depth;
    }
    public void getArea(){
        System.out.println("Rectangle area="+width*depth);
    }
    public static void main(String[] args) {
        MyRectangle[] mr=new MyRectangle[2];
        mr[0]=new MyRectangle();
        mr[0].setWidth(10);
        mr[0].setDepth(20);
        System.out.println("無參數建構子");
        mr[0].getArea(); //無輸入參數
        System.out.println("參數建構子");
        mr[1] = new MyRectangle(10, 20);
        mr[1].getArea();
    }

}
