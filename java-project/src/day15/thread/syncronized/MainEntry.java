package day15.thread.syncronized;

class Atm {
	private int money;

	public Atm(int money) {
		this.money = money;
	}
	
	//입금함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}
	
	//출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {  //this : 나 자신
			if((money - amount) > 0) {  
				
				Thread.yield();  //실행을 다음 스레드에게 양보
				money -= amount;
				System.out.println(name + " : 입금금액 " + amount);
			} else {
				System.out.println(name + " : 출금 못함(잔액 부족...) ");
			}			
		}  // synchronized end
	}
	
	public void getMoney() {
		System.out.println("                           잔액은 : " + money);
	}
} // Atm end

class UserAtm extends Thread {
	
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name);  // super => Thread
		this.obj = obj;
	}



	@Override
	public void run() {  // 스레드 실행부(구현부)

		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);  // 0.05초 동안
			} catch (Exception e) { e.printStackTrace(); }
			
			if(flag) {
				obj.deposit((int)(Math.random() * 10 + 2) * 100, getName());  // 2 ~ 101 : 랜덤으로(난수) 0이 안나오게 하기 위해서
//				obj.getMoney();
			} else {
				obj.withdraw((int)(Math.random() * 10 + 2) * 100, getName());
			} // if end
			flag = true;
			obj.getMoney();
		} // for end
	}
	
} // UserAtm end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "김연아");
		UserAtm user2 = new UserAtm(at, "박태환");
		UserAtm user3 = new UserAtm(at, "강감찬");
		
		user1.start();
		user2.start();
		user3.start();
	}

}
