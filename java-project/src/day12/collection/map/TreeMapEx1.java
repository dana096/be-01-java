package day12.collection.map;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx1 {  
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz", 1000);
		tm.put("bb", 1000);
		tm.put("aa", 9999);
		tm.put("kk", 1);
		tm.put("dd", 1000);
				
		System.out.println("value : " + tm.get("aa"));
		System.out.println(tm); // key 기준으로 자동정렬
		
		TreeSet set = new TreeSet();
		
		//1. for문 사용
		for (int i = 0; i < 6; i++) {  // set.size() : 0
			set.add((int)(Math.random()*50) + 1);
		}
		System.out.println(set);
		
		//2. LinkedList에서 객체 생성하여 사용
		List list = new LinkedList(set);
		
		System.out.println(set);
	}
}
