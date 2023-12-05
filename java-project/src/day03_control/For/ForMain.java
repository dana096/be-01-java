package day03_control.For;

public class ForMain {
	public static void main(String[] args) {
		
		// 1  2  3  두 줄 만들기
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 3; j++) {
				
				System.out.print(j + "\t");
				
			} // j end
			
			System.out.println();
			
		}  // i end
		
		
	    // * 5개씩 5줄 만들기
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {	
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
