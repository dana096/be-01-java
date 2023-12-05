package day03_control_IF;

import java.util.Scanner;

public class MainEntry2 {
	public static void main(String[] args) {
		System.out.print("integer data input : ");
		int su = new Scanner(System.in).nextInt();
		
		//양수/음수, 0 판정 - if
		
		//
		
		if(su > 0) {
			System.out.println(su + " ==> 양수");
		} else if(su == 0) {
			System.out.println(su + " ==> 0이군요.");
		} else {
			System.out.println(su + " ==> 음수");
		}
	}

}
