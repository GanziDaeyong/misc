import java.util.Scanner;

public class Java0729 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	��������1		
		//���� 2�� �Է�
		//ù ���� - ��° ����
//		System.out.print("ù ��° ������ �Է��ϼ���: ");
//		int num1 = sc.nextInt();
//		System.out.print("�� ��° ������ �Է��ϼ���: ");
//		int num2 = sc.nextInt();
//		int rst = num1 - num2;
//		System.out.println("�� ������ �� �����: " + rst + "�Դϴ�!");
		
//	string��?
//		sc.nextLine();//-> �߸��� ���͸� �ѹ� �������ָ� �ȴ�. int�� ��� ���⸦ �����ϴ� ����� �ֱ� ������ �����̴�. 
//		String str = sc.nextLine();
//		System.out.println(str); //�̷��� ���� �ʰ� �׳� ����ȴ�. -> �ڹ� ���α׷��� ������ �Է��� enter ���� �޾ƹ�����. 
		// int�� line ���̿��� ������ sc.nextLine() ���شٰ� �����ϸ� �ȴ�. ���� �����ϱ� ���ؼ��̴�. ( =���� �����Ѵ�.)
		
		
//	�񱳿����� < > <= >= == != �� 6����.
//		int a = 10;
//		int b = 20;
//		System.out.println(a >= b);
//		System.out.println(a == b);
//		System.out.println(a != b);
//		// =�� �ϳ� ������ ���Կ�����, �ΰ� ������ �� �������̴�.
		
//	�������� -> ����
//		// AND && ������ �׸���, ~�̰�
//		// OR || ������ �Ǵ�, ~�ų�
//		System.out.println(1<2 && 2<3);
//		System.out.println(1<2 || 2>3);
		
//	��������2
		//���� 3�� �Է� ���� ���Ͽ� ���/ ���տ��� -1 �ϰ� 10���� ũ�� true �ƴϸ� false
//		System.out.print("ù ��° ������ �Է��ϼ���: ");
//		int x = sc.nextInt();
//		System.out.print("�� ��° ������ �Է��ϼ���: ");
//		int y = sc.nextInt();
//		System.out.print("�� ��° ������ �Է��ϼ���: ");
//		int z = sc.nextInt();
//		int rst = x+y+z;
//		System.out.println("�� ������ ����: " + rst);
//		int rst2 = rst - 1;
//		System.out.print("�� ������ �� -1 �� 10���� ū��? ");
//		System.out.println(rst2 > 10);
		
		// �ٸ���� (���Կ����� / ���������� �Ἥ �ѹ� �����غ���!)
//		int sum = 0;
//		sum += x; // sum = sum + a
//		sum += y;
//		sum += z;
//		sum --;
//		System.out.println(sum>10);
		
		
//	�������� 3
		// ���� 3�� �Է� / ��� ��� -> �Ҽ������� ���
//		int x,y,z;
//		System.out.print("ù ��° ������ �Է��ϼ���: ");
//		x = sc.nextInt();
//		System.out.print("�� ��° ������ �Է��ϼ���: ");
//		y = sc.nextInt();
//		System.out.print("�� ��° ������ �Է��ϼ���: ");
//		z = sc.nextInt();
//		double rst = (x+y+z)/3.0; //3.0�� �����ָ� �������� ������ �ν��ȴ�. int�� int�ϱ�
//		System.out.println("�� ������ �����: " + rst);
		
		
//	�ƽ�Ű�ڵ� (�ƽ�Ű�ڵ�ǥ ����)
//		char c = 'a'; // �ƽ�Ű�� 97
//		c++; // 97 + 1 = 98 = �ƽ�Ű�� b
//		System.out.println(c);
		
		
//	���
		// ��� : ���ǹ�  vs �ݺ���
		// ���ǹ� - �б��� / �������� 
		// �ݺ��� - Ư�� ����̳� �ൿ�� ������ ������ ��
		
//		int d;
//		d = sc.nextInt();
//		if (d%2 == 0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
// 		�������Ͽ����� else�� ����! ������ �������� Ȯ��ġ �ʰ� �ٷ� else�� ���ϱ� ȿ���� ��� ��������.
//		}
		
		
//	�������� 4
//		int input2;
//		System.out.print("���� �ϳ��� �Է��ϼ���: ");
//		input2 = sc.nextInt();
//		if (input2 == 0) {
//			System.out.println("�̰� 0�̾�!");
//		}
//		else if (input2 > 0) {
//			if (input2 > 300) {
//				System.out.println("�ſ� ū ���!!");
//			}
//			else {
//				System.out.println("�� ���� ������ ū ���");
//			
//		}
//		else {
//			System.out.println("�� ���� �ٷ�! ����");
//		} 
		// ���̽� elif == else if.
		
		
//	�������� 5
//		int input1, input2, input3;
//		input1 = sc.nextInt();
//		input2 = sc.nextInt();
//		input3 = sc.nextInt();
//		if (input1>input2 && input1>input3) {
//			System.out.println("input1�� ���� ũ��!!");
//		}
//		else if (input2>input1 && input2>input3) {
//			System.out.println("input2�� ���� ũ��!!");
//		}
//		else if (input3>input1 && input3>input2) {
//			System.out.println("input3�� ���� ũ��!!");
//		} // �б����� a>b �� �ΰ� if ���� �� if else �Ἥ �� �� �ִ�.
		
		
//	�������� 6 // �ٽ��غ���!!
		//���� 2�� �Է� / 5 50 -> 5�� 50��. 1�ð� 20�� �� �ð��� ����ض�.
		//0~59��. 1~12��
		
//		int min, hour;
//		hour = sc.nextInt();
//		min = sc.nextInt();
//		
//		if (min-20 < 0) {
//			int new_min = 60-(20-min);
//			if (hour - 2 < 0) {
//				int new_hour = 12-(12-hour);
//			}
//			System.out.println(new_hour + "��" + new_min + "��");
//		}
//		else {
//			int new_min = 60-min;
//			int new_hour = hour - 1;
//			System.out.println(new_hour + "��" + new_min + "��");
//		}
//		
		
//	�������� 6 ������ Ǯ��		
//		int h,m;
//		h = sc.nextInt();
//		m = sc.nextInt();
//		h--;
//		m-=20;
//		if (m<0) {
//			m += 60;
//			h --;
//		}
//		if (h<0) {
//			h+=24;
//		}
//		System.out.println(h+":"+m);
		
		
//// switch
//		int num = sc.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("��");
//			break;
//		case 2:
//			System.out.println("��");
//			break;
//		case 3:
//			System.out.println("��");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("��ĥ��");
//			break;
//		default:
//			System.out.println("�ش����!");
//			break;
//		// break �Ƚ��ָ� �Ȱɸ��� ������ ����ȴ�. case ����ǰ� �� �ݾ�����. 
			
			
//	�������� 7
//		int sco = sc.nextInt();
//		sco /= 10;
//		switch(sco) {
//		case 10:
//		case 9:
//			System.out.println("A���");
//			break;
//		case 8:
//			System.out.println("B���");
//			break;
//		case 7:
//			System.out.println("C���");
//			break;
//		default :
//			System.out.println("F���");
//			break;
//
//		}
		
		
//// ���Ǳ� �����
//		System.out.println("ġŲ ��ȣ�� ����ּ���~! 1.�׳׽�����ġ��  2.BHC�Ѹ�Ŭ  3.ó�������۽�����  4.��������޺�");
//		
//		int button;
//		button = sc.nextInt();
////		1 - 900 2- 1200 3- 800 4- 800
//		
//		if (button == 1) {
//			int price = 15000;
//			System.out.println("�׳� ������ġ�� �� �����ϼ̽��ϴ�");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("���Ḧ �������� \n �ܵ��� " + change + "�Դϴ�");
//			}
//			else {
//				System.out.println("�ݾ��� �����մϴ�");
//			}
//		}
//		
//		else if (button == 2) {
//			int price = 17000;
//			System.out.println("BHC �Ѹ�Ŭ �� �����ϼ̽��ϴ�");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("���Ḧ �������� \n �ܵ��� " + change + "�Դϴ�");
//			}
//			else {
//				System.out.println("�ݾ��� �����մϴ�");
//			}
//		}
//		
//		else if (button == 3) {
//			int price = 18000;
//			System.out.println("ó���� ���۽������� �����ϼ̽��ϴ�");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("���Ḧ �������� \n �ܵ��� " + change + "�Դϴ�");
//			}
//			else {
//				System.out.println("�ݾ��� �����մϴ�");
//			}
//		}
//		
//		else if (button == 4) {
//			int price = 20000;
//			System.out.println("���� ����޺��� �����ϼ̽��ϴ�");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("���Ḧ �������� \n �ܵ��� " + change + "�Դϴ�");
//			}
//			else {
//				System.out.println("�ݾ��� �����մϴ�");
//			}
//		} 
//		
////	������ ���
//		int b2 = sc.nextInt();
//		String m1 = "������";
//		String m2 = "�̴ָ��̵�";
//		String m3 = "top";
//		String m4 = "����";
//		
//		int p1 = 900;
//		int p2 = 1200;
//		int p3 = 800;
//		int p4 = 800;
//		
//		String menu = m1;
//		int price = p1;
//		
//		switch(b2) {
//		
//		case 2 : 
//			menu= m2 ;
//			price = p2 ;
//			break;
//		case 3 : 
//			menu= m3 ;
//			price = p3 ;
//			break;
//		case 4 : 
//			menu= m4 ;
//			price = p4 ;
//			break;
//			
//		// ���� �غ���!!!
//		}
//		
		
//	�ݺ���
		// ����� ������ �����ϰ� ������.
		
		//System.out.println("�ȳ�!"); // �̰� �� �� �ϰ�ʹٰ� �ĺ�.
		
		int i = 0;
		while (i<10) {
			if (i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		// �ſ��߿� �����ǥ �ſ��߿� //
		//��ȭ�� ���̸� �ۼ��ϴ� ǥ�� ����� ǥ��� �Ѵ�. �̰� �ſ� �߿��ϴ�. �׸��°� ����ȭ�ض�.
		
		// ���� -> �� �ڵ��� �����ǥ�� �׷�����.
		
		
		
		
		
		
	}	

}
