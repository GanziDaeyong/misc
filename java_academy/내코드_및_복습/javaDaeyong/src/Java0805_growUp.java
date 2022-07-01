import java.util.Scanner;

class growUp { 
	String name;
	int height;
	int eat_gauge;
	growUp(String name, int height) {
		this.name = name;
		this.height = height;
		this.eat_gauge = 0;
		
	}
	void height_up(int food_num){
		System.out.println(food_num+"�� ������ �Ծ����ϴ�.");
		switch(food_num) {
		case 1, 2, 9:
			this.eat_gauge += 50;
			System.out.println("Ű�� ���� ũ�� ����ΰ�!!!");
			break;
		case 5, 6, 8:
			this.eat_gauge += 10;
			System.out.println("Ű�� ���� ũ�� ����ε�!");
			break;
		case 3, 4, 7:
			this.eat_gauge -= 50;
			System.out.println("Ű�� �پ��� ����̾�...");
			break;
		default:
			System.out.println("���� ��ȣ�� �ٽ� �Է����ּ���.");
			break;
		}
		
		if (this.eat_gauge >= 100) {
			this.height ++;
			this.eat_gauge -= 100;
			System.out.println("Ű�� ��¥ Ŀ����!" + "\n���� Ű��: " + this.height + "cm");
		}
		else if (this.eat_gauge < 0) {
			this.height --;
			System.out.println("Ű�� ��¥�� �پ���.." + "\n���� Ű��: " + this.height + "cm");
		}
				
	}
	
}
public class Java0805_growUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		
		System.out.println("���� Ű�� �Է��ϼ��� (cm)");
		int height = sc.nextInt(); 
		
		growUp j = new growUp(name, height);
		
		System.out.println("�޴��� �����ϼ��� \n1.���� 2.�ñ�ġ 3.ġŲ \n4.������ 5.���� 6.�������ֽ� \n7.�ݶ� 8.����� 9.������ \n0.�׸��Ա�");

		while (true) {
			int food_num = sc.nextInt();
			if (food_num != 0) {
				j.height_up(food_num);
			}
			else {
				break;
			}
		}
	}

}
