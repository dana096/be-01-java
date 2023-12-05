package quiz.inheritance;

import java.util.Scanner;

public class Employee {  // Super class
	protected int empno;
	protected String name, job, tel;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
//		input();
	}
	
	public void input() {  // 입력 메소드
		int num;
		System.out.println("사번 : ");
		this.empno = sc.nextInt();
		System.out.print("이름 : ");
		this.name = sc.next();
		System.out.print("부서 : ");
		this.job = sc.next();
		System.out.print("연락처 : ");
		this.tel = sc.next();
	}

	public Employee(int empno, String tel, String name, String job) {
		this.empno = empno;
		this.tel = tel;
		this.name = name;
		this.job = job;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setPtno(String job) {
		this.job = job;
	}
	
	public void display() {
		System.out.println("사번 : " + empno + "\n이름 : " + name + "\n부서 : " + job + "\n연락처 : " + tel);
	}
	

}
