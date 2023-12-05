package day02_operator_quiz;

public class Quiz02 {
	public static void main(String[] args) {		
		 int su = 12345;
	        int sec = 12345 % 60;

	        su = su / 60;

	        int min = su % 60;
	        su = su / 60;
	        System.out.println(su + "시 " + min + "분 " + sec + "초");
	}

}
