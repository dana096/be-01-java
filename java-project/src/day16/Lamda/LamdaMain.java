package day16.Lamda;


//interface Message{
//	int something(); //리턴 타입이 있는 형태
//}
//
//class Person{
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LamdaMain {
//	public static void main(String[] args) {
//		//Lamda Expression, JDK 1.8이상
//		Person p = new Person();
//		p.greeting(new Message() { // return 상태
//			@Override
//			public int something() {
//				System.out.println("good morning");
//				System.out.println("한 주 동안 열공합시다.");
//				return 300;
//			}			
//		});
//		System.out.println("=================================");
//		p.greeting(() -> {
//			System.out.println("lamda good morning");
//			System.out.println("lamda 한 주 동안 열공합시다.");
//			return 50;
//		});
//	}
//}
