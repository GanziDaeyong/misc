
// ĸ��ȭ
// ��������: ����������==����������==������

class A{
	int x;
	private int y; // getter,setter : �Լ�
	void setY(int y) {
		this.y=y;
	}
	int getY() {
		return this.y;
	}
	A(){
		this.x=10;
		this.y=20;
	}
	void show() {
		System.out.println(this.x+" / "+this.y);
	}
}
class B extends A{
	void show() {
		System.out.println("B���� ȣ��");
		System.out.println(this.x+" / "+getY());
	}
}

public class MainAct {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		
		System.out.println();
		
		B b=new B();
		b.show();
	}

}









