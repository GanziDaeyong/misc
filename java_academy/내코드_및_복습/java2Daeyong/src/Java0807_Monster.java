//class Monster {
//	//�̸� ���� ����ġ
//	
//	
//	String name;
//	int lv;
//	int exp;
//
//	Monster (String name, int lv) {
//		this.name = name;
//		this.lv = lv;
//		this.exp = 0;
//	}
//	
//	Monster (String name) {
//		this(name, 10);
//	}
//
//	void lvup() {
//		this.exp += 30;
//		if (this.exp >= 100) {
//			this.lv ++;
//			this.exp -= 100;
//		}
//
//	}
//	void lvup(int exp) {
//		this.exp += exp;
//		if (this.exp >= 100) {
//			this.lv ++;
//			this.exp -= 100;
//		}
//
//	}
//	void show() {
//		System.out.println("Lv." + this.lv + " " + this.name + " (" + this.exp+ ")");	
//	}
//	
//}
//
//class Pika extends Monster { // ���
//	// ���뼺 ���� : ������� / �����ı�ȿ�� �ּ�ȭ / �ڵ尣��ȭ
//	Pika(){
//		super("��ī��", 5);
//	}
//}
//
//class Timo extends Monster {
//	Timo() {
//		super("Ƽ��", 1);
//		// �ڽĵ��� �θ��� ������� �̿��� �� �ֱ� ������, �θ��� �����ڸ� �ʿ�� �Ѵ�.
//		// -> super()�� �⺻�����ȴ�.
//		// �ٸ� �����ڸ� �̿��Ҽ��� �ִ�.
//	}
//}


class A{
	int a;
	private int b; // ��������
	A() {
		this.a = 10;
		this.b = 20;
	}
	
	///getter/ setter �����ϱ�
	// �����̰�? �ѹ� �����ִ� ����.
	
	void setB(int b) {
		this.b = b;
	}
	int getB() {
		return this.b;
	}
	
	void show() {
		System.out.println(this.a + "/" + this.b);
	}
}

class B extends A{
	// 1. ���� �����ڰ� ����. -> �⺻������ �������̴�.
	B(){
		// 2. �ڽ��� �����ڿ����� ���� ���� �θ��� �����ڸ� ȣ���Ѵ�. super(); �� �����Ǿ��ִ°��̴�.
	}
	
	// ��Ӱ��迡��, �θ�Ŭ������ �Լ��� �ڽ�Ŭ������ [������] �� �� �ֵ�.
	// �������̵�: �Լ���, ���ڱ��� ���� �Ȱ���.
	
	void show() {
		System.out.println("B�������" + this.a + "/" + getB());
	}
}


public class Java0807_Monster {

	public static void main(String[] args) {
//		Monster m = new Monster("������");
//		m.show();
//		m.lvup();
//		m.lvup();
//		m.show();
//		m.lvup(60);
//		m.show();
//		m.lvup(40);
//		m.show();
		
		B bclass = new B();
		bclass.show(); // �������̵�
	}

}

////////////////////////������ �°� �����ϴ� ���� ����� �������/////////////////////////���� �� �غ���//////////////////////

