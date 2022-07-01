class Person{
	String name;
	Person() { // �ڽ� Ŭ������ �⺻���� ȣ���ϱ� ������ �ۼ��ؾ� �Ѵ�.!
		System.out.println("�θ� Ŭ������ �⺻ ������");
	}
	Person(String name) {
		System.out.println("�θ� Ŭ������ ������");
		this.name = name;
	}
	void hello() {
		System.out.println("�ȳ��ϼ���");
	}
}

class Student extends Person {
	Student(String name) { // �ڽ� Ŭ������ �����ں��� ���� �θ� ����� �����Ѵ�. -> �״ϱ� �θ� Ŭ������ �⺻ �����ڰ� ���� ȣ�����.
		//super(); ������ ������ ���� �ȴ�. == �θ� Ŭ������ �⺻ ������. 
		System.out.println("�ڽ� Ŭ������ ������");
		this.name = name;
	}
	String name;
	void study() {
		System.out.println("������");
	}
}

class Teacher extends Person {
	String name;
	void hello() {
		System.out.println("����"); // �� �ٵ� ������ ���� hello�� �ȳ��ϼ��俴�µ�? -> �������̵�
	}
// �����ε� VS �������̵�
// �����ε��� ��Ӱ��谡 �ƴϴ�. �������̵��� ��Ӱ��迡�� �߻��Ѵ�.
// �� �� �Ժθ��� ������ �� �߻��Ѵ�.
// �����ε� : ������, println()
// �����ε� : ������ �ڷ��� or ���� �ٸ��� 
// �������̵� : ��ǲ �Ϻ��� ��ġ.
	void teach() {
		System.out.println("���� ����");
	}
}


public class Java0805_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Student s = new Student("���");
		Teacher t = new Teacher();
		p.hello();
		s.hello();
		t.hello();
		
		// �ٵ� �̷��� �Ϸ��� ���ϱ�, ����, �л� ��� hello()�� ������ �����ϱ� ���� ���� ���� �������ֱ� �����ݾ�!!!
		// �θ� Ŭ���� == ���� Ŭ����
		// �ڽ� Ŭ���� == ���� Ŭ����
		// ����� �ްԵǸ�, �θ� Ŭ������ ���� ������ ������ �ȴ�.
		// ��Ӱ� ���� �Լ����� ����, �ٸ� �Լ��� �����ϰ������, [�������̵�] == ������ �� �̿��Ѵ�.
		// �ڽ� Ŭ������ �����ڸ� ȣ���ϸ�, �θ�Ŭ������ �⺻�����ڰ� ȣ��ȴ�.#########################
		// �ڽ�Ŭ������ �����ں��� �θ�Ŭ������ ����! ȣ��ȴ�. ##################################
		// super(); ������ ������ ���� �ȴ�. == �θ� Ŭ������ �⺻ ������. 
		
		// this : �ڱ��ڽŰ�ü. 
		// this.~ (�� ��ü �ȿ� ����ִ� ����.)
		// this() : ������
		//	vs
		// super : �θ�Ŭ����, ����Ŭ����. 
		// super.~ (�� ��ü �ȿ� ����ִ� ����.)
		// super() : �θ�Ŭ������ ������.
	}

}
