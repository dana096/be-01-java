package day02_operator;

public class OperatorTest1_1 {
	public static void main(String[] args) {
		//관계연산자: >, <, >=, <=, ==(같다), !=(같지않다)
		
		int x = 3, y = 5;		
		boolean flag = true;
		
		System.out.println(!flag);  // t -> f, f -> t
		
		// 0, 0.0, NULL 를 제외한 모든 값은 '참'이다
		
		if(x > y) {
			System.out.println("max : " + x);
		} else {
			System.out.println("max : " + y);
		}
		
		if(x != y) {
			System.out.println("max : " + x);
		} else {
			System.out.println("max : " + y);
		}
	}

}
