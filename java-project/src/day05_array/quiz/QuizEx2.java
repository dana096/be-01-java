package day05_array.quiz;

import java.util.Scanner;

// 문제2] 3일의 강수량을 입력받아서, 평균 구하는 프로그램 작성
public class QuizEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su = 3, sum = 0;  double avg = 0;
		double[] arr = new double[su];
		
//		System.out.println("3일 강수량 입력 = ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "일 강수량 입력 = ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
			avg = (double)sum / arr.length;  // avg = sum / su;
		}
					
		/*
		 for(double item : arr) {
		 sum += item;
		 }
		 */

		System.out.println("3일 강수량 평균 : " + avg);
		
	}

}
