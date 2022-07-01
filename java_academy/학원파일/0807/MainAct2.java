
class Monster{
	String name;
	int level;
	int exp;
	Monster(String name){ // ������ �����ε�
		this(name,10);
	}
	Monster(String name,int level){
		this.name=name;
		this.level=level;
		this.exp=0;
	}
	void levelUp() { // �����ε�
		this.exp+=10;
		if(this.exp>=100) {
			System.out.println("������!");
			this.level++;
			this.exp-=100;
		}
	}
	void levelUp(int exp) {
		this.exp+=exp;
		if(this.exp>=100) {
			System.out.println("������!");
			this.level++;
			this.exp-=100;
		}
	}
	void show() {
		System.out.println(this.name+"���� ������ "+this.level+"�Դϴ�.");
	}
}
class Pika extends Monster { // ���
	// �ڵ��� ���뼺 ����: ������� / �����ı�ȿ�� �ּ�ȭ / �ڵ尣��ȭ
	Pika(){
		super("��ī��",5); // super==�θ�Ŭ����
		// �ڽ�Ŭ������ �����ڿ����� �������
		// �θ�Ŭ������ �⺻�����ڸ� ȣ����
	}
}
class Timo extends Monster{
	Timo(){
		super("Ƽ��",1);
		// �ڽĵ��� �θ��� ������� �̿��Ҽ��ֱ⶧����,
		// �θ��� �����ڸ� �ʿ���Ѵ�!
		//  -> super()�� �⺻������
		//  => �ٸ� �����ڸ� �̿��Ҽ�������!
	}
}

class A{
	int a;
	private int b; // ��������
	// getter,setter -> �Լ�
	void setB(int b) {
		this.b=b;
	}
	int getB(){
		return this.b;
	}
	A(){
		this.a=10;
		this.b=20;
	}
	void show(){
		System.out.println(this.a+" / "+this.b);
	}
}
class B extends A{
	// 1. ���� �����ڰ� ����. -> �⺻������ ��������
	B(){
		// 2. �ڽ��� �����ڿ����� ������� �θ��� �����ڸ� ȣ���Ѵ�.
		super();
	}
	// ��Ӱ��迡��, �θ�Ŭ������ �Լ��� �ڽ�Ŭ������ [������]�Ҽ��ִ�.
	// �������̵�: �Լ���,���ڱ��� ���� �Ȱ���
	void show() {
		System.out.println("�١�"+this.a+"/"+getB()+"�١�");
	}
}

public class MainAct2 {

	public static void main(String[] args) {
		// 2-���  3-ĸ��ȭ(����������)
		/*
		Timo t=new Timo();
		t.show();
		t.levelUp(120);
		t.show();
		*/
		B bclass=new B();
		bclass.show();
	}

}
