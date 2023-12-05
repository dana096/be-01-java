package day10_API.string;

class Point {  }

public class MainEntry {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));  // c
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");
		
		String msg = "sdlfajisfajsd131";
		System.out.println("en-core " + msg);  // en-core sdlfajisfajsd131
		System.out.println(msg);
		
		String str2 = "abcde".substring(2); // 중간값 출력 2~
		System.out.println(str2);  // cde
		
		str2 = "abcdefghijklmn".substring(2, 5);  // 시작값 포함, 끝값 미포함 // cde
		System.out.println(str2);  // cde
		
		System.out.println(msg + " : " + str2);
		
		// 특수상황 => String 은 객체가 달라도 같은 글자면 같은 주소를 갖는다
		String s1 = new String("encore");
		String s2 = new String("encore");
		System.out.println("s1.hashcode() : " + s1.hashCode());
		System.out.println("s2.hashcode() : " + s2.hashCode());
		// 일반적인 상황 => 객체가 다르면 글자가 같아도 다른 주소를 갖는다
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("p1.hashcode() : " + p1.hashCode());
		System.out.println("p2.hashcode() : " + p2.hashCode());
		
		String s3 = "seoul";
		String s4 = "seoul";
		
		if (s3 == s4) System.out.println("same");
		else System.out.println("not same");
		System.out.println("-------------------------------");
		if (s1 == s2) System.out.println("same");
		else System.out.println("not same");  // s1과 s2는 주소는 같지만 스택 영역의 데이터 값은 같지 않다
		System.out.println("-------------------------------");
		
		s2 = "kosa";
		System.out.println("s1.hashcode() : " + s1.hashCode());  // -1298776120
		System.out.println("s2.hashcode() : " + s2.hashCode());  // 3297970 => s2의 주소 바뀜
		
		s2 = "korea";
		System.out.println("s1.hashcode() : " + s1.hashCode());  // -1298776120
		System.out.println("s2.hashcode() : " + s2.hashCode());  // 102236330 => s2의 주소 바뀜
		
		s2 = "encore";
		System.out.println("s1.hashcode() : " + s1.hashCode());  // -1298776120
		System.out.println("s2.hashcode() : " + s2.hashCode());  // -1298776120 => s2에서 "encore" 에 대한 주소를 가지고 있기 때문에 다시 같은 주소가 나옴
	}
}
