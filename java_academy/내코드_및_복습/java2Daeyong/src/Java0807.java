/*
��ü�������� Ư¡
1. [�߻�ȭ]  Ŭ���� -> �ν��Ͻ�ȭ �̷��� �߻�ȭ �����ε�.


�����ε��� ��ǥ���� ��� -> println.

Ŭ���� : ��ü�� �����ϱ� ���� ���̴�.
(Ŭ����)---------->(�ν��Ͻ�ȭ==��üȭ)--------->(�ν��Ͻ�==��ü)
			 	       ������ -> �Լ�
*/

import java.util.Scanner; // Ctrl + shift + o  -> �ڵ�����Ʈ

class Car{ // Ŭ����: �⺻����, ��ü���� Ʋ
	String name; // ������� == �ʵ� == �Ӽ�
	int speed; // ��״� ���� �ν��Ͻ� �����̴�. == ��ü����. ��ü���� �������� ���� ���� �����̴�. <-> Ŭ���� ����. Ŭ���� ������ ��� �ν��Ͻ��� �� ���� �����Ѵ�.
	int maxspeed;
	//static int maxSpeed; Ŭ�������� : "��ü�� �����ϰ�"
	
	Car() { // ������ �����ε�
		//this.speed = 0;
		this("�̸��Է¾���", 0, 0);
	}
	
	Car(String name, int speed, int maxspeed) { // ������ �����ε�
		this.name = name;
		this.speed = speed;
		this.maxspeed= maxspeed;
	}
	
	
	void speedUp() { // ����Լ� == �޼���
		this.speed += 20;
		if (this.speed >= this.maxspeed) {
			System.out.println("����");
			this.speed = this.maxspeed;
		}
	}
	void speedUp(int speed) { // �����ε� -> �Լ����� ���� ���ڰ� �ٸ��� (�ڷ���, ����) ���� ���
		this.speed += speed;
		if (this.speed >= this.maxspeed) {
			System.out.println("����");
			this.speed = this.maxspeed;
		}
	}
	void speedDown() {
		this.speed -= 20;
		if (this.speed <= 0) {
			System.out.println("�����մϴ�.");
			this.speed = 0;
		}
	}
	void show() {
		System.out.println(this.speed +"\t"+ this.name);
		
	}

}


public class Java0807 {
	// ��ü���� ����� 4���� Ư¡
	// �߻�ȭ

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Car c1 = new Car("���",0,0); // ����Ʈ������ == �⺻������
		// ����Ʈ������ Ư: ������ �ϳ��� ����� ������ ���������.
//		c1.name = "���";
//		c1.speed = 0;
//		c1.maxspeed = 50;
		c1.show();
//		c1.speedUp();
		c1.speedUp(50);
		c1.speedDown();
		c1.show();
	}

}
