
// Ŭ���� ������ ��ü ����  ==> static

class A {
	int a; // �ν��Ͻ� ����
	// ��ü���� ������ ���� �����ϴ� ����.
	
	static int b; // Ŭ���� ����
	// ��� �ν��Ͻ��� ���� �����ϴ� ����.
	void addA() {
		a += 10;
	}
	void addB() {
		b += 10;
		
	}
}


public class Java0805 {

	public static void main(String[] args) {
		
		A c1 = new A();
		c1.a = 1;
		c1.b = 2;
		c1.addA();
		c1.addB();
		System.out.println(c1.a + "/" + c1.b);
		A c2 = new A();
		System.out.println(c2.a + "/" + c2.b); // �� �ƹ��͵� �ȳ��;� �����ε�.. -> Ŭ���� �����̱� ����
		c2.addB();
		System.out.println(c1.a + "/" + c1.b); // ��� �ν��Ͻ����� �����ϴϱ� c1 �ٲ㵵 c2�� ��Ÿ����.
		
	}
}
