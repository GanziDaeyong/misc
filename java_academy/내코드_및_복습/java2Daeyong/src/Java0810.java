import java.util.Scanner;

class Person {
	void call(Animal a) {
		a.speak();
		
	}
}


class Animal{
	void speak() {
		System.out.println("�����Ҹ�");
	}
}

class Dog extends Animal {
	void speak() {
		System.out.println("�۸�");
	}
}
class Cat extends Animal {
	void speak() {
	System.out.println("�߿�");
	}
}

public class Java0810 {

	public static void main(String[] args) {
		Person p = new Person();
		Animal a1 = new Dog();
		Animal a2 = new Cat(); // ��ĳ����. Animal Ʋ�� ���� ���������, ���� ������� Dog�� Cat�̴�
		a1.speak();
		a2.speak();
		
		// Ʋ�� ������, ���� ���� ������ �Ʒ��� �������� �ϴ� ���� ��ĳ�����Ѵٰ� �Ѵ�.
		// �̸� ���� ���ε��̶� �Ѵ�. �̸� ���� ���ε��̶� �Ѵ�.
	}
	

}
