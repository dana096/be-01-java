package day09_interface.ex02;

public class MainEntry {
	public static void main(String[] args) {
		//1. 
		BB b = new BB();
		b.draw();
		b.show();
		
		System.out.println("========================");
		
		//2.
		IDraw bb = new BB();
		bb.draw();
		
	}
}
