package quiz.BMI;

import java.util.ArrayList;
import java.util.Scanner;

import quiz.collection.list.Customer;

public class BMIManager extends BMI {
	
	ArrayList<BMI> list = new ArrayList<BMI>(); 
	
	BMIManager() {
	}
	
	BMIManager(String name, String temp, int height, int weight) {
		BMI b = new BMI(name, temp, height, weight);
		list.add(b);
	}
	
	public void BMIAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("성별을 입력해주세요(m, f) >> ");
		temp = sc.next();
		if(temp.toLowerCase().equals("m")) gender = true;
		else gender = false;
		System.out.print("키 >> ");
		height = sc.nextInt();
		bmi = sc.next();
		if(temp == "m") {
			if((double)((height - 100) * 0.9) < 18.5) {
				bmi = "저체중";
			} else if((double)((height - 100) * 0.9) <= 22.9 || ((height - 100) * 0.9) >= 18.5) {
				bmi = "정상";
			} else if((double)((height - 100) * 0.9) <= 24.9 || ((height - 100) * 0.9) >= 23.0) {
				bmi = "과체중";
			} else if((double)((height - 100) * 0.9) >= 25.0) {
				bmi = "비만";
			} 
		} else if(temp == "f") {
			if((double)((height - 100) * 0.85) < 18.5) {
				bmi = "저체중";
			} else if((double)((height - 100) * 0.85) <= 22.9 || ((height - 100) * 0.85) >= 18.5) {
				bmi = "정상";
			} else if((double)((height - 100) * 0.85) <= 24.9 || ((height - 100) * 0.85) >= 23.0) {
				bmi = "과체중";
			} else if((double)((height - 100) * 0.85) >= 25.0) {
				bmi = "비만";
			} 
		}
		System.out.print("몸무게  >> ");
		weight = sc.nextInt();
		
		BMI b = new BMI(name, temp, height, weight);
		list.add(b);
	}
	
	public void BMIRmv(int i) {
		System.out.println("\n\n* 삭제된 회원");
		list.get(i - 1).display();
		System.out.println("--------------");
		list.remove(i - 1);
	}
	
	public void BMIMod(int i, String name, String temp, int height, int weight) {
		BMI b = new BMI(name, temp, height, weight);
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
