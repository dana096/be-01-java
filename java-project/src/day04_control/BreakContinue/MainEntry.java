package day04_control.BreakContinue;

public class MainEntry {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			if(i == 7) break;
			System.out.println(i);
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			if(i == 7) continue;  // 아래 값이 출력되지 않고 해당 조건 빼고 모든 조건이 출력됨
			System.out.println(i);
		}
		
		System.out.println();
		for (int i = 1; i < 11; i++) {
			if(i % 2 != 0) continue;  // 짝수 출력
			System.out.println(i);
		}
	}

}
