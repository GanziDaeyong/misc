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
		// ��й�ȣ�Է�
		Scanner sc=new Scanner(System.in);
		System.out.print("����Է�: ");
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			System.out.println(this.name+"���� ��ȣ�� "+this.num+"�Դϴ�.");
		}
		else {
			System.out.println("��й�ȣ����ġ!");
		}
	}
}
class SmartPhone extends Phone{
	
	SmartPhone(String name, int pw, int num) {
		super(name, pw, num);
	}

	// + ��й�ȣ�ٲٱ�()
	void changepw(int newpw) {
		Scanner sc=new Scanner(System.in);
		System.out.print("��������Է�: ");
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			// �����������
			setpw(newpw);
		}
		else {
			System.out.println("��й�ȣ����ġ!");
		}
	}
}

public class PhoneMainAct {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone("ȫ�浿",1111,6789);
		s.changepw(1234);
		s.show();
	}

}







