package day09_abstract.ex02;

public class MainEntry {
	public static void main(String[] args) {
		//1. 각자의 클래스로 객체 생성 형태
		//new Circle().show("원");
		Circle c = new Circle();
		c.show("Circle");
		
		Triangle t = new Triangle();
		t.show("T"
				+ "riangle");
		
		Rectangle r = new Rectangle();
		r.show("Rectangle");
		
		System.out.println("====================================================");
		
		//2. Shape 부모 추상클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원원원");
		
		sh = new Triangle();
		sh.show("삼각형");
		
		sh = new Rectangle();
		sh.show("사각형");
		
		System.out.println("====================================================");
		
		//3. 배열을 이용한 객체 생성
		Shape[] ss = new Shape[3];  // 배열 선언 및 객체 생성
		ss[0] = new Circle();
		ss[1] = new Triangle();
		ss[2] = new Rectangle();
		
		String[] name = {"Circle", "Triangle", "Rectangle"};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);			
		}
	}

}
