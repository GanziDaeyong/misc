
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
				System.out.println("��й�ȣ �缳��: ");
				this.pw=1111;
			}
			else {
				System.out.println("��й�ȣ ����ġ");
			}
		}
		else {
			System.out.println("������ ��������");
		}
	}
	void show(int pw) {
		if(powerch()) {
			if(pwch(pw)) {
				System.out.println(this.name+"���� �ڵ��� ���� ��й�ȣ�� "+this.pw+"�Դϴ�.");
			}
			else {
				System.out.println("��й�ȣ ����ġ");
			}
		}
		else {
			System.out.println("������ ��������");
		}
	}
}

public class PhoneMainAct {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.name="ȫ�浿";
		p.power=false;
		p.setpw(1234);
		p.show(1234);
		
		p.power=true;
		p.show(1111);
	}

}











