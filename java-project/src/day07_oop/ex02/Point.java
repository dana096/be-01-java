package day07_oop.ex02;

public class Point {
	private int x, y;  // 멤버변수
	
	// 생성자함수 2개 - (자동으로 만들기)
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int x) {
		this.x = x;
	} 


	// 멤버함수
	public void setX(int xx) {
		x = xx;
	}

	public int getX() {
		return x;
	}
	public void setY(int yy) {
		y = yy;
	}
	public int getY() {
		return y;
	}
	
//	public String toString() {
//		return x + ", " + y;
//	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void display() {
		//System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}

}
