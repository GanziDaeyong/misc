
// 클래스 변수와 객체 변수 => static

class A{
	int a; // 인스턴스 변수
	// 객체마다 고유한 값을 갖게하는 변수
	static int b; // 클래스 변수
	// 모든 인스턴스가 값을 공유하는 변수
	void addA() {
		a+=10;
	}
	void addB() {
		b+=10;
	}
}

public class MainAct {

	public static void main(String[] args) {
		
		A c1=new A();
		c1.a=1;
		c1.b=2;
		c1.addA();
		c1.addB();
		System.out.println("1번클래스: "+c1.a+" / "+c1.b);
		
		A c2=new A();
		System.out.println("2번클래스: "+c2.a+" / "+c2.b);
		c2.addA();
		c2.addB();
		System.out.println("2번클래스: "+c2.a+" / "+c2.b);
		
		System.out.println("1번클래스: "+c1.a+" / "+c1.b);
		
	}

}
