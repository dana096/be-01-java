package day11.collection.list;

import java.util.ArrayList;
import java.util.Collections;

// List : 순서있고, 중복허용한다
public class ArrayListEx1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));  // 1 ~ 4 데이터 출력(1 포함, 4 미포함)
//		list2.add(200);
		print(list, list2);
		
		list.sort(null);
		Collections.sort(list2);  // 정렬
		print(list, list2);
		
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2));  // list와 list2의 모든 요소가 같은가?
		list2.add("B");  // add() : 추가
		list2.add("C");
		print(list, list2);
		
		list2.set(3, "김연아");  // set() : 교체, get() : 가져오기
		print(list, list2);
			
	}

	public static void print(ArrayList list, ArrayList list2) {  // 출력 메소드 만듦
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
