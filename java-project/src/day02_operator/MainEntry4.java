package day02_operator;

public class MainEntry4 {
	public static void main(String[] args) {
		// shift 연산자 : << , >> , >>>
		
		int x = 8, result;
		
		result = x << 2 ;  // left shift : 원래값 * 2 ^ bit수
		result = x >> 3 ; // right shift : 원래값 / 2 ^ bit수
		
		System.out.println("left shift result : " + result);  // 32
		System.out.println("right shift result : " + result);  // 1

	}

}
