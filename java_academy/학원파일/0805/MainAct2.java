
// ���
class Person{
	String name;
	Person(){
		// �ڽ�Ŭ�������� �⺻���� ȣ���ϱ⶧���� �ۼ��ؾ���!
		System.out.println("�θ�Ŭ������ �⺻������");
	}
	Person(String name){
		System.out.println("�θ�Ŭ������ ������");
		this.name=name;
	}
	void hello() {
		System.out.println("�ȳ��ϼ���!");
	}
}

// �θ�Ŭ����==����Ŭ����
// �ڽ�Ŭ����==����Ŭ����
class Student extends Person {
	Student(String name){
		//super(); // == �θ�Ŭ������ �⺻������
		// 22�����κ��ٸ��� �θ�Ŭ������ �⺻�����ڰ� ȣ��ȴ�!!!
		System.out.println("�ڽ�Ŭ������ ������");
		this.name=name;
	}
	void study() {
		System.out.println("������!!!!!!!");
	}
	void hello() { // �������̵�==������
		System.out.println("����");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("���������մϴ�~^^");
	}
}

public class MainAct2 {

	public static void main(String[] args) {
		Person p=new Person();
		p.hello();
		Student s=new Student("�л��̸�");
		s.hello();
		s.study();
		Teacher t=new Teacher();
		// �ڽ�Ŭ������ �����ڸ� ȣ���ϸ�,
		// �θ�Ŭ������ �⺻�����ڰ� ȣ��ȴ�!
		// [�ڽ�Ŭ������ �����ں��� ����]
		t.hello();
		t.teach();
	}

}



