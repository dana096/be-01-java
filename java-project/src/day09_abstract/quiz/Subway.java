package day09_abstract.quiz;

public class Subway extends Trans {

	@Override
	public String start(String start) {
		result1 = start;
		return result1;
	}

	@Override
	public String stop(String stop) {
		result2 = stop;
		return result2;
	}

	@Override
	public void show1(String station) {
		start("지하철이 출발하였습니다. ");
		System.out.println(result1 + "다음 정차할 역은 " + station +"입니다.");			
	}

	@Override
	public void show2(String station) {
		stop("지하철이 정지하였습니다. ");
		System.out.println(result2 + station + "역입니다. 내리실 문은 오른쪽입니다.");			
	}

}
