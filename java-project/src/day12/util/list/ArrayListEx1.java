package day12.util.list;
import java.util.*;
class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));  // list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4)); // subList(1,4) : 시작인덱스 포함, 끝인덱스 미포함
		print(list1, list2);
		Collections.sort(list1);  // Set은 순서가 없기 때문에 sort(정렬) 메소드가 없다	
		Collections.sort(list2);	
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));  // list2 데이터가 list1에 다 있니?
		
		list2.add("B");
		list2.add("C");  // 뒤에 채워진다
		list2.add(3, "A");  // 해당하는 인덱스 위치에 데이터값을 추가할 수 있다
		print(list1, list2);
		list2.set(3, "AA");  // 해당하는 인덱스 위치에 데이터값을 교체할 수 있다
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2):"+ list1.retainAll(list2));	//  list1와 list2의 공통 요소(교집합)만 남기고 나머지는 list1에서 제거
		
		print(list1, list2);
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class









