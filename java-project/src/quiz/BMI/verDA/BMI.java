package quiz.BMI.verDA;

/*
문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기
추가 / 삭제 / 출력 / 수정  처리할것 (file 저장 함수 따로 만들수도 있고)
몸무게, 키를 입력 받아서  BMI 계산하기
BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) );
남 : (신장cm - 100) X 0.9
여 : (신장cm - 100) X 0.85
-
판정>
18.5 미만 저체중
18.5 ~ 22.9  정상
23.0 ~ 24.9  과체중
25.0  이상 비만
*/

public class BMI {
	protected String name;
	protected boolean gender = true;
	protected String temp;
	protected double height;
	protected double weight;
	protected String bmi;
	protected double getbmi;
	int count = 0;
	
	public BMI() {
	}

	public BMI(String name, String temp, double height, double weight) {
		this.name = name;
		this.temp = temp;
		this.height = height;
		this.weight = weight;
	}
	
	public BMI(String name, String temp, double height, double weight, String bmi) {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("이름 >> " + name);
		System.out.println("성별을 입력해주세요(m, f) >> " + temp);    
		System.out.println("키 >> " + height);
		System.out.println("몸무게 >> " + weight);
		System.out.println("비만도 >> " + bmi);
		
	}
		
} // BMI end
