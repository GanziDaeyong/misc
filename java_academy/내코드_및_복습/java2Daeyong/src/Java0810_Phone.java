
////////////////////////////������ ����/////////////////////////////


import java.util.Scanner;

class Phone {


	boolean power;
	String name;
	private int pw; // getter setter �����ض�.

	void setter(int pw) {
		this.pw = pw;
	}
	int getter() {
		return this.pw;
	}


	boolean powerch() {
		return this.power;
		// ���� ��ü�� �Ҹ����̴� �ٷ� �̷��� �����ص� �ɵ�.

	}
	boolean pwch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ �Է�");
		int pw_input = sc.nextInt();
		if (pw_input == this.pw) {
			return true;
		}
		System.out.println("��й�ȣ ����");
		return false;	

	}

	void changepw(int pw) {
		if(powerch()) {
			if (pwch()) {
				Scanner sc = new Scanner(System.in);
				System.out.println("�ٲ� ��й�ȣ �Է�");
				int ch_pw = sc.nextInt();
				this.pw = ch_pw; // setter�� ���� �����ʿ� ����. ���� Ŭ���� �������ϱ�.
				System.out.println("�ٲ� ��й�ȣ: " + this.pw);
			}
			else {
				System.out.println("�������");
			}
		}
		else {
			System.out.println("��������");
		}
	}
	void show() {
		if (powerch()) {
			System.out.println("�̸�: " + this.name + "\n���: " + this.pw);

			// ����ڿ� ���� ����(����) ��� ��� ����
		}
		else {
			System.out.println("��������");	
		}
	}
}


public class Java0810_Phone {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "���";
		p.power = true;

	}

}
