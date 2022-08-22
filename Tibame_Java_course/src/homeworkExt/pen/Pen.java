package homeworkExt.pen;

public abstract class Pen {
    private String brand;
    private double price;

    public Pen(String brand, double price) {
        this.brand=brand;
        this.price=price;
    }

    public Pen() {
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public abstract void write();
}
