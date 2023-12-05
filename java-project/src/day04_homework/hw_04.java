package day04_homework;

import java.util.Scanner;

// 과제4] 3개 정수 입력 받아서 큰 순으로 출력하기
public class hw_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
		
		if(x > y && y > z) {
			System.out.println(x + " " + y + " " + z);
		} else if(x > y && y < z && x > z) {
			System.out.println(x + " " + z + " " + y);
		} else if(x < y && x > z) {
			System.out.println(y + " " + x + " " + z);
		} else if(x < y && x < z && y > z) {
			System.out.println(y + " " + z + " " + x);
		} else if(x > y && x < z) {
			System.out.println(z + " " + x + " " + y);
		} else {
			System.out.println(z + " " + y + " " + x);
		}
	}
	

}
