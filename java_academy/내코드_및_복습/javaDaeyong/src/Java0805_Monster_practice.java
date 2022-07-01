import java.util.Scanner;

class Monster{
	String name;
	int max_h;
	int cur_h;
	Monster(String name) {
		this.name = name;
		this.max_h = 100;
		this.cur_h = max_h;
	}
	Monster(String name, int max_h) {
		this.name = name;
		this.max_h = max_h;
		this.cur_h = max_h;
	}
	void atk() {
		this.cur_h -= 20;
		if (this.cur_h <= 0 ) {
			this.cur_h = 0;
			System.out.println("사망.");
		}
		else {
			System.out.println("피 20 감소.");	
		}
	}
	void heal() {
		this.cur_h += 20;
		if (this.cur_h >= this.max_h) {
			this.cur_h = this.max_h;
			System.out.println("풀피.");
		}
		else {
			System.out.println("피 20 증가.");
		}
	}
	void show() {
		System.out.println("현재: " + this.cur_h);
	}
	
	
}




public class Java0805_Monster_practice {

	public static void main(String[] args) {
		// 멤버변수: 이름 최대체력 체력
		// att() -20 heal() +20  show() 상태출력
		// 생성자 -> 인자가 1개짜리 (이름) -> 최대체력 100
		// 생성자 -> 인자가 2개짜리 (이름, 최대체력)
		// -> 생성자 오버로딩
		// 객체 2개 생성
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		int max_h = sc.nextInt();
	
		Monster m1 = new Monster (name);
		Monster m2 = new Monster (name, 200);
		
		
	}

}
