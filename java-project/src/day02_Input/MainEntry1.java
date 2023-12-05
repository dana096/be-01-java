package day02_Input;

// 패키지 임포트하기 : import
import java.util.Scanner;  // package가 우선순위가 높기 때문에 package 밑에 적어야한다!

public class MainEntry1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Scanner를 찾지 못하기 때문에 java.lang과 달리 임포트를 해줘야한다
		System.out.print("integer data input : ");
		int su = sc.nextInt();
		System.out.println(su);
		System.out.print("name input : ");
		String name = sc.next();
		
		System.out.println(su + ", name : " + name);
	}

}
