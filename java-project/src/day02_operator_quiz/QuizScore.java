package day02_operator_quiz;

//import java.lang.*;  // java.lang package는 자동으로 임포트된다
import java.lang.String;
import java.lang.System;

public class QuizScore {
	public static void main(String[] args) {
		int ko = 90, en = 88, com = 100, total = 0;
		double avg = 0;
		String name = "이도연";
		
		total = ko + en + com;
		avg = (double)total / 3;  // avg = total / 3.0;
		
		System.out.println(name + "님의 성적표****");
		System.out.println("국어 : " + ko + ", 영어 : " + en + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
	}

}
