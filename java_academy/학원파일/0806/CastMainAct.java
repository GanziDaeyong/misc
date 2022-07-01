
class Person2{
	String name;

	// ������ü�� ���ڷ� �޴� �Լ�
	// �ٸ� ����� ����Ҽ��ֵ��� �����ҿ���
	void call(Animal a) { // ����Ŭ������ �θ���ϴ� �ڽ�Ŭ�������� ���ڷ� �� ����
		// ���� Animal, ���� Dog/Cat
		a.speak(); // [�������ε�]
		System.out.println("��~~~!!");
	}
	
	// ���İ�ü�� ���ڷ� �޴� �Լ�
	// �޴����
	void eat(Food f) {
		f.name();
		System.out.println("��(��) �Խ��ϴ�.");
	}
	
	void show() {
		System.out.println("���Ŭ����");
		System.out.println(this.name+"�Դϴ�.");
	}
}
class Student2 extends Person2{
	int score;
	void show() {
		System.out.println("�л�Ŭ����");
		System.out.println(this.name+"�� ����="+this.score);
	}
}

class Food{
	void name() {
		System.out.print("�޴��̸�");
	}
}
class Menu1 extends Food{
	void name() { // �������̵�==������
		System.out.print("����");
	}
}
class Menu2 extends Food{
	void name() {
		System.out.print("���");
	}
}

class Animal{
	void speak() {
		System.out.print("�����̸�");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.print("�۸�");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.print("�߿�");
	}
}

public class CastMainAct {

	public static void main(String[] args) {
		
		// ����ȯ -> ĳ����
		
		Person2 c1=new Student2(); // �� ĳ����
		c1.name="���_�ؾƲ������ ���� �л�_�ؾ";
		//c1.score=100; -> xxx
		c1.show();
		
		/*
		-> �� ĳ���õ� ��ü�� �ǵ����������� ���
		Student2 c2=(Student2)new Person2(); // �ٿ� ĳ����
		c2.name="�л�_�ؾƲ������ ���� ���_�ؾ";
		c2.show();
		*/
		
		Person2 p=new Person2();
		Animal a1=new Dog(); // �� ĳ����
		Animal a2=new Cat();
		p.call(a1);
		p.call(a2);
		
		Food m1=new Menu1(); // �� ĳ����
		Food m2=new Menu2();
		p.eat(m1);
		p.eat(m2);
		
	}

}
// 









