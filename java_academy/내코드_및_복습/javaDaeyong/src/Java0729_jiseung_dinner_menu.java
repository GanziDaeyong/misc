import java.util.Scanner;

public class Java0729_jiseung_dinner_menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
// ���õ��. 
		//��ġ� 5000 �������� 4500 ��� 6000 ���� 5500 ���ܺ���� 6500 ����� 3500 �����ġ�� 7000
		
		System.out.println("�޴��� �������ּ���. \n 1.��ġ�  2.��������  3.��� \n 4.����  5.���ܺ����  6.����� \n 7.�����ġ�� ");
		int m = sc.nextInt();
		String m1 = "��ġ�"; 
		String m2 = "��������"; 
		String m3 = "���";
		String m4 = "����";
		String m5 = "���ܺ����";
		String m6 = "�����";
		String m7 = "�����ġ��";
		int p1 = 5000;
		int p2 = 4500;
		int p3 = 6000;
		int p4 = 5500;
		int p5 = 6500;
		int p6 = 3500;
		int p7 = 7000;
		
		String menu = "";
		int price = 0;
		
		switch(m) {
		case 1:
			menu = m1;
			price = p1;
			System.out.println("��ġ� : 5000��");
			break;
			
		case 2:
			menu = m2;
			price = p2;
			System.out.println("�������� : 4500��");
			break;
		case 3:
			menu = m3;
			price = p3;
			System.out.println("��� : 6000��");
			break;
		case 4:
			menu = m4;
			price = p4;
			System.out.println("���� : 5500��");
			break;
		case 5:
			menu = m5;
			price = p5;
			System.out.println("���ܺ���� : 6500��");
			break;
		case 6:
			menu = m6;
			price = p6;
			System.out.println("����� : 3500��");
			break;
		case 7:
			menu = m7;
			price = p7;
			System.out.println("�����ġ�� : 7000��");
			break;
		default :
			System.out.println("�޴��� 1~7������ �ֽ��ϴ�. �ٽ� �������ּ���.");
			break;
			
		}
		
		System.out.println("���� ������ �����մϴ�. \n ������ �־��ּ���.");
		int money = sc.nextInt();
		System.out.println("���Ե� �ݾ��� " + money + "�� �Դϴ�.");
		if (money>=price) {
			int change = money - price;
			System.out.println("���� ����." + menu + "�� �ֹ��Ǿ����ϴ�.");
			System.out.println("�Ʒ����� �Ž��� ��" + change + "�� �޾ư�����." );
		}
		else {
			System.out.println("�ݾ��� �����մϴ�. ������ �� �־��ּ���");
			int again = sc.nextInt();
		
			money += again;
			if (money >= price) {
				int change = money - price;
				System.out.println("���� ����." + menu + "�� �ֹ��Ǿ����ϴ�.");
				System.out.println("�Ʒ����� �Ž��� ��" + change + "�� �޾ư�����." );
			}
			else {
				System.out.println("�ݾ��� �����մϴ�.\n " + money + "���� ��ȯ�˴ϴ�. \n ó������ �ٽ� �ֹ����ּ���.");
				
			}
		
		}
		
	
		
		
	}

}
