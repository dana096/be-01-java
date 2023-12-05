package day03_exception.ex01;

import java.util.Scanner;

public class MainEntry2 {
	public static void main(String[] args) {
			System.out.print("x, y = ");
			int x, y, result = 0;
			
			try { 
				x = new Scanner(System.in).nextInt();
				y = new Scanner(System.in).nextInt(); 
				
				result = x / y ;  //문제 발생 소지 있는 코드
				
			} catch (Exception e) {
				
//			    System.out.println("0으로 나눌 수 없습니다.");  // user message
//		        System.out.println(e.getMessage());
				e.printStackTrace();  // 
			} // try end
			
		}
	}
