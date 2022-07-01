
class Phone {
	boolean power;
	String name;
	private int pw;
	void setpw(int pw) {
		this.pw=pw;
	}
	int getpw() {
		return this.pw;
	}
	boolean powerch() {
		return this.power;
	}
	boolean pwch(int pw) {
		if(this.pw==pw){
			return true;
		}
		return false;
	}
	void changepw(int pw) {
		if(powerch()) {
			if(pwch(pw)) {
				System.out.println("비밀번호 재설정: ");
				this.pw=1111;
			}
			else {
				System.out.println("비밀번호 불일치");
			}
		}
		else {
			System.out.println("전원이 꺼져있음");
		}
	}
	void show(int pw) {
		if(powerch()) {
			if(pwch(pw)) {
				System.out.println(this.name+"님의 핸드폰 현재 비밀번호는 "+this.pw+"입니다.");
			}
			else {
				System.out.println("비밀번호 불일치");
			}
		}
		else {
			System.out.println("전원이 꺼져있음");
		}
	}
}

public class PhoneMainAct {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.name="홍길동";
		p.power=false;
		p.setpw(1234);
		p.show(1234);
		
		p.power=true;
		p.show(1111);
	}

}











