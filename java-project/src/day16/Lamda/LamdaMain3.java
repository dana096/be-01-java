package day16.Lamda;


//interface Message{
//	int something(int x, int y); //int 형태, parameter 여러개
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(1, 2); 
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LamdaMain3 {
//	public static void main(String[] args) {
//		//Lamda Expression, JDK 1.8이상
//		Person p = new Person();
//		p.greeting(new Message() { // 리턴타입도 있고, 매개변수도 있는 상태
//			@Override
//			public int something(int x, int y) {
//				System.out.printf("parameter value x: %d, y: %d\n", x, y);
//				return 100;
//			}			
//		});
//		System.out.println("=================================");
//		p.greeting((x, y) -> { //매개변수 목록 2개 이상이면 괄호 생략 X
//			System.out.printf("parameter value x: %d, y: %d\n", x, y);
//			return x + y;
//		});
//		
//		p.greeting((x, y) -> {return x + y;});
//		p.greeting((x, y) -> x + y);
//	}
//}
