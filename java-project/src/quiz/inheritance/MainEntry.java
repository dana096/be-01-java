package quiz.inheritance;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정규직, 영업사원, 파트타이머 중 해당 직군을 선택해주세요.");
		String answer = sc.next();
		
		if (answer.equals("정규직")) {
			Regular re = new Regular();
			re.input();
			re.display();
		} else if (answer.equals("영업사원")) {
			Sales sa = new Sales();
			sa.input();
			sa.display();
		} else if (answer.equals("파트타이머")) {
			PartTime pt = new PartTime();
			pt.input();
			pt.display();
		} else {
		System.out.println("다시 입력해주세요.");
		}
	}		
} // MainEntry class end

