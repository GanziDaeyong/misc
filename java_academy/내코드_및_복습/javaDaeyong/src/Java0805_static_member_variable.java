import java.util.Scanner;

//class Dog{
//	String name;
//	static String act[];
//	static int index;
//	void add_odr(String str) {
//		act[index] = str;
//		index++;
//	}
//}

class Game {
	String name;
	int score;
	static int sum; // Ŭ���� �����ΰ� �ٽ�. ��ü�鳢�� �����Ѵ�. 
	
	Game(String name, int score) {
		this.name = name;
		this.score = score;
		System.out.println(this.name + " : "+ this.score);
	}
	
	void add_num () {
		sum += this.score ;
		if (sum >= 10) {
			System.out.println("����: " + sum);
			System.out.println(this.name + " ���� !");
			System.out.println("���� �ʱ�ȭ");
			sum = 0;
		}
		
	}
	
}





public class Java0805_static_member_variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
//		Dog d1 = new Dog();
//		d1.name = "����";
//		d1.act = new String[5];
//		d1.index = 0;
//		d1.add_odr("�ɾ�");
//		d1.add_odr("��ٷ�");
//		System.out.println(d1.name + "�� ����Ʒ�");
//		for (int i = 0; i<d1.index; i++) {
//			System.out.println(d1.act[i] + " ");
//		}
//		System.out.println();
//		
//		Dog d2 = new Dog();
//		
//		d2.name = "���";
//		System.out.println(d2.name + "�� ����Ʒ�");
//		for (int i = 0; i<d2.index; i++) {
//			System.out.println(d2.act[i] + " ");
//	}
		
		System.out.println("�轺Ų ��� 10 ����!");
		Game user1 = new Game("���", 7);
		user1.sum = 0; // �̰� ��ġ �ſ� �߿�. Ŭ���� ���� ���� ��ġ�� ������ ���� �ƴѵ�? ���� �ٽ�. ##########################
		user1.add_num();
		Game user2 = new Game("����", 4);
		user2.add_num();
		Game user3 = new Game("����", 2);
		user3.add_num();
		// -> �̰� �Լ��ε� ���� �̸�, ���� �ֱ⸸ �ص� �Ǵ� ���α׷����� �� �� ������.
	}
	
}
