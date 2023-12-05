package day04_control.BreakContinue;

public class BreakMain {
	public static void main(String[] args) {
		
		/*
		// 문제] 1~100까지 중에서 짝수의 개수 구하고 한화면에 10개씩 출력하기
		int count = 0;
		for (int i = 1; i < 101; i++) {
			
				if(i % 2 != 0) {
					count++;
					continue;
				}
				System.out.println(i + "\t");
				if(count * 10 == 0) System.out.println();
			}
		*/
		
		
				
            // 식별자 : 가장 가까운 증감식에 반응
			lable : for(int i = 1; i < 6; i++) {
			
			for(int j = 1; j < 6; j++) {
				
				//if(j == 3) break;     // j는 3에서 멈추고 i는 조건대로 빠져나감
				//if(j == 3) break lable;     // j는 3에서 멈추고 바로 빠져나감
				//if(j == 3) continue;   // j = 3 만 출력안됨
				if(j == 3) continue lable;  // j가 3에서 멈추고, j = 3인 것은 출력안되며 i는 조건대로 적용되어 빠져 나감
				System.out.println("i : " + i + ", j : " + j);
				
			}  // j end
		}  // i end
		
	}

}
