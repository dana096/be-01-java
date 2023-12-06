package day13.IO.generic;

// 타입이 결정나지 않은 클래스 => 클래스명<임시로 적어놓을 문자>
public class GenericEx<T> {
	
	T[] v;  // 멤버변수
	
	public void set(T[] v) {
		this.v = v;
	}
	
	public void print() {
		for (T item : v) {
			System.out.println(item);
		}
	}

}
