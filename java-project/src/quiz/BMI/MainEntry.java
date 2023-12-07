package quiz.BMI;

import java.util.Scanner;

import quiz.Video.mapEx04.VideoManager;

public class MainEntry {

	private static String name;
	private static String temp;
	private static boolean gender;
	private static int height;
	private static int weight;

	public static void main(String[] args) {
		
		BMIManager bm = new BMIManager();
        Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("*****비만도 측정 프로그램입니다. \r\n원하시는 사항을 선택해주세요.*****");
		System.out.println("1. 회원 정보 추가"); 
		System.out.println("2. 회원 정보 삭제 ");
		System.out.println("3. 회원의 비만도 출력");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("----------------------");
		System.out.println(" >> ");
	
		int inNum = sc.nextInt();
		
		switch (inNum) {
			case 1:
				System.out.println("1. 회원 정보 추가");
				bm.BMIAdd();
				System.out.println("* 입력완료");
				break;
			case 2:
				System.out.println("2. 회원 정보 삭제");
				bm.display();
				System.out.println("---------------------------");
				System.out.print("삭제할 회원의 번호를 입력하세요 >> ");
				inNum = sc.nextInt();
				bm.BMIRmv(inNum);
				System.out.println("* 삭제완료");
				break;
			case 3:
				System.out.println("3. 회원의 비만도 출력");
				
				break;
			case 4:
				System.out.println("4. 회원 정보 수정");
				bm.display();
				System.out.println("---------------------------");
				System.out.print("수정할 회원의 번호를 입력하세요 >> ");
				inNum = sc.nextInt();
				System.out.println("수정할 회원의 정보를 입력하세요."); 
				display();
				bm.BMIMod(inNum, name, temp, height, weight);
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
		height = sc.nextInt();
		System.out.print("몸무게  >> ");
		weight = sc.nextInt();
		
	}
}

