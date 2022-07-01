import java.util.Scanner;

class Card {
	String name;
	int bal;
	private int pw;

	Card (String name, int bal, int pw){
		this.name = name;
		this.bal = bal;
		this.pw = pw;
	}
	void setPw(int pw) {
		this.pw = pw;
	}
	int getPw() {
		return this.pw;
	}

	void inputMoney(int money) {
		this.bal += money;
	}
	void outputMoney(int money) {
		Scanner sc = new Scanner(System.in);
		int pw = sc.nextInt();
		if (checkPw(pw)) {
			this.bal -= money;
		}
		else {
			System.out.println("비번오류");
		}
	}
	void show() {
		System.out.println("잔액 : " + this.bal);
	}

	boolean checkPw(int pw) {
		if (this.pw == pw) {
			return true;
		}
		return false;
	}

}

class CheckCard extends Card {

	CheckCard(String name, int bal, int pw) {
		super(name, bal, pw);
	}


	void outputMoney(int money) {
		Scanner sc = new Scanner(System.in);
		int pw = sc.nextInt();
		if (checkPw(pw)) {
			this.bal -= money;
			if (this.bal < 0 ) { 
				System.out.println("잔액부족");
				this.bal = 0;
			}
			else {
				System.out.println("비번오류");
			}
		}
	}
}
class Buscard extends Card{
	int age;
	Buscard(String name, int bal, int pw, int age){
		super(name, bal, pw);
		this.age = age;
	}

	void rideBus() {
		Scanner sc = new Scanner(System.in);
		int cost;
		if (this.age<=18) {
			cost = 800;
		}
		else if (this.age> 18 && this.age<=60) {
			cost = 1200;
		}
		else {
			cost = 0;
		}
		System.out.print("비번입력: ");
		int pw = sc.nextInt();
		if (checkPw(pw)) {
			this.bal -= cost;
			if (this.bal < 0 ) { 
				System.out.println("잔액부족");
				this.bal = 0;
			}
		}
		else {
			System.out.println("비번오류");
		}
	}
}

// int age;
// 18 이하 800
// 60 이하 1200
// 60 초과 무료



public class Java0807_card_mainAct {
	public static void main(String[] args) {

		Buscard t = new Buscard("대용", 4000, 4707, 23);
		t.show();
		t.rideBus();
		t.show();
	}


}
