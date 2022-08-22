package homework6.pen;

public class PenMain {
    public static void main(String[] args) {
        Pen[] p=new Pen[4];
        p[0]=new Pencil("Pilot", 40);
        p[1]=new Pencil();
        p[2]=new InkBrush("大利", 100);
        p[3]=new InkBrush();
        p[1].setBrand("Mitsubishi");
        p[1].setPrice(50);
        p[3].setBrand("書香");
        p[3].setPrice(150);
        for(int i=0; i<p.length;i++){
            System.out.print("品牌："+p[i].getBrand()+"，價格為："+p[i].getPrice()+"\n使用方式為：");
            p[i].write();
        }
    }
}
