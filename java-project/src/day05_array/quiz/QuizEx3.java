package day05_array.quiz;

import java.util.Scanner;

// 문제2] 임의 수(2행 3열)를 입력하여 모든 수의 합 구하기 
public class QuizEx3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[2][3]; 
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {  // row
			for (int j = 0; j < a[i].length; j++) {  // col
				a[i][j] = sc.nextInt();
				sum += a[i][j] ;
			    } // j end						
			} // i end
				
		System.out.println("합 : " + sum);

		
	}

}
