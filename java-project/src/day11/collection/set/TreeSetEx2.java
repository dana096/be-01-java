package day11.collection.set;

import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();  // TreeSet<Type>
		
		for (int i = 0; set.size() < 6; i++) {
			
			int num = (int)(Math.random() * 45) + 1;  // Math.random()는 double타입이기 때문에 int타입으로 형변환 필요
			
			set.add(num);
		}
		
		System.out.println(set);

	}
}
