package day05_array.ex01;

public class ForeachTest {
	public static void main(String[] args) {
			int[] arr = { 1, 2, 3, 4, 5 };
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			System.out.println("==========================");
			// foreach ==> 형식 : for(자료형 변수명 : 배열명 또는 컬렉션명) {  }
			
			for (int item : arr) {  // 멈출 수 없으므로 처음부터 끝까지 모두 출력된다  // 멈추려면 조건을 걸어줘야 한다
				System.out.println(item);
			}
			
			System.out.println("==========================");
			// 문제] foreach구문을 이용하여 성적의 합 구하기
			int[] score = { 78, 79, 88, 99, 58 };
			int sum = 0;
			for (int item : score) {
				sum += item;				
			}
			System.out.println("점수 합계 = " + sum);
		}
}
