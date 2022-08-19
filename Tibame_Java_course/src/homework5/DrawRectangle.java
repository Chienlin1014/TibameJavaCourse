package homework5;

public class DrawRectangle {
    public static void starSqiare(int width, int height) {
        for(int i=0; i<height;i++){
            for(int j =0;j<width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starSqiare(5,4);
    }
}
