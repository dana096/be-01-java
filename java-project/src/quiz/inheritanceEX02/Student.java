package quiz.inheritanceEX02;

public class Student extends Person {
	private int jumsu;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public void input() {
		super.input();
		System.out.print("jumsu = ");					
		jumsu = sc.nextInt();
	}

	public Student(String name, String gender, int age, int jumsu) {
		super(name, gender, age);
		this.jumsu = jumsu;
	}

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	public void display() {
		super.display();
		System.out.println("점수 : " + jumsu);
	}

}
