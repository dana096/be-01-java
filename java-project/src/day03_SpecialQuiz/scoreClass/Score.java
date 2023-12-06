package day03_SpecialQuiz.scoreClass;

import java.util.Scanner;

//3과목 입력 받고, 총점, 평균, 학점 구하기 
public class Score {

	// 멤버변수
	private String name = null;
	private int kor, eng, com, tot = 0; 
	private double avg = 0.0;
	private char grade;

	// 생성자함수 3개-default, 이름, 3개 과목
	public Score() {
//		kor = eng = com = 0; // 3과목 점수 초기화
		input();
	}

	public Score(String name) {
		this.name = name;
	}

	public Score(int kor, int eng, int com) {
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}

	// getter / setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTot() {
		this.tot = getKor() + getEng() + getCom();
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		avg = (double) tot / 3;
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		char grade;

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	// input 
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.println("name = ");
			this.name = sc.next();
			System.out.print("kor = ");
			this.kor = sc.nextInt();
			System.out.print("eng = ");
			this.eng = sc.nextInt();
			System.out.print("com = ");
			this.com = sc.nextInt();
		}

	// output
	public void display() {
		System.out.println("****  " + name + "님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.2f  평점(학점) : %c ", getTot(), getAvg(), getGrade());
	}

}
