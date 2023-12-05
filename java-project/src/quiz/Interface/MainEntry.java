package quiz.Interface;

public class MainEntry {
	public static void main(String[] args) {
		Subway s = new Subway();
		s.start_time(8);
		s.stop_time(14);
		
		Bus b = new Bus();
		b.start_time(15);
		b.stop_time(21);

	}
}


