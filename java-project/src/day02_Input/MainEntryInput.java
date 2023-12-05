package day02_Input;

import java.util.Scanner;

public class MainEntryInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수자동호출
		
		
		// 문자와 숫자 같이 입력받고 싶을 때 -> 문자 먼저 입력시, 문자와 숫자 모두 출력
		
//		System.out.println("name, int input : ");
//		String name = sc.nextLine();  // 공백 인식 못함
//		int su = sc.nextInt();
		
		// 문자와 숫자 같이 입력받고 싶을 때 -> 숫자 먼저 입력시, 숫자만 출력 
		// ==> 숫자 입력하면 버퍼라는 메모리 상의 공간으로 이동한 후, 엔터키를 누르면 화이트 스페이스가 생성되고(엔터는 버퍼에 남아있음)
		// 화이트 스페이스는 문자 형태이기 때문에 문자로 인식되어 숫자를 입력하면 바로 숫자만 출력된다
		
		System.out.println("int, name input : ");
		int su = sc.nextInt();        // 숫자를 먼저 입력하면 숫자만 받는다
		String name = sc.nextLine();  
		
		System.out.println(su + ", " + name);
		
		
		
		
		/*
		// next() 과 nextLine() 의 차이점
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name, str input : ");
//		String name = sc.next();  // 공백 인식 못함
		String name = sc.nextLine();  // 공백 인식함
		
		System.out.println(name);
		*/
		
		
		
		/*
		// integer, double, char(charAt(0)) 모두 출력하고 싶을 때
		
		System.out.println("정수 데이터 입력 요망 : ");
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수자동호출

		System.out.println("integer, double, char data input : ");
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		System.out.println(x + ", " + y + ", " + ch);
		*/
		
		
				
		/*
		int x = 3, y = 3;
		
		if(x == y) System.out.println("same");
		else System.out.println("not same");
		
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		if(s1 == s2) System.out.println("same");
     	else System.out.println("not same");
		if(s1.equalsIgnoreCase(s2)) System.out.println("same");  // 대소문자 비교x (equals는 대소문자 비교o)
		else System.out.println("not same");
		*/
	}

}
