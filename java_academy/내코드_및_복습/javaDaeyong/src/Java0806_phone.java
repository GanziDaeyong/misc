import java.util.Scanner;

class Phone {
	String name; private int pw; int num; /// pw�� get set.
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
	boolean checkpw(int pw) { ////////////////boolean�� �ٽ� üũ
	if(this.pw == pw) {
		return true;
	}
	return false;
	}

	
	void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����Է�: ");
		int pw = sc.nextInt();
		if(checkpw(pw)) {
			System.out.println(this.name + "/" + this.num);
		}
		else {
			System.out.println("�������");
		}
	}
}

class smartPhone extends Phone{

	smartPhone(String name, int pw, int num) {
		super(name, pw, num); // ���۷δ� �� �޾ƾ� �ϴ°�? �ƾ� ���� Ŭ������ �����ڸ� ���� ���� ���̹Ƿ� ���ڰ� ��ġ�ؾ� �ϴ±���.
	}
	
	void changePw(int newPw) {
		Scanner sc = new Scanner (System.in);
		System.out.println("������� �Է�: ");
		int pw = sc.nextInt();
		if (checkpw(pw)) {
		setPw(newPw);
		}
		else {
			System.out.println("�������");
		}
		
		
		
		
	}
}

public class Java0806_phone {

	public static void main(String[] args) {
		smartPhone s = new smartPhone ("���", 4804, 97814804);
		s.show();
		
		System.out.println("�ٲٰ��� �ϴ� ���");
		int input = sc.nextInt();
		/////////////////////////////�̰� ���� �����ϱ�/////////////////////////////////
		s.changePw(4707);
		
		//�߻�ȭ, ĸ��ȭ �����ߴ�.
		//���� ������ ���Ҵ�.
				
	}
	}






