package day04_control.While;

import java.util.Scanner;

public class DoWhileEx01 {
	public static void main(String[] args) {
		int su = 0;
		
		System.out.println("jumsu( 0 ~ 100 ) = ? ");
		su = new Scanner(System.in).nextInt();
		/*
		if( su < 0 || su > 100) {
			System.out.println("0~100 사이값만 넣으세요.");
			System.exit(0); 
		}
		System.out.println(su);
		*/
		
		do {
			System.out.println("jumsu( 0 ~ 100 ) = ? ");
			su = new Scanner(System.in).nextInt();
			
			System.out.println(su);
		} while(su < 0 || su > 100);
		
		System.out.println(su);
	}

}  // 100 이상 숫자를 입력하면 다시 입력하라고 계속 재생하고 100이하 1이상의 숫자를 입력하면 종료됨
