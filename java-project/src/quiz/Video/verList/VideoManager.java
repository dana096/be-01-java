package quiz.Video.verList;

import java.util.ArrayList;
import java.util.Scanner;

import quiz.Video.verList.Video;

public class VideoManager extends Video {
	ArrayList<Video> list = new ArrayList<Video>(); 
	
		VideoManager() {		
		}
	
		VideoManager(String title, String category, boolean lend, String lendName, String lendDate) {
			Video v = new Video(title, category, lend, lendName, lendDate);
			list.add(v);
		}
	
		public void VideoAdd() { // 추가2
			Scanner sc = new Scanner(System.in);
			System.out.print("비디오 제목 : ");
			title = sc.next();
			System.out.print("장르 : ");
			category = sc.next();
			System.out.print("대여여부(true or false)  : ");
			lend = sc.nextBoolean();
			System.out.print("대여자(고객명) : ");
			lendName = sc.next();
			System.out.print("대여날짜 : ");
			lendDate = sc.next();
		
			Video v = new Video(title, category, lend, lendName, lendDate);
			list.add(v);
		}
		
		public void VideoRmv(int i) { 
			list.get(i-1).display();
			list.remove(i-1);
		}
		
		public void VideoCh(int i, String title, String category, boolean lend, String lendName, String lendDate) {
			Video v = new Video(title, category, lend, lendName, lendDate);
			list.set(i-1, v);
		}
		
		public void display() {
			System.out.println();
			System.out.println("저장된 비디오 수 : " + list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println("** " + (i+1) + "번 **");
				list.get(i).display();
			}
			
		}
	

}
