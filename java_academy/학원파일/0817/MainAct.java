
class Phone implements usePhone {
	String user;
	String num; // "010-1234-1234"
	Phone(String user){
		this(user,"�����ȵ�"); // ==������
	}
	Phone(String user,String num){
		this.user=user;
		this.num=num;
		System.out.println(this.user+"���� �� �����Ϸ�");
	}
	// ����� / �����,����ȣ
	// �����Ϸ�
	@Override
	public void siri() {
		System.out.println("��. ����־��~");
	}
}

interface usePhone{
	void siri(); // �߻�޼���->[������]
}

class Watch extends Phone implements useWatch{
	int h;
	// ����� / �����,����ȣ / �����,����ȣ,����ð�
	// �����Ϸ�
	Watch(String user){ // ������: ctrl+A,ctrl+I
		this(user,"�����ȵ�",10);
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
		System.out.println("����ð��� "+this.h+"��, �Դϴ�.");
	}
	@Override
	public void f2() {
		System.out.print(this.user+"���� �ð迡 ������ ��ȣ�� ");
		if(this.num=="�����ȵ�") {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println(this.num+", �Դϴ�.");
		}
	}
}

interface useWatch{
	void f1(); // ����ð� �˷��ֱ�()
	void f2(); // ������ �� �˷��ֱ�()
}

public class MainAct {

	public static void main(String[] args) {

		Watch w1=new Watch("�̸�");
		Watch w2=new Watch("ȫ�浿","010-1234-1234");
		Watch w3=new Watch("�Ӳ���","010-5678-5678",11);
		
		w1.f2();
		w2.f2();
		w3.f1();
		w3.siri();
		
	}

}




