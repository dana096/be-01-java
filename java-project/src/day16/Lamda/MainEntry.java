package day16.Lamda;


// JDK 8.0이상에서 등장
// 형식 > (매개변수) -> {실행문}
// 불필요한 클래스의 정의도 없다.  >> 재사용할 일 없는 클래스에서만 사용 권장
// 메소드의 리턴 타입도 없고, 이름도 없다.(익명) >> Anonymous Function >> 익명 클래스로 봐도 됨

// public int sum(int x, int y) {return x + y; }  >> (x, y) -> {x + y};

// 장점: 
// 코드를 간결하게 만들 수 있다.
// 코드가 간결하고 식에 개발자의 의도가 명확히 드러나기에 가독성이 향상된다.
// 코딩시간이 줄어든다.
// 병렬 프로그래밍이 가능하다.

// 단점:
// 재사용이 불가능하다.
// 디버깅이 다소 까다롭다.
// 람다를 남발하면 코드가 지저분하다(중복 생성 할 가능성이 높음)
// 재귀로 만들 경우에는 부적합하다.                                                                      


//interface Message{
//	void something(); //리턴 타입이 없는 형태
//}
//
//class Person{
//	public void greeting(Message msg) {
//		msg.something();
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.greeting(new Message() { // 일반 스타일
//			@Override
//			public void something() {
//				System.out.println("good morning");
//				System.out.println("한 주 동안 열공합시다.");
//			}			
//		});
//		System.out.println("=================================");
//		p.greeting(() -> {
//			System.out.println("lamda good morning");
//			System.out.println("lamda 한 주 동안 열공합시다.");
//		});
//	}
//}
