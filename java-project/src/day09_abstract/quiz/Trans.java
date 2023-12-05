package day09_abstract.quiz;

// 문제1] Trans 추상클래스 <--  부모는 모든 자손에게 상속할 수 있는 최소한의 것!!
// 추상메소드 start() / stop()
// sub class : Subway / Bus / Bicycle / Plain
// MainEntry에서 메인 함수 구현하기
public abstract class Trans {

	String result1, result2;

	public abstract String start(String start);
	public abstract String stop(String stop);
	public abstract void show1(String station);
	public abstract void show2(String station);

}
