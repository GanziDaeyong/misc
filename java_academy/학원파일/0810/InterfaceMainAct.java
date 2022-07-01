
interface Inter{ // [강제성]부여
	int AAA=10; // 상수-> "반드시" 초기화해야함
	public static final int BBB=20;
	// public: 널리널리사용
	// static: 객체와 무관하게 사용(==> 사용자정의함수와 유사)
	// final: 값 변경 불가능
	void aaa(); // => 추상메서드
	public abstract void bbb();
	// public: 널리널리사용
	// abstract: [강제성] 부여
}
/*
// 다중상속을 가능하게하는 인터페이스
class ABC extends 부모클래스명 implements Inter,Inter1 { // 구현한다.

	@Override
	public void aaa() { // 부모의 공개범위 <= 자식의 공개범위
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
*/
public class InterfaceMainAct {

	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
	}

}
