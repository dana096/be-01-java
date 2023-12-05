package day07_oop.ex02;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.display();  // 초기값
		pt.setX(100);
		pt.setY(100);
		pt.display();
		System.out.println(pt);
		System.out.println(pt.hashCode());
		System.out.println(pt.toString());
		
		System.out.println("\n=====Circle object=====");
		Circle c = new Circle();
		c.setX(100);
		c.setY(100);
		c.setR(3);
		c.display();
	}

}
