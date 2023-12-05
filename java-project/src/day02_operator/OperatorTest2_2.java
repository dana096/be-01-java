package day02_operator;

public class OperatorTest2_2 {
	public static void main(String[] args) {
		// 대입(배정)연산자 : =, +=, -=, /=, *=, >>=, <<=, %=,...
		
		int x = 3, y = 5, result;
		result = x + y;
		System.out.println(result);
		
		x = x + y;
		x += y;
		System.out.println("x = " + x + ", y = " + y);
		
		x = x * y;
		x *= y;
		
		x = x + 1;
		x += 1;
		x++;  // 위 3줄 모두 결과값 같음
	}

}
