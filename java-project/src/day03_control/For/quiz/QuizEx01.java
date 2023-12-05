package day03_control.For.quiz;

import java.util.Scanner;

public class QuizEx01 {
	public static void main(String[] args) {


		//1. 원하는 단 입력 받아서 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 구구단은 몇 단인가요? :  ");
		int dan = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(dan + " * " + i + "= " + (dan*i));
		}


	
//		for (int i = 1; i <= 3; i++) {
//		for (int i = 1; i <= 10; i += 2) {	// 1부터 10까지 중 홀수 출력
//		for (int i = 10; i >= 1; i--) {	// 10부터 거꾸로
//			System.out.print(i + "\t");
		
		
		// 문제] 1~100 중에 3의 배수의 합과 개수 구하는 프로그램 작성

		/*
		int sum = 0, count = 0;
		for(int i = 1; i <= 100; i++ ) {
			if( i % 3 == 0 ) {
				sum += i;
				count++;  // count = count +1;
			}		
		}
		System.out.println("sum = "+sum + ", count = "+count);
		*/
	}

}
