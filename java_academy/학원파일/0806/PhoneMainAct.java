import java.util.Scanner;

class Phone {
	String name;
	private int pw; // get(),set() -> !
	int num;
	Phone(String name,int pw,int num){
		this.name=name;
		this.pw=pw;
		this.num=num;
	}
	void setpw(int pw) {
		this.pw=pw;
	}
	int getpw() {
		return this.pw;
	}
	boolean checkpw(int pw) {
		if(this.pw==pw) {
			return true;
		}
		return false;
	}
	void show() {
		// 비밀번호입력
		Scanner sc=new Scanner(System.in);
		System.out.print("비번입력: ");
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			System.out.println(this.name+"님의 번호는 "+this.num+"입니다.");
		}
		else {
			System.out.println("비밀번호불일치!");
		}
	}
}
class SmartPhone extends Phone{
	
	SmartPhone(String name, int pw, int num) {
		super(name, pw, num);
	}

	// + 비밀번호바꾸기()
	void changepw(int newpw) {
		Scanner sc=new Scanner(System.in);
		System.out.print("기존비번입력: ");
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			// 비번변경진행
			setpw(newpw);
		}
		else {
			System.out.println("비밀번호불일치!");
		}
	}
}

public class PhoneMainAct {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone("홍길동",1111,6789);
		s.changepw(1234);
		s.show();
	}

}







