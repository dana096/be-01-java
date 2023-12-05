package day04_homework;

// 과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ?  7.07
public class hw_03 {
	public static void main(String[] args) {
		
		double sum = 0;
		for(double i = 1; i < 10; i++) {
				sum += i/(i+1);
			}
		System.out.printf("%.2f", sum);
	}

}
