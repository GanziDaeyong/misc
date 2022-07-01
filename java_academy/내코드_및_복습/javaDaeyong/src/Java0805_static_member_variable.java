import java.util.Scanner;

//class Dog{
//	String name;
//	static String act[];
//	static int index;
//	void add_odr(String str) {
//		act[index] = str;
//		index++;
//	}
//}

class Game {
	String name;
	int score;
	static int sum; // 클래스 변수인게 핵심. 객체들끼리 공유한다. 
	
	Game(String name, int score) {
		this.name = name;
		this.score = score;
		System.out.println(this.name + " : "+ this.score);
	}
	
	void add_num () {
		sum += this.score ;
		if (sum >= 10) {
			System.out.println("현재: " + sum);
			System.out.println(this.name + " 잭팟 !");
			System.out.println("게임 초기화");
			sum = 0;
		}
		
	}
	
}





public class Java0805_static_member_variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
//		Dog d1 = new Dog();
//		d1.name = "지숭";
//		d1.act = new String[5];
//		d1.index = 0;
//		d1.add_odr("앉아");
//		d1.add_odr("기다려");
//		System.out.println(d1.name + "이 배운훈련");
//		for (int i = 0; i<d1.index; i++) {
//			System.out.println(d1.act[i] + " ");
//		}
//		System.out.println();
//		
//		Dog d2 = new Dog();
//		
//		d2.name = "대용";
//		System.out.println(d2.name + "이 배운훈련");
//		for (int i = 0; i<d2.index; i++) {
//			System.out.println(d2.act[i] + " ");
//	}
		
		System.out.println("배스킨 라빈스 10 게임!");
		Game user1 = new Game("대용", 7);
		user1.sum = 0; // 이거 위치 매우 중요. 클래스 변수 선언 위치는 생성자 내부 아닌듯? 질문 다시. ##########################
		user1.add_num();
		Game user2 = new Game("지승", 4);
		user2.add_num();
		Game user3 = new Game("서연", 2);
		user3.add_num();
		// -> 이거 함수로도 만들어서 이름, 점수 넣기만 해도 되는 프로그램으로 할 수 있을듯.
	}
	
}
