package day15.thread.ex02;

public class MainEntry {
	public static void main(String[] args) {
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
//		Runnable t1 = new UserRunnable("u1");
//		Thread tt1 = new Thread(t1);
//		tt1.start();  // start() 를 사용하려면 위에서 start()를 가지고 있는 Thread를 불러줘야 한다
//		
//		t1.run();  // 스레드 구현x
	}
}
