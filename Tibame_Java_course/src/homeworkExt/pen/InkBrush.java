package homeworkExt.pen;

public class InkBrush extends Pen {
    public InkBrush(String brand, int price) {
        super(brand, price);
    }

    public InkBrush() {

    }

    @Override
    public void write() {
        System.out.println("沾墨水再寫");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
