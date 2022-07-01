import java.util.Scanner;

class Card{
	String name;
	int bal;
	private int pw;
	Card (String name,int bal,int pw){
		this.name=name;
		this.bal=bal;
		this.pw=pw;
		System.out.println(this.name+"님의 카드생성완료");
	}
	void inputMoney(int money) {
		System.out.println("입금성공");
		this.bal+=money;
	}
	void outputMoney(int money) {
		System.out.print("비번입력: ");
		Scanner sc=new Scanner(System.in);
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			System.out.println("인출성공");
			this.bal-=money;
		}
		else {
			System.out.println("비밀번호불일치!");
		}
	}
	boolean checkpw(int pw) {
		if(this.pw==pw) {
			return true;
		}
		return false;
	}
	void show() {
		System.out.println(this.name+"님의 잔액: "+this.bal);
	}
}
class CheckCard extends Card{
	// 1. 기본생성자
	// 2. 부모의 기본생성자->부모의 기본생성자가 없다!
	CheckCard(String name, int bal, int pw) {
		super(name, bal, pw);
	}
	void outputMoney(int money) {
		System.out.print("비번입력: ");
		Scanner sc=new Scanner(System.in);
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			if(this.bal<money) {
				System.out.println("잔액부족!");
			}
			else {
				System.out.println("인출성공");
				this.bal-=money;
			}
		}
		else {
			System.out.println("비밀번호불일치!");
		}
	}
}
class BusCard extends Card{
	int age;
	BusCard(String name, int bal, int pw,int age) {
		super(name, bal, pw);
		this.age=age;
	}
	void use() {
		System.out.print("삐빅- ");
		if(this.age<=18) {
			System.out.println("청소년입니다.");
			// 800;
		}
		else if(this.age<=60) {
			System.out.println("성인입니다.");
			// 1299;
		}
		else {
			System.out.println("무료!");
		}
	}
}

public class CardMainAct {

	public static void main(String[] args) {
		CheckCard cc=new CheckCard("홍길동",10000,1111);
		//cc.outputMoney(20000);
		//cc.outputMoney(9000);
		//cc.outputMoney(9000);
		//cc.show();
		
		BusCard bs=new BusCard("임꺽정",10000,1111,20);
		bs.use();
	}

}
