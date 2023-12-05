package day09_abstract.quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans tr = new Subway();
		tr.show1("신대방삼거리");
		tr.show2("보라메");
		
		System.out.println("\n*****\n");
		
		new Bus().show1("서울역");
		new Bus().show2("서울역");
	}
}
