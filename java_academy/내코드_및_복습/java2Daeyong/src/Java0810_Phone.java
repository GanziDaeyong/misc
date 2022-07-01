
////////////////////////////다형성 연습/////////////////////////////


import java.util.Scanner;

class Phone {


	boolean power;
	String name;
	private int pw; // getter setter 구현해라.

	void setter(int pw) {
		this.pw = pw;
	}
	int getter() {
		return this.pw;
	}


	boolean powerch() {
		return this.power;
		// 전원 자체가 불린형이니 바로 이렇게 리턴해도 될듯.

	}
	boolean pwch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력");
		int pw_input = sc.nextInt();
		if (pw_input == this.pw) {
			return true;
		}
		System.out.println("비밀번호 오류");
		return false;	

	}

	void changepw(int pw) {
		if(powerch()) {
			if (pwch()) {
				Scanner sc = new Scanner(System.in);
				System.out.println("바꿀 비밀번호 입력");
				int ch_pw = sc.nextInt();
				this.pw = ch_pw; // setter는 굳이 써줄필요 없지. 같은 클래스 내에서니까.
				System.out.println("바뀐 비밀번호: " + this.pw);
			}
			else {
				System.out.println("비번오류");
			}
		}
		else {
			System.out.println("전원꺼짐");
		}
	}
	void show() {
		if (powerch()) {
			System.out.println("이름: " + this.name + "\n비번: " + this.pw);

			// 사용자와 폰의 상태(전원) 비번 모두 리턴
		}
		else {
			System.out.println("전원꺼짐");	
		}
	}
}


public class Java0810_Phone {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "대용";
		p.power = true;

	}

}
