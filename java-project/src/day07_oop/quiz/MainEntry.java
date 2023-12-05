package day07_oop.quiz;

import day07_oop.ex02.Point;

public class MainEntry {
	public static void main(String[] args) {
		TV cc = new TV();
		TV cc1 = new TV("red");
		cc.display();
		cc.setColor("blue");
		cc.setChannel(7);
		cc.display();
		
		TV cc2 = new TV(7);
		cc2.display();
		
		TV cc3 = new TV("aqua", 15);
		cc3.display();
	}

}
