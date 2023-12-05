package day05_array.ex01;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		// 임의적 데이터 입력 받아서 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("arr data 5 input = ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		
	}

}

/*
// 1~5의 합 구하기
 * 

package day05_array.ex01;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];  // sum = sum + arr[i];
		}
		System.out.println("1, 2, 3, 4, 5 sum : " + sum);
	}

}
*/