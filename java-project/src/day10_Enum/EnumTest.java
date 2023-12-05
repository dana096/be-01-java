package day10_Enum;

enum Day {
	SUNDAY, MONDAY, THESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		
		switch (day) {
		case MONDAY:
			System.out.println("Monday are bad.");
			break;
		case FRIDAY:
			System.out.println("FRIDAY are better.");
			break;
		case SATURDAY:
			System.out.println("SATURDAY are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
		
	}

}
