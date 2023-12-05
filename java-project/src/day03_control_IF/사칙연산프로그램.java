package day03_control_IF;

import java.util.Scanner;

public class 사칙연산프로그램 {
	public static void main(String[] args) {
		System.out.print("x, y, op = ");
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		char op = sc.next().charAt(0);
//		String op = sc.next();

		// switch 버전
		try {
			
			if(op == '+') result = x + y;
			else if(op == '-') result = x - y;
			else if(op == '*') result = x * y;
			else if(op == '/') result = x / y;
			
			switch(op) {
			case '+' : result = x + y;  break;
		    case '-' : result = x - y;  break;
		    case '*' : result = x * y;  break;
		    case '/' : result = x / y;  break;
		    default : System.out.println("연산자(+, -, *, /) 중에서 선택하세요. ");
			}
			
			System.out.println(x + " " + op + " " + y + " = " + result);
			
		    } catch (Exception e) {
			     e.printStackTrace();
		       }
	}
			
		}
/* if문 버전
		try {
			
			if(op == '+') result = x + y;
			else if(op == '-') result = x - y;
			else if(op == '*') result = x * y;
			else if(op == '/') result = x / y;
			
			System.out.println(x + " " + op + " " + y + " = " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
	*/