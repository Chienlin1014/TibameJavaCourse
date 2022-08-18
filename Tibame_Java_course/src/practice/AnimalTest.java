package practice;

public class AnimalTest {

	public static void main(String[] args) {
		Animals an1 =new Animals(2, 5.0f);
		an1.speak();
		System.out.println("----時光飛逝，三年過去了----");
		an1.setAge(5);
		an1.setWeight(25.0f);
		an1.speak();
	}

}
