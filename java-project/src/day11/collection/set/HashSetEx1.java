package day11.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서 없고 중복허용하지 않음
public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();  // new HashSet<>(); 도 가능하다(JDK 5버전 이후)
		hs.add("키보드");   hs.add("컵");   hs.add("마우스");   hs.add("볼펜");   hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());  // 4 : 중복허용하지 않기 때문, size() : 요소 개수 알려줌
		Iterator it = hs.iterator();  //
		
		while (it.hasNext()) {  // 다음 요소가 있다면...
			System.out.println(it.next());  // 순서 상관없고 중복도 허용하지 않고 출력됨(데이터 수는 5개)			
		}
		
		HashSet<Integer> hs2 = new HashSet<>();  // <> 안에는 wrapper 클래스(객체 형태 데이터)만 들어갈 수 있다
		hs2.add(200);   hs2.add(3);   hs2.add(1000);   hs2.add(30);
		
		System.out.println("---------------------------------");
		for (Integer item : hs2) {
			System.out.println(item);
		}
		
		System.out.println("---------------------------------");
		for (String item : hs) {
			System.out.println(item);
		}
		
		System.out.println("---------------------------------");
		for (Object item : hs) {  // Object : 어떤 데이터든 출력 가능
			System.out.println(item);
		}
		
		System.out.println("---------------------------------");
		it = hs2.iterator();
		while(it.hasNext()) {  // 다음 요소가 있다면,...
			System.out.println(it.next());  // 요소를 꺼내와서 출력
		}
	}
}
