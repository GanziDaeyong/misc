
class Person{
	void call(Animal a) { // �������ε�
		a.speak();
	}
}

class Animal{
	void speak() {
		System.out.println("�����Ҹ�");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.println("�п�!");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.println("�߿�~");
	}
}


public class MainAct {

	public static void main(String[] args) {
		// ������
		Person p = new Person();
		Animal a1=new Dog(); // �� ĳ����
		Animal a2=new Cat();
		p.call(a1);
		p.call(a2);
	}

}









