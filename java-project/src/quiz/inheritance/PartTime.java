package quiz.inheritance;

public class PartTime extends Employee {
	private int day, timepay, result;
	
	public PartTime() {
		// TODO Auto-generated constructor stub
	}
	
	public void input() {
		super.input();
		System.out.print("근무일자 : ");		
		day = sc.nextInt();
		System.out.print("시간당 단가 : ");		
		timepay = sc.nextInt();
	}
   	
	public PartTime(int empno, String tel, String name, String job, int day, int timepay) {
		super(empno, tel, name, job);
		this.day = day;
		this.timepay = timepay;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getTimepay() {
		return timepay;
	}

	public void setTimepay(int timepay) {
		this.timepay = timepay;
	}

	public int getResult() {
		result = day*timepay;
		return result;
	}

	public void display() {
		super.display();
		System.out.println("근무일수 x 시간당 단가 : " + getResult());
	}
	
	
	
	

}
