package day03_control.For.quiz;

public class ForStar {
	public static void main(String[] args) {
		//정사각형
		for(int i = 1; i <= 5; i++) {  // 개행
			for(int j = 1; j <= 5; j++) {  // 출력
				System.out.print("*");
			}  // j end
			System.out.println();
		}  // i end
		
		System.out.println("===========================");
		
		//직각삼각형
				for(int i = 1; i <= 5; i++) {  // 개행
					for(int j = 1; j <= i; j++) {  // 출력
						System.out.print("*");
					}  // j end
					System.out.println();
				}  // i end
				
				System.out.println("===========================");
				
				//역직각삼각형
//						for(int i = 5; i >= 1; i--) {  // 개행
				        for(int i = 0; i <= 5; i++) {  // 개행
//				        	for(int j = 1; j <= i; j++) {  // 출력
							for(int j = 1; j < 6 - i; j++) {  // 출력
								System.out.print("*");
							}  // j end
							System.out.println();
						}  // i end
				        
				System.out.println("===========================");
						
				//직각삼각형 데칼코마니 형태
						for(int i = 1; i <= 5; i++) {  // 개행
							
							for(int j = 0; j < 5 - i; j++) System.out.print(" ");							
							
							for(int j = 0; j < i; j++) {  // 출력
								System.out.print("*");
							}  // j end
							System.out.println();
							}  // i end	
						
				System.out.println("===========================");
						
				//역직각삼각형 데칼코마니 형태
						for(int i = 1; i <= 5; i++) {  // 개행
							
							for(int j = 1; j < i; j++) System.out.print(" ");		
							
							for(int j = 0; j < 6 - i; j++) {  // 출력
								System.out.print("*");
							}  // j end
							System.out.println();
							}  // i end						
						
	}

}
