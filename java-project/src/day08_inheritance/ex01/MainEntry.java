package day08_inheritance.ex01;

public class MainEntry {
	public static void main(String[] args) {
//		Circle c = new Circle();
//		c.display();
		
		new Circle().display();
		System.out.println("===========================");
		new Circle(1, 2, 3).display();
		System.out.println("===========================");
		new Rectangle().display();
		System.out.println("===========================");
		new Rectangle(1, 2, 3, 4).display();
		System.out.println("===========================");
		new Rectangle(50, 30).display();
	}

}
