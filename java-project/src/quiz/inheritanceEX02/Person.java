package quiz.inheritanceEX02;

import java.util.Scanner;

public class Person {
	protected String name, gender;
	protected int age;
	
	Scanner sc = new Scanner(System.in);
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void input(){   // 입력 메소드 
		String name, gender;
		int age;
		System.out.print("name = ");		    this.name= sc.next();
		System.out.print("gender = ");			this.gender = sc.next();
		System.out.print("age = ");			    this.age = sc.nextInt();
	}

	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("이름 : " + name + "\n성별 : " + gender + "\n나이 : " + age);
	}
	
}
