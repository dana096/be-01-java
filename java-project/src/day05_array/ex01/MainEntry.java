package day05_array.ex01;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		char[] ch;  // 배열선언
		ch = new char[4];  // 배열생성, 이 때 메모리에 할당됨  // 배열 생성할 때, 크기는 정수만 가능하며 꼭 넣어줘야 한다
		
		// 2.
		char[] ch2 = new char[4];  // 배열선언 및 생성  // 스택영역에서 객체는 시스템크기를 갖기 때문에 4byte이다  // new가 들어가면 힙에 저장된다
		//배열 초기화
		ch2[0] = 'J';  // 여기서 '0'은 인덱스 번호
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]);  //J
		System.out.println(ch2[3]);  //A
		System.out.println("=====================");
		
		for(int i = 0; i < 4; i++) {
			System.out.println("ch2[" + i + "] = " + ch2[i]);
		}
		
		System.out.println("====================");
		
		// 3. 초기값이 있을 경우, 초기값을 같이 쓴다
		char[] ch3 = { 'J', 'A', 'V', 'k', 'p', 'a', 'b', 'Y', 'e', 'o', '9', '5' };  // char[] ch3 = new char[6];
		System.out.println("배열의 길이 : " + ch3.length);  // length : 배열의 길이를 구해주는 필드
		
		for (int i = 0; i < ch3.length; i++) { // for (int i = 0; i < 8; i++) {  //  에러는 없고 인덱스 7번까지만 출력됨
			System.out.println("ch3[" + i + "] = " + ch3[i]);
		}
		System.out.println("====================");
		
		String[] str = { "A", "kbs", " Park", "D", "you", "encore", "KOSA" };
		for(int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] = " + str[i]);
		}
		
		System.out.println(str[3]);
		
		char[] ch4 = { };
		char[] ch5 = new char[]{ };  // 이와 같이 초기화할 수 있다
				
	}

}
