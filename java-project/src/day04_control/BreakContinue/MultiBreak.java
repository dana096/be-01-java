package day04_control.BreakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean t = true;
		
		first : {
			second : {
			   third : {
			       int k = 100;
			       System.out.println("Before the break");
			       if(t) break second;
			       System.out.println(" This won't execute");
						
		       }  // third end
		
		           System.out.println("123");
				
		    }  // second end
		
		    System.out.println("This is after second block");
		
		}  // first end
	}

}
