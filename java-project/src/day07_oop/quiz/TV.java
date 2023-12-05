package day07_oop.quiz;

public class TV {
	// color, channel;
	// getter / setter method
	String color;
	int channel; 
	
	
	// 생성자함수-------
	public TV() {  // default constructor -> 멤버변수 초기화 담당함
		color = "gray";
		channel = 11 ;
	}	
	public TV(String color) {
		this.color = color;
	}	
	public TV(int channel) {
		color = "pink";
		this.channel = channel;
	}
	public TV(String color, int ch) {
		this.color = color;
		channel = ch;  // this 생략 가능
	}
    //-----------------
	
	
	// 멤버함수
	public void setColor(String cc) {
		color = cc;
	}

	public String getColor() {
		return color;
	}

	public void setChannel(int hh) {
		channel = hh;
	}

	public int getY() {
		return channel;
	}

	public void display() {
		System.out.println(color + ", " + channel);
	}
	
	// output

}
