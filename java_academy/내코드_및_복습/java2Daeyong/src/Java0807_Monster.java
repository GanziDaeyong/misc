//class Monster {
//	//이름 레벨 경험치
//	
//	
//	String name;
//	int lv;
//	int exp;
//
//	Monster (String name, int lv) {
//		this.name = name;
//		this.lv = lv;
//		this.exp = 0;
//	}
//	
//	Monster (String name) {
//		this(name, 10);
//	}
//
//	void lvup() {
//		this.exp += 30;
//		if (this.exp >= 100) {
//			this.lv ++;
//			this.exp -= 100;
//		}
//
//	}
//	void lvup(int exp) {
//		this.exp += exp;
//		if (this.exp >= 100) {
//			this.lv ++;
//			this.exp -= 100;
//		}
//
//	}
//	void show() {
//		System.out.println("Lv." + this.lv + " " + this.name + " (" + this.exp+ ")");	
//	}
//	
//}
//
//class Pika extends Monster { // 상속
//	// 재사용성 증가 : 비용절감 / 오류파급효과 최소화 / 코드간결화
//	Pika(){
//		super("피카츄", 5);
//	}
//}
//
//class Timo extends Monster {
//	Timo() {
//		super("티모", 1);
//		// 자식들이 부모의 멤버들을 이용할 수 있기 때문에, 부모의 생성자를 필요로 한다.
//		// -> super()가 기본제공된다.
//		// 다른 생성자를 이용할수도 있다.
//	}
//}


class A{
	int a;
	private int b; // 정보은닉
	A() {
		this.a = 10;
		this.b = 20;
	}
	
	///getter/ setter 연습하기
	// 왜해이거? 한번 막아주는 거지.
	
	void setB(int b) {
		this.b = b;
	}
	int getB() {
		return this.b;
	}
	
	void show() {
		System.out.println(this.a + "/" + this.b);
	}
}

class B extends A{
	// 1. 현재 생성자가 없다. -> 기본생성자 제공중이다.
	B(){
		// 2. 자식의 생성자에서는 가장 먼저 부모의 생성자를 호출한다. super(); 가 생략되어있는것이다.
	}
	
	// 상속관계에서, 부모클래스의 함수를 자식클래스가 [재정의] 할 수 있따.
	// 오버라이딩: 함수명, 인자까지 전부 똑같다.
	
	void show() {
		System.out.println("B에서출력" + this.a + "/" + getB());
	}
}


public class Java0807_Monster {

	public static void main(String[] args) {
//		Monster m = new Monster("누멍이");
//		m.show();
//		m.lvup();
//		m.lvup();
//		m.show();
//		m.lvup(60);
//		m.show();
//		m.lvup(40);
//		m.show();
		
		B bclass = new B();
		bclass.show(); // 오버라이딩
	}

}

////////////////////////레벨에 맞게 성장하는 게임 만들면 재밌을듯/////////////////////////동적 후 해보기//////////////////////

