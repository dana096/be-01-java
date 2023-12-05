package day10_API.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //system이 갖고 있는 날짜 얻어옴
		
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println((c.get(Calendar.MONTH)+1) + "월"); //월은 0부터 시작함
		System.out.println(c.get(Calendar.DATE) + "일");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMonth();
		int d = date.getDay();
		System.out.printf("현재 시간은 %d시 %d분 %d초\n", h, m, d);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2022, 12, 20, 0, 0);
		
		if(c1.after(c2)) { //c1는 c2보다 이후이니? 
			System.out.println("O");
		}else if(c1.before(c2)) { //c1은 c2보다 이전이니? 
			System.out.println("X");
			
		}else if(c1.equals(c2)) {//둘이 같은 날짜니?
			System.out.println("==");
		} 
	}
}
