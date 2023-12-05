package day04_homework;

// 과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5 -> - 부호 비트 만들기 int b = -1; if(i % 2 != 0) i * b, for문 만들어 곱하기, if문
public class hw_02 {
	public static void main(String[] args) {
		
		int sum = 0, b = -1;
		for(int i = 1; i < 11; i++ ) {
			if(i % 2 != 0) {
			sum += i * b ;
			} else {
		sum += i;
		}
		}	
		System.out.println(sum); 
	}

}
