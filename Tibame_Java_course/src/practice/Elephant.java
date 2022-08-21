package practice;

public class Elephant extends Animal{
	private String name;
	Elephant(int age, float weight, String name){
	super(age,weight);
	this.name=name;
	}
	@Override //給JAVA相關工具的資訊， ex compiler or 框架工具。
	public void speak() {
		super.speak();
		System.out.println("Name is "+name);
	}
	public void setName(String name) {
		this.name=name;	
	}
	public void getName() {
		System.out.println(name);
		
	}
}
