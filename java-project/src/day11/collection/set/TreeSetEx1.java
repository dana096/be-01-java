package day11.collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();  // TreeSet<Type>
		int[] score = { 85, 95, 35, 45, 65, 40, 100 };
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));  //set.add(score[i]);
		}
		
		System.out.println(set);  // TreeSet = 자동정렬한다
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
		
		System.out.println(set.first());  // 35 : 제일 작은 값
		System.out.println(set.last());  // 100 : 제일 큰 값
	}
}
