package day08_inheritance.ex01;

public class Rectangle extends Point {
	private int x2, y2;
	
	// 생성자 함수
	public Rectangle() {
		x2 = y2 = 100;
		System.out.println("Rectangle default constructor call");
	}
	
	public Rectangle(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangle 4개 constructor call");
	}

	public Rectangle(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangle 2개 constructor call");
	}
    
	// getter / setter
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	// display
	public void display() {
		super.display();  // Super class 멤버에 접근
		System.out.println(", " + x2 + ", " + y2);
	}

}
