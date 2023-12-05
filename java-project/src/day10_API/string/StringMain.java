package day10_API.string;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		//replace 함수
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println(s1.concat(s2));  // 문자열 결합
		System.out.println(s1 + s2);
		System.out.println(s2.replace("EO", "korea"));  // SkoreaUL
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
//		s2.replace("EO", "korea");
//		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		
		//trim 함수
		String s3 = new String("      ab     cd      ");
		System.out.println(s3);
		System.out.println("length = " + s3.length());  // 문자열 길이
		s3 = s3.trim();  // 공백 제거
		System.out.println("length = " + s3.length()); 
		System.out.println(s3); 
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		//split 함수
				String s4 = new String("abc defgh k2344 keijk 34556789");
				String[] s5 = s4.split(" ");   // 값을 적어주지 않는다면, 디폴트는 공백
		    for (int i = 0; i < s5.length; i++) {
					System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);  // 공백으로 끊어서 가져옴
				}

		    String s6 = new String("abc/defgh/k2344/keijk/34556789");
				String[] s7 = s6.split("/");  // "/" 로 구분하여 가져옴
				for (int i = 0; i < s7.length; i++) {
					System.out.println("분리된 " + i + "번째 문자열 : " + s7[i]);  // 공백으로 끊어서 가져옴
				}
				
				String s8 = "123-456-7890";
				String[] s9 = s8.split("-");
				for (int i = 0; i < s9.length; i++) {
					System.out.println(s9[i]);  // 공백으로 끊어서 가져옴
				}

		    String s10 = "1234567890abcdef 78f88";
				char ch = s10.charAt(15);
				System.out.println(ch);
				System.out.println(s10.indexOf('f'));
				System.out.println(s10.lastIndexOf('f')); //마지막에 만난 f 찾기
				
				System.out.println(s10.substring(3)); //3번 위치부터 끝까지 출력
				System.out.println(s10.substring(5,7));

		    System.out.println(s2 + "소문자 출력 toLowerCase(): " + s2.toLowerCase());
				System.out.println(s1 + "대문자 출력 toUpperCase(): " + s2.toUpperCase());
		
	}

}
