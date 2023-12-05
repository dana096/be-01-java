package day09_interface.ex01;

import day09_abstract.ex02.Shape;

interface A {
	int x = 9;  // interface : abstract method, final member 만 가질 수 있다
	
	public void show();  // abstract 키워드 생략됨
	public abstract void disp();
	public int plus(int x, int y);
}  // A end

interface B {
	void bView();
}  // B end

interface C {
	String name = "happy";  // final 멤버는 초기화해야 한다
	public void draw();
	
//	name = "doyeon";  // final 멤버는 값 변경 금지 ==> 상수이기 때문
//	10 = 5;
}  // C end

interface D extends B {  // interface 간의 상속에서도 extends 를 사용한다
	void dView();
} // D end

class Rect implements C {

	@Override
	public void draw() {
		System.out.println(name + "님 반갑습니다.");
	}
	
}  // Rect class end

//class Multi implements B, C, A extends Shape {  // error
class Multi extends Shape implements B, C, A {

	@Override
	public void show() {  // A interface
		System.out.println("A interface");
		
	}

	@Override
	public void disp() {  // A
		System.out.println("disp call");
		
	}

	@Override
	public int plus(int x, int y) {  // A
		System.out.println("plus call");
		return 0;
	}

	@Override
	public void draw() {  // C interface
		System.out.println("draw call");
		
	}

	@Override
	public void bView() {  // B interface
		System.out.println("bView call");
		
	}

	@Override
	public double calc(double x) {  // Shape class
		System.out.println("calc call");
		return 5.3;
	}

	@Override
	public void show(String name) {  // Shape class
		System.out.println("show call" + name);
		
	}
	
}  // Mulit class end

public class MainEntry {
	
//	String name;  // 초기화되어 있지 않으면 문자는 null, 숫자는 0으로 표기된다
//	int x, y;
	
	public static void main(String[] args) {
		//A a = new A();  // 클래스가 아니기 때문에 객체 생성이 되지 않는다		
//		int x = 9;
//		x = 88;		
//		MainEntry me = new MainEntry();
//		System.out.println(me.name);  // null
//		System.out.println(me.x);  // 0
		
		Rect r = new Rect();  // 자기 자신으로 객체 생성
		r.draw();
		C rr = new Rect();  // 부모 C 인터페이스로 객체 생성
		rr.draw();
		System.out.println(rr.name);
		
		System.out.println("=======================================");
		
		Multi m = new Multi();
		m.bView();
		m.disp();
		
		Shape m2 = new Multi();  // 부모클래스를 이용해서 객체 생성
		m2.calc(3);
		m2.view();
		
		B m3 = new Multi();  // 부모인터페이스를 이용해서 자손클래스 객체 생성 가능
		m3.bView();
		
		A m4 = new Multi();
		m4.plus(1, 2);
		m4.show();
	}

}
