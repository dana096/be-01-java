package day08_inheritance.ex01;
//private < default < protected < public
public class Point {  // Super(부모)
	protected int x, y;  // 보호모드 : protected
	
	public Point() {
		x = y = 100;
		System.out.println("Point default constructor call");
	}

	public Point(int x) {
		this.x = x;
		System.out.println("Point 1개 constructor call");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2개 constructor call");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.print(x + ", " + y);
	}
	
}
