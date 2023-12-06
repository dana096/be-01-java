package day12.util.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a");  // 무조건 첫번째 위치에 요소 추가
		list.addLast("z");  // 무조건 마지막 위치에 요소 추가
		System.out.println(list);
		
		list.remove("k");   // remove("data value");
		System.out.println(list);
		
		list.remove(2);  // remove(index number);
		System.out.println(list);
		
		list.removeFirst();  // 첫번째 위치한 요소 지워줘
		System.out.println(list);
		
		list.removeLast();  // 마지막에 위치한 요소 지워줘
		System.out.println(list);  // [c, o, p, x]
		
		list.set(2,"a");  // 교체(인덱스번호, 요소)
		System.out.println(list);  // [c, o, a, x]
		
		list.set(3,list.get(1)+"change");
		System.out.println(list);  // [c, o, a, ochange]
		
		String str1 = (String)list.peek();  // 맨 처음 요소 꺼냄(제거x)
		System.out.println("=====================");
		System.out.println(str1);  // c
		System.out.println(list);  // [c, o, a, ochange]
		
		String str2 = (String)list.poll();  // 맨 처음 요소 꺼냄(제거o)
		System.out.println(str2);  // c
		System.out.println(list);  // [o, a, ochange]
		
		list.offer("a");  // 데이터를 넣는다
		System.out.println(list);  // [o, a, ochange, a]
		String str3 = (String)list.remove();  // 맨 처음 요소 꺼냄(제거o)  // remove은 poll과 같은 역할
		System.out.println(str3);  // o
		System.out.println(list);  // [a, ochange, a]
	}
}
