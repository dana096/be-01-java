package day02_operator;

public class MainEntry3 {
	public static void main(String[] args) {
		// 산술연산자 : +, -, *, /, %, .....
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println("x * y = " + gob);
		System.out.println("x * y = " + (x*y));
		System.out.println(x + " * " + y + " = " + gob);
		System.out.println("\n\n3+4*5 = " + (3+4*5));
		System.out.println("(3+4)*5 = " + ((3+4)*5));
		
		
		// 정수 (+, -, *, \, %,......) 정수 = 정수
		System.out.println("\n 7 / 3 =" + (7/3));  // 2, 몫
		System.out.println("7 % 3 =" + (7%3));  // 1, 나머지
		
		System.out.println("\n 7 / 3.0 =" + (7/3.));  // 2.3333333
		System.out.println("7.0 % 3.0 =" + (7. % 3.));  
		
	}


}
