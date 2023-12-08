package day15.thread.ex03;

public class MainEntry {
	public static void main(String[] args) {
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // 최대 우선순위
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 최소 우선순위
		
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 Name : " + name);
		System.out.println("현재 스레드 Priority : " + priority);
		System.out.println("현재 스레드 State : " + state);
		
	}
}
