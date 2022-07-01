// ATM 인터페이스
// : 인출() 입금()

// 카드사용 인터페이스
// : 결제()


// 카드 클래스 -> 카드 객체는 없다.
// : 사용자 이름
// : 반드시 show 를 구현해야 한다.

// 체크카드 클래스 -> ATM, 카드사용
// : 잔액

// 신용카드 클래스 -> 카드사용 인터페이스
// : 한도


interface ATM {
	void withdraw(int amount);
	void deposit(int amount);
}
interface Card_usage {
	void pay(int cost);
}

abstract class prac_card {
	String name;
	abstract void show(); // 뭐 abstract 안써도 되는데, 그냥 경고용으로 중요하다.
}

class check_card extends prac_card implements ATM, Card_usage {
	
	int left;
	check_card(String name, int left) {
		this.name = name;
		this.left = left;
	}

	@Override
	public void pay(int cost) {
		System.out.println("결제 시도");
		if (this.left < cost) {
			System.out.println("잔액 부족");
		}
		else {
			this.left -= cost;
			System.out.println("결제 성공");
		}
	}

	public void withdraw(int amount) {
		System.out.println("인출 시도");
		if (this.left < amount) {
			System.out.println("잔액 부족");
		}
		else {
			this.left -= amount;
			System.out.println("인출 성공");
		}
		
	}

	@Override
	public void deposit(int amount) {
		
		System.out.println("입금 시도");
		this.left += amount;
		System.out.println("입금 성공");
		
	}

	void show() { // 자식은 부모보다 공개범위가 넓어야하는데, 이미 public이 붙어있는 친구들은 그대로 public이 내려온 것.
		// 아닌 친구는 그대로 void로 온 것.
		System.out.println("이름: " + this.name + "\n잔액: " + this.left);
		
	}

	
}

class credit_card extends prac_card implements Card_usage {
	int used;
	int lim;
	credit_card (String name, int used, int lim) {
		this.name = name;
		this.used = used;
		this.lim = lim;
	}
	
	public void pay(int cost) {
		System.out.println("결제 시도");
		if (this.used + cost > this.lim) {
			System.out.println("한도 초과");
		}
		else {
			this.used += cost;
			System.out.println("결제 성공");
		}
	}


	void show() { // 자식은 부모보다 공개범위가 넓어야하는데, 이미 public이 붙어있는 친구들은 그대로 public이 내려온 것.
		// 아닌 친구는 그대로 void로 온 것.
		System.out.println("이름: " + this.name + "\n사용금액: " + this.used + "\n한도: " + this.lim);
		
	}
}



public class Java0810_card_prac {

	public static void main(String[] args) {
		check_card c = new check_card("숭이", 3000);
		c.deposit(500);
		c.show();
		c.pay(600);
		c.show();
		
	}

}
