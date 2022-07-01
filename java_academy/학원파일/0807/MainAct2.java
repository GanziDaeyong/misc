
class Monster{
	String name;
	int level;
	int exp;
	Monster(String name){ // 생성자 오버로딩
		this(name,10);
	}
	Monster(String name,int level){
		this.name=name;
		this.level=level;
		this.exp=0;
	}
	void levelUp() { // 오버로딩
		this.exp+=10;
		if(this.exp>=100) {
			System.out.println("레벨업!");
			this.level++;
			this.exp-=100;
		}
	}
	void levelUp(int exp) {
		this.exp+=exp;
		if(this.exp>=100) {
			System.out.println("레벨업!");
			this.level++;
			this.exp-=100;
		}
	}
	void show() {
		System.out.println(this.name+"님의 레벨은 "+this.level+"입니다.");
	}
}
class Pika extends Monster { // 상속
	// 코드의 재사용성 증가: 비용절감 / 오류파급효과 최소화 / 코드간결화
	Pika(){
		super("피카츄",5); // super==부모클래스
		// 자식클래스의 생성자에서는 가장먼저
		// 부모클래스의 기본생성자를 호출함
	}
}
class Timo extends Monster{
	Timo(){
		super("티모",1);
		// 자식들이 부모의 멤버들을 이용할수있기때문에,
		// 부모의 생성자를 필요로한다!
		//  -> super()가 기본제공됨
		//  => 다른 생성자를 이용할수도있음!
	}
}

class A{
	int a;
	private int b; // 정보은닉
	// getter,setter -> 함수
	void setB(int b) {
		this.b=b;
	}
	int getB(){
		return this.b;
	}
	A(){
		this.a=10;
		this.b=20;
	}
	void show(){
		System.out.println(this.a+" / "+this.b);
	}
}
class B extends A{
	// 1. 현재 생성자가 없다. -> 기본생성자 제공중임
	B(){
		// 2. 자식의 생성자에서는 가장먼저 부모의 생성자를 호출한다.
		super();
	}
	// 상속관계에서, 부모클래스의 함수를 자식클래스가 [재정의]할수있다.
	// 오버라이딩: 함수명,인자까지 전부 똑같음
	void show() {
		System.out.println("☆★"+this.a+"/"+getB()+"☆★");
	}
}

public class MainAct2 {

	public static void main(String[] args) {
		// 2-상속  3-캡슐화(접근제어자)
		/*
		Timo t=new Timo();
		t.show();
		t.levelUp(120);
		t.show();
		*/
		B bclass=new B();
		bclass.show();
	}

}
