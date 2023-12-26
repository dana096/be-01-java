package day16.Lamda;


//interface Message{
//	int something(int x); 
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something(80); 
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LamdaMain2 {
//	public static void main(String[] args) {
//		//Lamda Expression, JDK 1.8이상
//		Person p = new Person();
//		p.greeting(new Message() { // 리턴타입도 있고, 매개변수도 있는 상태
//			@Override
//			public int something(int x) {
//				System.out.println("good morning");
//				System.out.println("한 주 동안 열공합시다.");
//				System.out.println("parameter value: " + x);
//				return 100;
//			}			
//		});
//		System.out.println("=================================");
//		p.greeting(y -> { //int x처럼 타입 안써도 되고, 하나일때는 괄호도 안써도 됨. 람다형태 
//			System.out.println("lamda good morning");
//			System.out.println("lamda 한 주 동안 열공합시다.");
//			System.out.println("parameter value: " + y);
//			return y;
//		});
//		p.greeting(x -> 666);
//	}
//}
