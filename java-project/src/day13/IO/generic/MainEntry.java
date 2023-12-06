package day13.IO.generic;

import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		
		// String 타입
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = { "abc", "kbs", "dirotor" };
		t1.set(str);     t1.print();
		System.out.println("=============================================");
		
		// Integer 타입
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };
		t2.set(num);     t2.print();
		System.out.println("=============================================");
		
		// Double 타입
		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] dou = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8 };
		t3.set(dou);     t3.print();
		System.out.println("=============================================");
		
		// Object 타입
		GenericEx<Object> t4 = new GenericEx<Object>();
		Object[] obj = { "12.45", 2, new Date(), 47.2, 5.5, "text", new Point() };
		t4.set(obj);     t4.print();
		System.out.println("=============================================");
		
	}
}
