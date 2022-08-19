package classPractice;

public class WeightTest {
    public static void main(String[] args) {
        WeightMethod[] ob=new WeightMethod[3];
        ob[0]=new Dog();
        ob[1]=new Plane();
        ob[2]=new Powder();
        for(int i=0;i< ob.length;i++){
            ob[i].getWeightTool();
        }
    }
}
