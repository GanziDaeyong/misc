// ATM �������̽�
// : ����() �Ա�()

// ī���� �������̽�
// : ����()


// ī�� Ŭ���� -> ī�� ��ü�� ����.
// : ����� �̸�
// : �ݵ�� show �� �����ؾ� �Ѵ�.

// üũī�� Ŭ���� -> ATM, ī����
// : �ܾ�

// �ſ�ī�� Ŭ���� -> ī���� �������̽�
// : �ѵ�


interface ATM {
	void withdraw(int amount);
	void deposit(int amount);
}
interface Card_usage {
	void pay(int cost);
}

abstract class prac_card {
	String name;
	abstract void show(); // �� abstract �Ƚᵵ �Ǵµ�, �׳� �������� �߿��ϴ�.
}

class check_card extends prac_card implements ATM, Card_usage {
	
	int left;
	check_card(String name, int left) {
		this.name = name;
		this.left = left;
	}

	@Override
	public void pay(int cost) {
		System.out.println("���� �õ�");
		if (this.left < cost) {
			System.out.println("�ܾ� ����");
		}
		else {
			this.left -= cost;
			System.out.println("���� ����");
		}
	}

	public void withdraw(int amount) {
		System.out.println("���� �õ�");
		if (this.left < amount) {
			System.out.println("�ܾ� ����");
		}
		else {
			this.left -= amount;
			System.out.println("���� ����");
		}
		
	}

	@Override
	public void deposit(int amount) {
		
		System.out.println("�Ա� �õ�");
		this.left += amount;
		System.out.println("�Ա� ����");
		
	}

	void show() { // �ڽ��� �θ𺸴� ���������� �о���ϴµ�, �̹� public�� �پ��ִ� ģ������ �״�� public�� ������ ��.
		// �ƴ� ģ���� �״�� void�� �� ��.
		System.out.println("�̸�: " + this.name + "\n�ܾ�: " + this.left);
		
	}

	
}

class credit_card extends prac_card implements Card_usage {
	int used;
	int lim;
	credit_card (String name, int used, int lim) {
		this.name = name;
		this.used = used;
		this.lim = lim;
	}
	
	public void pay(int cost) {
		System.out.println("���� �õ�");
		if (this.used + cost > this.lim) {
			System.out.println("�ѵ� �ʰ�");
		}
		else {
			this.used += cost;
			System.out.println("���� ����");
		}
	}


	void show() { // �ڽ��� �θ𺸴� ���������� �о���ϴµ�, �̹� public�� �پ��ִ� ģ������ �״�� public�� ������ ��.
		// �ƴ� ģ���� �״�� void�� �� ��.
		System.out.println("�̸�: " + this.name + "\n���ݾ�: " + this.used + "\n�ѵ�: " + this.lim);
		
	}
}



public class Java0810_card_prac {

	public static void main(String[] args) {
		check_card c = new check_card("����", 3000);
		c.deposit(500);
		c.show();
		c.pay(600);
		c.show();
		
	}

}
