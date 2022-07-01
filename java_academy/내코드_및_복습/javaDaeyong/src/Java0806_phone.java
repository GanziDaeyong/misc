import java.util.Scanner;

class Phone {
	String name; private int pw; int num; /// pw의 get set.
	Phone(String name, int pw, int num){
		
		this.name = name;
		this.pw = pw;
		this.num = num;
	}
	
	void setPw(int pw) {
		this.pw = pw;
	}
	int getPw() {
		return this.pw; 
	}
	boolean checkpw(int pw) { ////////////////boolean형 다시 체크
	if(this.pw == pw) {
		return true;
	}
	return false;
	}

	
	void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비번입력: ");
		int pw = sc.nextInt();
		if(checkpw(pw)) {
			System.out.println(this.name + "/" + this.num);
		}
		else {
			System.out.println("비번오류");
		}
	}
}

class smartPhone extends Phone{

	smartPhone(String name, int pw, int num) {
		super(name, pw, num); // 슈퍼로는 다 받아야 하는가? 아아 위의 클래스의 생성자를 빌려 오는 것이므로 인자가 일치해야 하는구나.
	}
	
	void changePw(int newPw) {
		Scanner sc = new Scanner (System.in);
		System.out.println("기존비번 입력: ");
		int pw = sc.nextInt();
		if (checkpw(pw)) {
		setPw(newPw);
		}
		else {
			System.out.println("비번오류");
		}
		
		
		
		
	}
}

public class Java0806_phone {

	public static void main(String[] args) {
		smartPhone s = new smartPhone ("대용", 4804, 97814804);
		s.show();
		
		System.out.println("바꾸고자 하는 비번");
		int input = sc.nextInt();
		/////////////////////////////이거 마저 정리하기/////////////////////////////////
		s.changePw(4707);
		
		//추상화, 캡슐화 진행했다.
		//이제 다형성 남았다.
				
	}
	}






