package BackJun_day06_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str= sc.next();
		String reverse = "";
		for (int i = str.length(); i > 0; i--) {
			reverse += str.charAt(i);
		}
			if (str.equals(str)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
	}
}
