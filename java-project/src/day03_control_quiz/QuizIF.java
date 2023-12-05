package day03_control_quiz;

import java.util.Scanner;

// 문제] 숫자 2개 입력 받아서 큰수 출력하는 프로그램 작성
public class QuizIF { 
	public static void main(String[] args) {
		System.out.print("integer data input : ");
		int su1 = new Scanner(System.in).nextInt();
		System.out.print("integer data input : ");
		int su2 = new Scanner(System.in).nextInt();
		
		if(su1 > su2) {
			System.out.println(su1);
		} else if(su1 < su2) {
			System.out.println(su2);
		} else {
			System.out.println("값이 같습니다. " + su1 + " = " + su2 ); 
		}
	}

}
