package quiz.Video.verMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Video {  // Model
	
	static String title;
	static String category;
	static String lend;
	static String lendName;
	static String lendDate;
	
	Video() {
	}
	
	//
	public Video(String title, String category, String lend, String lendName, String lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}

	//
	public void display() {
		System.out.println("비디오제목    : " + title);
		System.out.println("장르    : " + category);
		System.out.println("대여여부 : " + lend);
		System.out.println("대여자(고객명) : " + lendName);
		System.out.println("대여일자 : " + lendDate);
	}

}
