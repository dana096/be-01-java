package quiz.BMI.verDA;

import java.util.Scanner;

public class MainEntry {

	private static String name;
	private static String temp;
	private static boolean gender;
	private static double height;
	private static double weight;
	private static String bmi;
	private static double getbmi;

	public static void main(String[] args) throws InterruptedException {
		
		BMIManager bm = new BMIManager();
        Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("*****비만도 측정 프로그램***** \r\n\n원하시는 사항을 선택해주세요.");
		System.out.println("\n1. 회원 정보 추가"); 
		System.out.println("2. 회원 정보 삭제 ");
		System.out.println("3. 회원 정보 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	
		int inNum = sc.nextInt();
		
		switch (inNum) {
			case 1:
				System.out.println("\n1. 회원 정보 추가");
				bm.BMIAdd();
				break;
			case 2:
				System.out.println("\n2. 회원 정보 삭제");
				bm.output();
				System.out.println("---------------------------");
				System.out.print("삭제할 회원의 번호를 입력하세요 >> ");
				inNum = sc.nextInt();
				bm.BMIRmv(inNum);
				System.out.println("* 삭제완료");
				break;
			case 3:
				System.out.println("\n3. 회원 정보 조회");
				bm.output();
				break;
			case 4:
				System.out.println("\n4. 회원 정보 수정");
				bm.output();
				System.out.println("---------------------------");
				System.out.print("수정할 회원의 번호를 입력하세요 >> ");
				inNum = sc.nextInt();
				System.out.println("수정할 회원의 정보를 입력하세요."); 
				bm.output();
				bm.BMIMod(inNum, name, temp, height, weight, bmi);
				System.out.println("* 수정완료");
				break;
			case 5:
				System.out.println("\n* 프로그램을 종료합니다.");
				System.exit(0);
				break;
		    }
		}
		
	}

	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("회원 성별을 입력해주세요(m, f) >> ");
		temp = sc.next();
		if(temp.toLowerCase().equals("m")) gender = true;
		else gender = false;
		System.out.print("키 >> ");
		height = sc.nextDouble();
		System.out.print("몸무게  >> ");
		weight = sc.nextDouble();
		
	}
}
