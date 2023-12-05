package day09_abstract.ex01;

abstract class Shape {  // abstract class, super class   ==> 추상 클래스는 몸체가 없어도 가질 수 있다
	double result = 0;
	public abstract double calc();  // abstract method
	public abstract void draw();
	
	public void show() {  // 일반 메소드(블럭이 있으면 일반 메소드)
		System.out.println("Super class Shape");
	}
}  // Shape class end

class Circle extends Shape {  // Sub class
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
		
	}
	
}  // Circle end

class Triangle extends Shape {
	
	int w = 3, h = 5;

	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");
		
	}
	
}  // Triangle end

class Rectangle extends Shape {
	
	int w = 3, h = 5;

	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");
		
	}
	
}  // Rectangle end

public class MainEntry {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		
		new Triangle().draw();
		
	    new Rectangle().draw();
	    	    
	    System.out.println("=================================================");
	    
	    // 다양하게 표현 가능
	    Shape sh = new Circle();
	    sh.draw();
	    
	    sh = new Rectangle();
	    sh.draw();
		//Shape sh = new Shape();  // 자체적으로 객체를 생성할 수 없다
	}

}
