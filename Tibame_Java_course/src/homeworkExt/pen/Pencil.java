package homeworkExt.pen;

public class Pencil extends Pen {
    public Pencil(String brand, int price) {
        super(brand, price);
    }

    public Pencil() {

    }

    @Override
    public void write() {
        System.out.println("削鉛筆再寫");
    }

    @Override
    public double getPrice() {
        double price = (super.getPrice() * 0.8);
        return price;
    }
}
