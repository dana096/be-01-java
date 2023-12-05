package day03_Assignment;

import java.util.Scanner;

//사칙연산 프로그램 작성(예외처리하기) <= switch, if 중 하나 선택해서 구하기
//숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서  <--- string , char

//result>
//3
//5
//+

//3 + 5 = 8


public class Assignment01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int result = 0;
	    
	    try {
			System.out.print("숫자1 : ");  int su1 = sc.nextInt();
			System.out.print("숫자2 : ");  int su2 = sc.nextInt();
			System.out.print("연산자 : ");  String op = sc.next();
	    
	    switch(op) {
	    case "+" : result = su1 + su2;  break;
	    case "-" : result = su1 - su2;  break;
	    case "*" : result = su1 * su2;  break;
	    case "/" : result = su1 / su2;  break;
	    }
		
		System.out.println(su1 + op + su2 + " = " + result); 
			
	    } catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다 ");	
	    }
	}

}
