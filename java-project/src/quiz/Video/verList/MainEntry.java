package quiz.Video.verList;

import java.util.Scanner;

public class MainEntry {
	
	static String title;
	static String category;
	static boolean lend;
	static String lendName;
	static String lendDate;
	
	public static void menu() {
		System.out.println("\n> 원하시는 번호를 선택해주세요.");
		System.out.println("\n1. 대여할 비디오 추가");
		System.out.println("2. 대여한 비디오 삭제");
		System.out.println("3. 대여 비디오 리스트 출력");
		System.out.println("4. 대여한 비디오 정보 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		VideoManager vi = new VideoManager();
		
		Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {  
				menu();
				int num = sc.nextInt();

				try {
					switch (num) {
					case 1:
						System.out.println("\n1. 대여할 비디오 추가");
						System.out.println();
						vi.VideoAdd();
						vi.display();
						System.out.println("* 입력완료");
						break;
					case 2:
						System.out.println("\n2. 대여한 비디오 삭제");
						vi.display();
						System.out.println("-------------------------------------");
						System.out.print("\n삭제할 비디오의 번호를 입력하세요 ");
						num = sc.nextInt();
						vi.VideoRmv(num);
						break;
					case 3:
						System.out.println("\n3. 대여 비디오 리스트 출력");
						vi.display();
						break;
					case 4:
						System.out.println("\n4. 대여한 비디오 정보 수정");
						System.out.print("\n수정할 비디오의 번호를 입력하세요 >> ");
						num = sc.nextInt();
						System.out.println("수정할 비디오의 정보를 입력하세요.");
						inVideo();
						vi.VideoCh(num, title, category, lend, lendName, lendDate);
						vi.display();
						break;
					case 5:
						System.out.println("\n프로그램 종료");
						System.exit(0);
						break;
					default:
						System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
					} // switch
				} catch (Exception e) {
					System.out.println("err) 없는 대여 정보입니다. 다시 입력해주세요.");
				} // try catch
			} // while
		} catch (Exception e) {
			System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}// try catch

	}// main

	public static void inVideo() {
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
	}
}

