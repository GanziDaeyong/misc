import java.util.Scanner;

class Circle{ // Ŭ����==�⺻����==�ؾƲ
	String name;
	int radius;
	Circle(){ // ������ �����ε�
		System.out.println("Ȯ");
		// �⺻ ������==����Ʈ ������
	}
	Circle(String name,int radius) {
		System.out.println("��");
		this.name=name; // this==�ڱ��ڽŰ�ü
		this.radius=radius;
	}
}

public class ClassMainAct {

	public static void main(String[] args) {
		
		// ��ü==�ν��Ͻ�==�ؾ�� ������! => �ν��Ͻ�ȭ==��üȭ
		Circle pizza=new Circle("����",100);
		Circle donut=new Circle("����",20); // 1:N=Ŭ����:��ü
		//�ڻ�����
		// 1. �Լ�
		// 2. Ŭ������ �̸��� ������
		// 3. Ŭ����->��ü == �ν��Ͻ�ȭ
		// 4. �⺻ ������==����Ʈ ������ �� ���ʿ� �����ȴ�.
		// 4-2. �����ڸ� �ϳ��� �����ϴ� ����, ����Ʈ������ �⺻����xxx
		// 4-3. ������ �����ε�
		// 5. thisŰ����
		pizza.name="����";
		pizza.radius=100;
		System.out.println(pizza.name+" / "+pizza.radius);
		//donut.name="����";
		//donut.radius=20;
		System.out.println(donut.name+" / "+donut.radius);
		Scanner sc=new Scanner(System.in);
	}

}