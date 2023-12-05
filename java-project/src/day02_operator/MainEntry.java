//*
package day02_operator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 ==> ++, --, ~,.....
		int x = 10, y;
		
		//y = x++;  // 후위연산(뒤에 연산자가 붙었다는 의미) : 대입먼저, 연산 나중에
		//y = ++x;  // 전위연산 : 연산먼저, 대입나중
		//y = x--;
		y = --x;
		//x++;  // ++x;
		//y = x;
		System.out.println("x= " + x + ", y= " + y);
		
	}

}
