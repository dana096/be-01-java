package day15.thread.ex01;

public class MainEntry {
	public static void main(String[] args) {
		
		UserThread t1 = new UserThread("t1");  // 부모의 객체 생성
		Thread t2 = new UserThread("t2");  // 부모로 객체 생성
		Thread t3 = new UserThread("t3");
		
//		t1.run();  // x
		t1.start();  // run() 유도한다
		t2.start();
		t3.start();
// t3이 먼저 출력되는 이유는 작업스케쥴러 JVM 때문이다		
	}

}
