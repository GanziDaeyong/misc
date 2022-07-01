import java.util.Scanner;

class Monster{
	String name;
	int max_h;
	int cur_h;
	Monster(String name) {
		this.name = name;
		this.max_h = 100;
		this.cur_h = max_h;
	}
	Monster(String name, int max_h) {
		this.name = name;
		this.max_h = max_h;
		this.cur_h = max_h;
	}
	void atk() {
		this.cur_h -= 20;
		if (this.cur_h <= 0 ) {
			this.cur_h = 0;
			System.out.println("���.");
		}
		else {
			System.out.println("�� 20 ����.");	
		}
	}
	void heal() {
		this.cur_h += 20;
		if (this.cur_h >= this.max_h) {
			this.cur_h = this.max_h;
			System.out.println("Ǯ��.");
		}
		else {
			System.out.println("�� 20 ����.");
		}
	}
	void show() {
		System.out.println("����: " + this.cur_h);
	}
	
	
}




public class Java0805_Monster_practice {

	public static void main(String[] args) {
		// �������: �̸� �ִ�ü�� ü��
		// att() -20 heal() +20  show() �������
		// ������ -> ���ڰ� 1��¥�� (�̸�) -> �ִ�ü�� 100
		// ������ -> ���ڰ� 2��¥�� (�̸�, �ִ�ü��)
		// -> ������ �����ε�
		// ��ü 2�� ����
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		int max_h = sc.nextInt();
	
		Monster m1 = new Monster (name);
		Monster m2 = new Monster (name, 200);
		
		
	}

}
