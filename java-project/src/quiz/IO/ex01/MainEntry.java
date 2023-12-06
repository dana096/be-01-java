package quiz.IO.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	private static final String Exception = null;

	public static void main(String[] args) throws IOException {
		// 2개 정수 입력 받고, 1개의 연산자 입력받아서 사칙연산 프로그램 작성하기 (IO로 처리)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("*****원하는 사칙연산을 고르시오.*****"  + "\n 1. 덧셈"  
				+ "\n 2. 뺄셈 "
				+ "\n 3. 곱셈"
				+ "\n 4. 나눗셈" + "\n >> ");
		
		int num = Integer.parseInt(br.readLine()); 
		
		System.out.println("\n숫자 2개를 입력하세요.");
		
		int str = Integer.parseInt(br.readLine());  // 예외발생, 여러개 데이터 읽기
		int str2 = Integer.parseInt(br.readLine()); 
		
		switch (num) {
		case 1:
			System.out.println(str + str2);
			break;
			
		case 2:
			System.out.println(str - str2);
			break;
			
		case 3:
			System.out.println(str * str2);
			break;
			
		case 4: 
			try {
				System.out.println((double)str / str2);
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} break;

		default:
			break;
		}

	}
}
