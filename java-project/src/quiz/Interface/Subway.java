package quiz.Interface;

public class Subway implements Trans {

	@Override
	public void start_time(int t) {
		System.out.println("지하철이 " + t + "시에 출발하였습니다.");
	}

	@Override
	public void stop_time(int i) {
		System.out.println("지하철이 " + i + "시에 도착하였습니다.");
		
	}
	
}
