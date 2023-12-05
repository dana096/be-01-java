package day07_oop.ex01;

class Point {
	private int x, y;  // 멤버변수, int 0, double/float 0.0 String null로 초기화된다
	
	// 멤버함수 - getter / setter method
	public void setX(int xx) { x = xx; }
	public int getX() { return x; }
	public void setY(int yy) { y = yy; }
	public int getY() { return y; }
	public void display() {
		//System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
}  // Point end

class Circle {
	private int x, y, r;
	//getter / setter
	public void setX(int xx) { x = xx; }
	public int getX() { return x; }
	public void setY(int yy) { y = yy; }
	public int getY() { return y; }
	public void setR(int rr) { r = rr; }
	public int getR() { return r; }
	
	// output
	public void display() {
		System.out.println("x =" + x + ", y = " + y + ", r = " + r);
	}
	
}  // Circle end

public class MainEntry {
	public static void main(String[] args) {
		// Circle 객체 생성해서 출력하기
		Circle cc = new Circle();  // 객체생성, 메모리에 할당, 생성자함수 자동호출
		cc.setX(55);
		cc.setY(100);
		cc.setR(33);
		cc.display();
		
		Point pt = new Point();  // 객체생성, 메모리에 할당, 생성자함수 자동호출
		System.out.println(pt.getX() + ", " + pt.getY()); // 0.0 
		pt.setX(55);
		pt.setY(100);
		//System.out.println(pt.getX() + ", " + pt.getY());  // 55, 100
		pt.display();
//		pt.x = 3;
//		pt.y = 5;
//		System.out.println(pt.x + ", " + pt.y);		
	}
}  // MainEntry end
