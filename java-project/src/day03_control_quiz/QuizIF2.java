package day03_control_quiz;

import java.util.Scanner;

// 문제] 년도 입력 받아서 윤/평년 판정 프로그램 작성
/*
 * if (년도 % 4 == 0)
 *     if((년도 % 100 != 0) || (년도 % 400 == 0))
 *           "윤년";
 */


public class QuizIF2 { 
	public static void main(String[] args) {
		System.out.print("year = ");
		int year = new Scanner(System.in).nextInt();
		String result = null;
		boolean flag= false;
		
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			flag = true;  
		}		

//		 이부분과 윗부분 결과값 같음
//		if(year % 4 == 0) {
//			if(year % 100 != 0 || year % 400 == 0) {
//				flag = true;
//			}  // in if end
//		}  // out if end
		
		result = (flag == true) ? "윤년" : "평년";
		
		System.out.println("\n" + year + "년도 ===> " + result);
		
	}

}
