package day11.collection.list;

import java.util.Iterator;
import java.util.Vector;

// List : 순서있고, 중복허용한다
public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length       /       capacity");  // 초기용량 10
		System.out.println(v.size() + "            /       " + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4);  // 초기용량, 증가용량
		v2.add(20);
		v2.add(12);
		v2.add(55);
		v2.add(99);
		v2.add(55);		
		System.out.println(v2.size() + "            /       " + v2.capacity());  // 초기용량이 3이지만 데이터 수가 5개 이므로 증가용량 4가 더해진다 = 7
		
		System.out.println("------- iterrator() method -------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");  // 데이터 작성 순서대로 출력되고 중복도 허용되어 출력된다
		}
		
		System.out.println("\n------- get() method -------------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + "\t");
		}
		
		System.out.println("\n------- elementsAt() method ------");
		for (int i = 0; i < v2.size(); i++) {  // Vector에 있는 모든 요소에 대한 반복
			Integer num = v2.elementAt(i);
			System.out.print(num.toString() + "\t");
		}
		System.out.println("\n\n" + v2.size() + "            /       " + v2.capacity()); 
		v2.trimToSize();  // capacity 재조정
		System.out.println("\n\n" + v2.size() + "            /       " + v2.capacity());
	}
}
