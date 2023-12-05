package day02_operator;

public class MainEntry2 {
	public static void main(String[] args) {
		// 단항연산자 : 증감 ==> ++, --, ~,.....
		int x = 10, y;
		
		y = ~x;  // 비트부정   -(원래값 + 1) ==> 결과
		
		System.out.println("x= " + x + ", y= " + y);
	}

}
