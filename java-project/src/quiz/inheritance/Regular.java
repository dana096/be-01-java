package quiz.inheritance;

public class Regular extends Employee {
	protected int pay;
	
	public Regular() {
//		super.input();
	}
	
	public void input() {
		super.input();
		System.out.print("pay : ");					
		pay = sc.nextInt();
	}

	public Regular(int empno, String tel, String name, String job, int pay) {
		super(empno, tel, name, job);
		this.pay = pay;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void display() {
		super.display();
		System.out.println("급여 : " + pay);
	}	

}
