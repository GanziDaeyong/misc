/////////////////////////////////������//////////////////////////////////////

//class prsn {
//	String name;
//	void show() {
//		System.out.println("���Ŭ����");
//		System.out.println(this.name + "�Դϴ�.");
//	}
//	
//	// ������ü�� ���ڷ� �޴� �Լ�.
//	// �ٸ� ����� ����� �� �ֵ��� ������ �����̴�.
//	
//	}
//}

//class stdnt extends prsn {
//	int score;
//	void show() {
//		System.out.println("�л�Ŭ����");
//		System.out.println(this.name + "�� ���� = " + this.score);
//	}
//}

////////////////////////��������////////////////////////////////////////////////////////////
//// Ŭ���� �� �Լ����� �ٸ� Ŭ���� ������ �� �ֱ���.. Animal a ó��.
//class Animal {
//		void call(Animal a) { // ����Ŭ������ �θ���ϴ� �ڽ�Ŭ�������� ���ڷ� �� ����
//		// ���� animal, ���� dog/cat
//		a.speak();
//		System.out.println("��~");
//	void speak() {
//		System.out.println("���� �̸�");
//	}
//}
//class Dog extends Animal {
//	void speak() {
//		System.out.println("�۸�");
//	}
//}
//class Cat extends Animal {
//	void speak() {
//		System.out.println("�Ŀ�");
//	}
//}
//

///////////////////////////////////////////��������//////////////////////////////////////////////

class fd {
	void eat(Food f) {
		f.name();
		System.out.println("��(��) �Խ��ϴ�");
	}
}
class Food {
	void name() {
		System.out.println("����");
	}
}

class chicken extends Food {
	void name() {
		System.out.print("ġŲ");
	}
}


public class Java0806_cast_main_act {

	public static void main(String[] args) {		
		
//		// �ڷ����� �� ��ȯ�� Ŭ���� �������� �ö󰡸� ĳ������ �Ǵ� ���̴�.
//		prsn c1 = new stdnt(); // ���� �� Ʋ�� prsn�̱� ������ ��� ���� ���� �л��̴��� stdnt�� ������� score�� �ҷ��� �� ����.
//		// �̷����� ���� �� ĳ�����̶� �Ѵ�. 
//		c1.name = "���_�ؾƲ�� ���� ���� �л�_�ؾ";
////		c1.score = 100; -> �̰� �ȵȴ�.
//		c1.show();
//		
//		stdnt c2 = (stdnt) new prsn(); // �ٿ�ĳ������ �׳� ���ָ� �ȵȴ�. ���� ����ȯ���� ����� �Ѵ�. // int i = (int) 3.14 ���� ����ȯ ó��.
//		c2.name = "�л�_�ؾƲ�� ���� ���� ���_�ؾ";
//		c2.score = 100; // �� �̰� �Ǳ� �ϰ��� �л�_�ؾ�� ������. 
//		// �׷���!! ���� ���������� �����Ѱ���, ������ �۵����� �ʴ´�. Ŭ���� ���ڰ� �ٸ��� �޾����ϱ�.
//		// �׷� �̰� ��� ����? �� ĳ���õ� ��ü�� �������� ���� ����� ���̴�.
		
//�������� ��ĳ����////////////////////////�߿�///////////////////////////////////////////////////////////////
//		prsn p = new prsn();
//		Animal a1 = new Dog(); // ��ĳ����
//		Animal a2 = new Cat(); // ��ĳ����
//		
//		// ��ĳ������ �̿��Ͽ� �̸��� ��~ ���̴� ���̴�. ������ animal�� ȣ���� �� a.speak() ȣ�� ��,  ~�� �� �ٿ���.
//		// a.speak()�� ã�ư��µ�, ��ĳ���� �Ǿ��ֱ� ������ ������ ������ Dog�� �������̵� �� �Լ��� �����ϰ� ��~�� �ٴ� ����.
//		// �̸� ���� ���ε��̶� �Ѵ�. 
//		
		fd f = new fd();
		Food m1 = new chicken();
		f.eat(m1);
		
	}

}
