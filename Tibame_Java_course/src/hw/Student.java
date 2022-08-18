package hw;

public class Student {
	int score = 60;

	public void play(int hours) {
		score -= hours; //
	}

	public void study(int hours) {
		score += hours;
	}

	public void showStudentScore() {
		System.out.println(score);
	}

	public static void main(String[] args) {
		Student nick = new Student();
		Student rockman = new Student();
		nick.play(10);
		nick.study(30);
		System.out.print("Nick之分數為：");
		nick.showStudentScore();
		rockman.play(20);
		rockman.study(50);
		System.out.print("Rockman之分數為：");
		rockman.showStudentScore();
		nick=rockman;
		System.out.print("Nick之分數為：");
		nick.showStudentScore();
	}
}
