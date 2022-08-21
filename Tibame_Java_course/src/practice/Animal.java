package practice;

public class Animal {

	private int age;
	private float weight;
	//當宣告有自己的constructor，議會把無參數之建構子宣告出來
	//維持對應的彈性，無參數建構子也是為了給日後搭配的工具(框架)使用。
	public Animal() {
		this(0, 0.0f);
	}
	public Animal(int age, float weight){
		this.age=age;
		this.weight=weight;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}
	public void speak() {
		System.out.println("Age is "+age);
		System.out.println("Weight is "+weight);
	}
}
