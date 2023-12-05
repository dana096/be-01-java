package quiz.inheritance;

public class Sales extends Regular {
	private double commision, result;
	
	public Sales() {
	}
	
	public void input() {
		super.input();
		System.out.print("commision : ");		
		commision = sc.nextDouble();
	}

	public Sales(int empno, String tel, String name, String job, int pay, int commision) {
		super(empno, tel, name, job, pay);
		this.commision = commision;
	}
	
	public Sales(double commision) {
		super();
		this.commision = commision;
	}
    
	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	public double getResult() {
		result = super.pay*commision;
		return result;
	
	}

	public void display() {
		super.display();
		System.out.println("총 급여 : " + (super.pay+getResult()));
	}

}
