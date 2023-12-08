package quiz.BMI.verDA;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;

import quiz.BMI.ver1_Vector.BmiManager;

public class BMIManager extends BMI {
	
	ArrayList<BMI> list = new ArrayList<BMI>(); 
	
	BMIManager() {
	}
	
	BMIManager(String name, String temp, double height, double weight, String bmi) {
		BMI b = new BMI(name, temp, height, weight, bmi);
		list.add(b);
	}
	
	public void BMIAdd() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("성별을 입력해주세요(m, f) >> ");
		temp = sc.next();
		if(temp.toLowerCase().equals("m")) gender = true;
		else gender = false;
		System.out.print("키 >> ");
		height = sc.nextDouble();
		System.out.print("몸무게  >> ");
		weight = sc.nextDouble();	
		getbmi = weight / ((height / 100) * (height / 100));
		
		System.out.println("[NOTICE] BMI를 측정중입니다.\n측정중.........");
		while (true) {
			Thread.sleep(100);
			System.out.print("@");
			count++;
			if (count == 10) {
				break;
			}
		if (getbmi <= 18.5)
			bmi = "체중 부족";
		else if (getbmi >= 18.5 && getbmi <= 22.9) 
			bmi = "정상";
		else if (getbmi >= 22.9 && getbmi <= 24.9) 
			bmi = "과체중";		
		else if (getbmi >= 25)
			bmi = "비만";
		}
		
		System.out.println("\n\n[NOTICE] BMI 정보 등록 완료!!");
		System.out.println("\n[사용자 이름] : " + name + "\n[사용자 성별] : " + temp + "\n[사용자 몸무게] : " + weight
				+ "\n[사용자 키] : " + height + "\n[사용자 BMI] : " + getbmi + "\n[사용자 BMI 판정 결과] : " + bmi + "\r\n");
		
		BMI b = new BMI(name, temp, height, weight, bmi);
		list.add(b);	
	}
	
	public void BMIRmv(int i) {
		System.out.println("\n\n* 삭제된 회원");
		list.get(i - 1).display();
		System.out.println("--------------");
		list.remove(i - 1);
	}
	
	public void output() {
			System.out.println("================ [ BMI 정보 출력 ] =================");
			System.out.println("[ 사용자 이름 ] : " + name);
			System.out.println("[ 사용자 성별 ] : " + temp);
			System.out.println("[ 사용자 키 ] : " + height);
			System.out.println("[ 사용자 몸무게 ] : " + weight);
			System.out.println("[ 사용자 BMI ] : " + getbmi);
			System.out.println("[ 사용자 BMI 판정 결과 ] : " + bmi);
			System.out.println();
	}
	
	
	
	public void BMIMod(int i, String name, String temp, double height, double weight, String bmi) {
		BMI b = new BMI(name, temp, height, weight, bmi);
		list.set(i - 1, b); 		
	}
	
	public void display() {
		System.out.println("저장된 회원 수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("- " + (i + 1) + "번 -");
			list.get(i).display();
		} 
	}
}
