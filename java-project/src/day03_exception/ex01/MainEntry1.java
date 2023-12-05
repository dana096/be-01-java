package day03_exception.ex01;

public class MainEntry1 {
	public static void main(String[] args) {
		int x = 30, y = 0;
		int result = 0;
		
		if(y == 0) { 
			System.out.println("0으로 나눌 수 없습니다.");
			return;  // 제어건 넘김
		} else {
			result=  x / y;  // 예외 발생
		} 
		
		System.out.println(result);
	}

}




/* -- error : 0을 나누려 했으므로
package day03_exception.ex01;

public class MainEntry1 {
	public static void main(String[] args) {
		int x = 30, y = 0;
		
		int result=  x / y;
		
		System.out.println(result);
	}

}
*/