package day13.IO.ex01;

import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is  = System.in;  // 표준 입력
		
//		System.out.println("단일 문자 입력 : ");
//		int num = is.read();  // error : 예외발생
		
		try{
			System.out.println("단일 문자 입력 : ");
//			int num = is.read(); // 예외발생, '0' ~ '9' : 48 ~ 57 (ASCII code)
			
			int num = is.read() - 48;  // 48 = '0' // 문자로 아스키코드를 처리하기 위해 48을 빼준다
			                           // 48을 빼줘야 'a'를 입력하면 0이 출력됨
			
			is.read();   is.read();  // 문제발생처리(화이트 스페이스 발생) - 자바에서는 '문자' 2바이트 처림됨
			                         // 화이트 스페이스 처리 : 문자(char)는 2byte이기 때문에 is.read()를 두번 작성해줘야 한다
			
			int num2 = is.read() - 48;
			
//			System.out.println(num);
//			System.out.println((char)num);
			System.out.println(num + num2);
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
