package day04_homework;

// 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 답 : 35  -> for문, 
public class hw_01 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
				for(int j = 1; j < i + 1; j++) {
					sum += j;
				}
			}
			System.out.println(sum);
		}
	}
	
	


