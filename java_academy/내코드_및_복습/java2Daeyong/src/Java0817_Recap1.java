class PhoneNew implements usePhone{
	String user;
	String num;
	
	PhoneNew(String user, String num){
		this.user = user;
		this.num = num;
		System.out.println("������ �Ϸ�");
	}
	PhoneNew(String user) {
		this(user, "��ȣ ����");
	}
	@Override
	public void siri() {
		System.out.println("�ø��� �̰� �ø��� �ڤ�");	
	}
		
}


interface usePhone{
	void siri(); // �߻�޼���� ���� �����ִ�.
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
		this(user, "��ȣ ����", 0);
	}
	@Override
	public void f1() {
		System.out.println("�ð�:" + h);
		
	}
	@Override
	public void f2() {
		if (this.num == "��ȣ ����") {
			System.out.println("�����Ȱ� ����.");
		}
		else {
		System.out.println("������ ��: " + this.num);
		}
		
	}
	
}

interface useWatch {   // �������̽��� �⺻������ ���뼺�� ���� ���̶� ���⼭ �������� �ʵ��� �ϴ� ���̴�.
	void f1(); // ����ð� �˷��ֱ�
	void f2(); // ������ �� �˷��ֱ�
}




public class Java0817_Recap1 {

	public static void main(String[] args) {
		
		Watch galaxy = new Watch("���", "010-9781-4804", 17);
		Watch gram = new Watch("���");
		galaxy.f1();
		galaxy.f2();
		galaxy.siri();
		
		gram.f1();
		gram.f2();
		gram.siri();
		
//////////////////// . ������� ��� ������ �Ķ���, �Լ��� �ʷϻ�, ������ �㿬 �ܾ���� �����.
		// �Լ� �̸�  - ��� ���� - �����
		
	}

}
