package day11.collection.set;

import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bay");
		set.add("car");
		set.add("Car");
		set.add("dZZZZZ");
		set.add("dzzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);  // 대문자가 우선순위가 높기 때문에 "Car"가 제일 먼저 출력됨
		System.out.println("range search : from " +  from + " to " + to);
		System.out.println("reult : " + set.subSet(from, to));  // a, d : a 포함, d 미포함(a~d)		
		System.out.println("reult : " + set.subSet(from, to + "zzz"));  // 우선순위(영문자(대문자 > 소문자) > 숫자 > 한글(그외 나라 언어들))가 더 높은 데이터가 출력된다
	}
}
