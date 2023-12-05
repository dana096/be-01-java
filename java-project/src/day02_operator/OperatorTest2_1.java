package day02_operator;

public class OperatorTest2_1 {
	public static void main(String[] args) {
		//삼항(조건) 연산자 : (조건) ? 참 : 거짓;
		
		int x = 20, y = 10;
		String msg = null;   // msg = "";
		
		msg = (x !=y) ? "not name" : "same";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;
		result = (a > b) ? a : (b > c) ? b : c ;  // if를 여러번 쓸 수 있다
		System.out.println(result);

/*	삼항 연산자 예시	
		result = (a > b) ? a : 
			                 (b > c) ? b : (c > d) ? c : d ; 
*/			                 
		
	}

}
