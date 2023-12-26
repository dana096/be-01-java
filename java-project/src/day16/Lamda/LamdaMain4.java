package day16.Lamda;

//타입을 써야 할 상황이 있다.
interface Message{
	void something(int x, int y); 
}

interface Talk{
	void something(String x, String y); //functional interface
}

class Person{
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", "World");
	}
	
	
}

public class LamdaMain4 {
	static int num = 100;
	public static void main(String[] args) {
		//Lamda Expression, JDK 1.8이상
		
		Person p = new Person();
		p.greeting(new Message() { 
			@Override
			public void something(int x, int y) {
				System.out.printf("parameter value x: %d, y: %d\n", x, y);
			}			
			
		});

		System.out.println("=================================");
		char ch = 'A';
		p.greeting((int x, int y) -> { 
			System.out.printf("parameter value x: %d, y: %d\n", x, y);
		});
		
		p.greeting((String x, String y) -> {
			System.out.printf("parameter value x: %s, y: %s\n", x, y);
			System.out.println(ch);
			
//			ch = 'B'; //람다는 타입 변경이나 값변경이 안된다.
			num =2222; //static 변수는 람다에서 변경이 가능하다.
			System.out.println(num);
		});
		
	}
}
