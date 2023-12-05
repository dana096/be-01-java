package day09_abstract.ex02;

public class Rectangle extends Shape {

	@Override
	public double calc(double x) {
		result = x * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(3.0);
		System.out.println(result + " 넓이의 " + name + "이 그려졌습니다.");

	}

}
