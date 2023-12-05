package day05_array.ex02;

//2차원 배열

public class MainEntry {
	public static void main(String[] args) {
		int[][] a = { {1,2,3}, {4,5,6} };
		
		System.out.println("행의 길이 : " + a.length);
		System.out.println("열의 길이 : " + a[0].length);
		
		for (int i = 0; i < a.length; i++) {  // 행
			for (int j = 0; j < a[0].length; j++) {  // 열
//				System.out.print("a[" + i + "] = " + a[i][j] + "\t");
				System.out.print( a[i][j] + "\t");
			} //j end
			System.out.println();
		} //i end
	}

}


/*
package day05_array.ex02;

//2차원 배열

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] { {1,2,3}, {4,5,6} } ;  // 2행 3열
		int[][] a = { {1,2,3}, {4,5,6} };
		
		for (int i = 0; i < 2; i++) {  // 행
			for (int j = 0; j < 3; j++) {  // 열
				System.out.print("a[" + i + "] = " + a[i][j] + "\t");
			} //j end
			System.out.println();
		} //i end
	}

}
*/