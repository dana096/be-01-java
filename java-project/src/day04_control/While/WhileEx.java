package day04_control.While;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		//do~while문의 무한루프
		int su;
		
		while(true) {
			do {
				System.out.print("국어 점수를 입력하세요(0~100) = ");
				su = new Scanner(System.in).nextInt();
				System.out.println(su);
				
			} while(su < 0 && su > 100);
			
			System.out.println("점수 더 입력 받으시겠습니까?(y/n)? ");
			char yesno = new Scanner(System.in).next().charAt(0);
			if(yesno == 'n' || yesno == 'N') break;  // 무한루프일 때는 반드시 탈출구문이 있어야 한다
			
		}
			
	}

}
