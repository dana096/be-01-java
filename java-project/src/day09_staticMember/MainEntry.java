package day09_staticMember;

class Atm {
	int count;  // instance member : 객체 생성이 꼭 필요하며, 매번 초기화됨
	static int total;  // static member : 객체 생성 없이도 불러올 수 있고 초기화는 딱 1번이며 객체가 또 생기면 앞의 객체들과 공유된다
	
	public Atm(int amount) { // constructor
		count += amount;  // count = count + amount;
		total += amount;  // total = total + amount;
	}
	
	public static void view() {  // static method 에서는 일반(instance) 멤버 변수는 사용할 수 없으며, static member 변수만 사용할 수 있다
//		count = count + 100;  // error
		total = total + 100;
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total;  // static member 에는 this 사용하지 않는다
	}
	
	public void display() {  // instance method에서는 instance member와 static member 모두 사용 가능하다
		count = count + 200;
		total = total + 200;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}  // Atm class end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display();  // c : 1000  , t : 1000
		System.out.println("==============================");
		Atm at2 = new Atm(1000);
		at2.display();  // c : 1000 , t : 2000(1000+1000) => 앞의 객체에서 생성된 값이 유지되므로
		System.out.println("==============================");
		Atm at3 = new Atm(1000);
		at3.display();  // c : 1000 , t : 3000(1000+1000+1000) => 앞의 객체에서 생성된 값이 유지되므로
		
		System.out.println(at.count);  // instance member는 객체를 불러야한다
		System.out.println(Atm.total);  // static member는 클래스를 불러도 된다
	}

}
