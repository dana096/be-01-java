package quiz.Interface;

public class Bus implements Trans {

	@Override
	public void start_time(int t) {
		System.out.println("버스가 " + t + "시에 출발하였습니다.");
	}

	@Override
	public void stop_time(int i) {
		System.out.println("버스가 " + i + "시에 도착하였습니다.");
		
	}
	
}
