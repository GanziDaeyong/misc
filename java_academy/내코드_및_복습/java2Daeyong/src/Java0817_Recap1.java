class PhoneNew implements usePhone{
	String user;
	String num;
	
	PhoneNew(String user, String num){
		this.user = user;
		this.num = num;
		System.out.println("폰생성 완료");
	}
	PhoneNew(String user) {
		this(user, "번호 없음");
	}
	@Override
	public void siri() {
		System.out.println("시리는 이가 시리다 앜ㅋ");	
	}
		
}


interface usePhone{
	void siri(); // 추상메서드란 말이 숨어있다.
}

class Watch extends PhoneNew implements useWatch{
	
	int h;
	Watch(String user, String num, int h) {
		super(user, num);
		this.h = h;
	}
	Watch(String user, String num) {
		this(user, num, 0);
	}
	Watch(String user) {
		this(user, "번호 없음", 0);
	}
	@Override
	public void f1() {
		System.out.println("시간:" + h);
		
	}
	@Override
	public void f2() {
		if (this.num == "번호 없음") {
			System.out.println("연동된거 없음.");
		}
		else {
		System.out.println("연동된 폰: " + this.num);
		}
		
	}
	
}

interface useWatch {   // 인터페이스는 기본적으로 재사용성을 위한 것이라서 여기서 선언하지 않도록 하는 것이다.
	void f1(); // 현재시간 알려주기
	void f2(); // 연동된 폰 알려주기
}




public class Java0817_Recap1 {

	public static void main(String[] args) {
		
		Watch galaxy = new Watch("대용", "010-9781-4804", 17);
		Watch gram = new Watch("대용");
		galaxy.f1();
		galaxy.f2();
		galaxy.siri();
		
		gram.f1();
		gram.f2();
		gram.siri();
		
//////////////////// . 찍었을때 멤버 변수는 파란색, 함수는 초록색, 오른쪽 허연 단어들은 출신지.
		// 함수 이름  - 출력 형태 - 출신지
		
	}

}
