
class Animal{ // �θ�Ŭ����
	String name;
	Animal(){
		this("�����̸�����");
	}
	Animal(String name){
		this.name=name;
	}
	void speak() {
		System.out.println("�����Ҹ�");
	}
}
// 1.extends 2.speak()�������̵� 3.�����ڱ���
class Puppy extends Animal{
	Puppy(String name){
		this.name=name;
	}
	void speak() { // �������̵�==������
		System.out.println("�۸�");
	}
}
class Cat extends Animal{
	Cat(String name){
		this.name=name;
	}
	void speak() { // �������̵�==������
		System.out.println("�߿�");
	}
}

public class AnimalMainAct {

	public static void main(String[] args) {
		Cat c=new Cat("����");
		c.speak();
	}

}








