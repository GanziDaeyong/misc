////////////////////////////////인터페이스//////////////////////////////////

interface Inter {
	int AAA = 10; // 상수는 "반드시" 초기화해아한다.(상수이기때문에 bold하다. )
	public static final int BBB = 20; //이런게 생략되어있다고 보면 된다.
	// public : 널리널리 사용한다.
	// static : 객체와 무관하게 사용한다.(==> 사용자 정의 함수와 유사하다.)
	// final : 값 변경 불가능하다.
	
	void aaa(); // 추상메서드
	public abstract void bbb();
	// public : 널리널리 사용해라.
	// abstract : [강제성]을 부여한다.
	
}

class abc implements Inter {
	
	// 인터페이스 상속은 implements라 한다. 상속한다고 안하고 "구현한다"고 한다.
	// 상속은 하나만, implement는 여려개 가능하다. => 다중상속이라 한다.
	// class abc extends 부모클래스 implements Inter1, Inter2  // 이런식으로
	


	@Override
	public void aaa() { // 부모의 공개범위보다 자식의 공개범위가 크거나 같아야 한다.
		//여기선 부모가 public, 제일 큰거니까 자식도 public 이어야지.
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
}

public class Java0810_Interface {

	public static void main(String[] args) {
		int aaa;

	}

}
