// 캡슐화 . 
// 정보은닉: 접근제어자 == 접근지정자 == 접근자

// public : 다른 패키지에서도 접근 가능하다.
// private : 오직 자기 클래스에서만 접근 가능하다. - 정보은닉
// protected : 상속받은 클래스에서 접근 가능하다.
// 디폴트는 동일 패키지에서만 접근 가능하다.
// ex) 카카오나 결제 관련 -> C나 C++로 만들고 자바로 감싸는 식이다.
// 보통 자바는 패키지 단위로 이용한다. 캐릭터 만들 때에도 한 캐릭터당 하나의 패키지인 느낌.
// 

class A2{
	int x;
	private int y; // private으로 지정하면 class B, 즉 상속받은 자식 클래스에 영향을 미친다.
	// 영원히 가릴게 아니면, 접근하도록 해줘야 한다. -> getter, setter 함수를 사용한다.
	void setY(int y) {
		this.y = y;
	}
	int getY() {
		return this.y;  // 통상적으로 함수 안에 set을 붙인다. 이것만 보면 Y를 get, set하네? 그럼 y가 private이구나.
		// 이게 왜 가능하냐? 아무리 private이어도 class A2 내에서는 함수를 사용할 수 있으니까 클래스 내부 자체에서 풀어주는 것.
		// 엥 그럼 왜써? 당장 한번에 풀리지 않게 할 수 있고, 중요도나 보안을 강조하는 것일수도 있고. 실무에서는 또 의미를 갖는 듯 하다.
	}
	A2(){
		this.x=10;
		this.y=10;
	}
	void show() {
		System.out.println(this.x + "/" + this.y);
		
	}
}

class B extends A2{
	void show() {
		System.out.println("B에서 호출합니다");
		System.out.println(this.x + "/" + getY());
	}
}


public class Java0806_pubpvtprt {

	public static void main(String[] args) {
		A2 a = new A2();
		a.show();
		System.out.println();
		
		B b = new B();
		b.show();
	}

}
