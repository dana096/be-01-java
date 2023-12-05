package day09_abstract.ex02;

public class Triangle extends Shape {

	@Override
	public double calc(double x) {
		result = (x * (Math.sqrt(3)/2*x)) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(7);
		System.out.println(result + " 넓이의 " + name + "이 그려졌습니다.");

	}

}
