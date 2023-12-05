package day05_random;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		
		// 첫번째 방법
		System.out.println(Math.random());  // 0.0 ~ 1.0 사이의 수 랜덤하게 출력
		System.out.println(Math.random() * 5);  // 0 ~ 4 사이의 수 랜덤하게 출력
		System.out.println((int)(Math.random() * 5));  // 0 ~ 4 사이 중 정수만 랜덤하게 출력
		
		System.out.println((int)(Math.random() * 5) + 1); // 1 ~ 5 사이 중 정수만 랜덤하게 출력
		
		System.out.println("\nMath.random() method 이용 -----------------");
		for (int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 45) + 1 + "\t");  // 1 ~ 46 사이 중 정수만 5개 랜덤하게 출력
		}
		
		System.out.println("\n\n===========================================");
		
		// 두번째 방법
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5));  // 0 ~ 4  => 정수로 지정했으므로 0~4 중 정수 랜덤하게 출력
		
		System.out.println(rand.nextInt(10) + 2);  // 2 ~ 11
		
		System.out.println("\nRandom class 이용 -------------------------");
		for (int i = 1; i < 6; i++) {
			System.out.print(rand.nextInt(45) + 1 + "\t");			
		}
	}

}
