package day03_control_IF;

import java.util.Scanner;

public class MainEntry1 {
	public static void main(String[] args) {
		System.out.print("integer data input : ");
		int su = new Scanner(System.in).nextInt();
		
		//짝/홀수 판정
//		if(su % 2 == 0) System.out.println(su + " ==> even");
//		else System.out.println(su + " ==> odd");
		
		//
		
		if(su % 2 == 0) {
			System.out.println(su + " ==> even");
			System.out.println(1);
			System.out.println(2);
		} else {
			System.out.println(su + " ==> odd");
			System.out.println(3);
			System.out.println(4);
		}
	}

}
