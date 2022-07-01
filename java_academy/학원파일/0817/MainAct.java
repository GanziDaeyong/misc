
class Phone implements usePhone {
	String user;
	String num; // "010-1234-1234"
	Phone(String user){
		this(user,"연동안됨"); // ==생성자
	}
	Phone(String user,String num){
		this.user=user;
		this.num=num;
		System.out.println(this.user+"님의 폰 생성완료");
	}
	// 사용자 / 사용자,폰번호
	// 생성완료
	@Override
	public void siri() {
		System.out.println("네. 듣고있어요~");
	}
}

interface usePhone{
	void siri(); // 추상메서드->[강제성]
}

class Watch extends Phone implements useWatch{
	int h;
	// 사용자 / 사용자,폰번호 / 사용자,폰번호,현재시간
	// 생성완료
	Watch(String user){ // 줄정렬: ctrl+A,ctrl+I
		this(user,"연동안됨",10);
	}
	Watch(String user,String num){
		this(user,num,10);
	}
	Watch(String user,String num,int h){
		super(user,num);
		this.h=h;
	}
	@Override
	public void f1() {
		System.out.println("현재시각은 "+this.h+"시, 입니다.");
	}
	@Override
	public void f2() {
		System.out.print(this.user+"님의 시계에 연동된 번호는 ");
		if(this.num=="연동안됨") {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(this.num+", 입니다.");
		}
	}
}

interface useWatch{
	void f1(); // 현재시간 알려주기()
	void f2(); // 연동된 폰 알려주기()
}

public class MainAct {

	public static void main(String[] args) {

		Watch w1=new Watch("이름");
		Watch w2=new Watch("홍길동","010-1234-1234");
		Watch w3=new Watch("임꺽정","010-5678-5678",11);
		
		w1.f2();
		w2.f2();
		w3.f1();
		w3.siri();
		
	}

}




