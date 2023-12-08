package day15.innerClass;

class OuterClass {  // 외부 클래스
	
	static int no;
	String message = "hello~~~";
	
	public void outerMethod() {
		System.out.println("outer method call~");
//		System.out.println(su);  // error : 내부 클래스 메소드는 외부 클래스에서 사용 불가
//		show();  // error : 내부 클래스 메소드는 외부 클래스에서 사용 불가
	}
	
	class InnerClass {  // 내부 클래스
		int su = 99;
		
		public void show() {
			System.out.println(su);  // 내부(자신의 것) 사용 가능
			System.out.println(message);  // 외부 클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod();  // 외부 클래스 메소드 호출
		}
	} // inner class end

}  // outer class end

public class MainEntry {
	public static void main(String[] args) {
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();  // 안쪽에 객체를 또 생성했을 때
		inner.disp();
		inner.show();
		System.out.println("-------------------------------------");
		
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
	}
}
