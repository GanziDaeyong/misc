// ĸ��ȭ . 
// ��������: ���������� == ���������� == ������

// public : �ٸ� ��Ű�������� ���� �����ϴ�.
// private : ���� �ڱ� Ŭ���������� ���� �����ϴ�. - ��������
// protected : ��ӹ��� Ŭ�������� ���� �����ϴ�.
// ����Ʈ�� ���� ��Ű�������� ���� �����ϴ�.
// ex) īī���� ���� ���� -> C�� C++�� ����� �ڹٷ� ���δ� ���̴�.
// ���� �ڹٴ� ��Ű�� ������ �̿��Ѵ�. ĳ���� ���� ������ �� ĳ���ʹ� �ϳ��� ��Ű���� ����.
// 

class A2{
	int x;
	private int y; // private���� �����ϸ� class B, �� ��ӹ��� �ڽ� Ŭ������ ������ ��ģ��.
	// ������ ������ �ƴϸ�, �����ϵ��� ����� �Ѵ�. -> getter, setter �Լ��� ����Ѵ�.
	void setY(int y) {
		this.y = y;
	}
	int getY() {
		return this.y;  // ��������� �Լ� �ȿ� set�� ���δ�. �̰͸� ���� Y�� get, set�ϳ�? �׷� y�� private�̱���.
		// �̰� �� �����ϳ�? �ƹ��� private�̾ class A2 �������� �Լ��� ����� �� �����ϱ� Ŭ���� ���� ��ü���� Ǯ���ִ� ��.
		// �� �׷� �ֽ�? ���� �ѹ��� Ǯ���� �ʰ� �� �� �ְ�, �߿䵵�� ������ �����ϴ� ���ϼ��� �ְ�. �ǹ������� �� �ǹ̸� ���� �� �ϴ�.
	}
	A2(){
		this.x=10;
		this.y=10;
	}
	void show() {
		System.out.println(this.x + "/" + this.y);
		
	}
}

class B extends A2{
	void show() {
		System.out.println("B���� ȣ���մϴ�");
		System.out.println(this.x + "/" + getY());
	}
}


public class Java0806_pubpvtprt {

	public static void main(String[] args) {
		A2 a = new A2();
		a.show();
		System.out.println();
		
		B b = new B();
		b.show();
	}

}
