package day02_operator_quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int pay = 567890;
//		int won_10000 = 0;
//		int won_1000 = 0;
//		int won_100 = 0;
//		int won_10 = 0;
//		
//		won_10000 = pay / 10000;
//		pay = pay % 10000;
//		System.out.println("만원: "+ won_10000+ "장" );
//		
//		won_1000 = pay / 1000;
//		pay = pay % 1000;
//		System.out.println("천원: "+ won_1000+ "장" );
//		
//		won_100 = pay / 100;
//		pay = pay % 100;
//		System.out.println("백원: "+ won_100+ "개" );
//		
//		won_10 = pay / 10;
//		pay = pay % 10;
//		System.out.println("십원: "+ won_10+ "개" );
		
		System.out.println("만원 : "+ pay / 10000+ "장" );
		pay = pay % 10000;
		
		System.out.println("천원 : "+ pay / 1000+ "장" );
		pay = pay % 1000;
		
		System.out.println("백원 : "+ pay / 100+ "개" );
		pay = pay % 100;
		
		System.out.println("십원 : "+ pay / 10+ "개" );
	}

}

/*

문제] 월급을 단위로 계산하기
   pay = 567890;
   result :
   만원 : 56장
   천원 : 7장
   백원 : 8개
   십원 : 9개
*/