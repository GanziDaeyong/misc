//class Teach {
//	String name;
//	int time;
//	Teach(){
//		this("no class", 0);
//		// ������� / 0
//	}
//	Teach(String name) {
//		// name / 2
//		this(name, 0);
//
//	}
//	Teach(String name, int time) {
//		this.name = name;
//		this.time = time;	
//	}
//}

class Animal {
	String name;
	Animal () {
	}
	Animal (String name) {
		this.name = name;
	}
	void speak() {
		System.out.println("�����Ҹ�");
	}
}

class Dog extends Animal {
	Dog(String name) {
		this.name = name;
	}
	void speak() {
		System.out.println("�۸�");
	}
	
}
class Cat extends Animal {
	Cat(String name) {
		this.name = name;
	}
	void speak() {
		System.out.println("�߿�");
	}
	
}


public class Java0805_inheritance_2 {

	public static void main(String[] args) {
//		Teach t1 = new Teach();
//		System.out.println(t1.name + ": " + t1.time + "�ð�");
//		Teach t2 = new Teach("C");
//		System.out.println(t2.name + ": " + t2.time + "�ð�");

// ��������
		Dog d1 = new Dog("��ġ");
		d1.speak();
		Cat c1 = new Cat("��ġ");
		c1.speak();
		
		
	}

}
