
// 클래스 변수와 객체 변수  ==> static

class A {
	int a; // 인스턴스 변수
	// 객체마다 고유한 값을 갖게하는 변수.
	
	static int b; // 클래스 변수
	// 모든 인스턴스가 값을 공유하는 변수.
	void addA() {
		a += 10;
	}
	void addB() {
		b += 10;
		
	}
}


public class Java0805 {

	public static void main(String[] args) {
		
		A c1 = new A();
		c1.a = 1;
		c1.b = 2;
		c1.addA();
		c1.addB();
		System.out.println(c1.a + "/" + c1.b);
		A c2 = new A();
		System.out.println(c2.a + "/" + c2.b); // 엥 아무것도 안나와야 정상인데.. -> 클래스 변수이기 때문
		c2.addB();
		System.out.println(c1.a + "/" + c1.b); // 모든 인스턴스끼리 공유하니까 c1 바꿔도 c2에 나타난다.
		
	}
}
