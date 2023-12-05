package day10_API.object;

class Rectangle {
	int x, y;
	
	public void display() {  // user method(사용자 메소드)
		System.out.println(x + ", " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	@override
//	public String toString() {
//		String str = x + ", " + y;
//		return str;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
//		r.display();  // 0, 0
		System.out.println(r);  // r.toString()와 같다  // 0, 0
	}

}
