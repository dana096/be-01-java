package day02_Input;

//import java.lang.*;  // java.lang package는 자동으로 임포트된다
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class MainEntry1_2 {
	public static void main(String[] args) {
		
		System.out.print("ko, en, com & name input : ");
		int ko = new Scanner(System.in).nextInt();
		int en = new Scanner(System.in).nextInt();
		int com = new Scanner(System.in).nextInt();
		String name = new Scanner(System.in).next();
		int total = 0;
		double avg = 0;
		
		total = ko + en + com;
		avg = (double)total / 3;  // avg = total / 3.0;
		
		System.out.println(name + "님의 성적표****");
		System.out.println("국어 : " + ko + ", 영어 : " + en + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
	}

}




/*
package day02_Input;

//import java.lang.*;  // java.lang package는 자동으로 임포트된다
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class MainEntry1_2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.print("국어 : ");
		int ko = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		System.out.print("전산 : ");
		int com = sc.nextInt();
		int total;
		double avg;
		
		total = ko + en + com;
		avg = (double)total / 3;  // avg = total / 3.0;
		
		System.out.println(name + "님의 성적표****");
		System.out.println("국어 : " + ko + ", 영어 : " + en + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
	}

}
*/