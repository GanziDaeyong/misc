import java.util.Scanner;

public class Java0730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	��������1
		//���� ������ּ���

		//		Scanner sc = new Scanner(System.in);
		//		int num1 = sc.nextInt();
		//		if (num1<0) {
		//			num1 *= -1;
		//		}
		//		System.out.println(num1);


		//		int i = 0;
		//		int num = sc.nextInt();
		//		while (i<num) {
		//			if (i%2 == 0) {
		//				System.out.println(i);
		//			}
		//			i++;
		//		
		//		}
		// 1���� �����ϰ�ʹٸ�? ÷�� i�� 1�� �ְų�, i++�� if�� �տ� ������ �ȴ�.


//	��������2
		//		int i = 0;
		//		int num = sc.nextInt();
		//		int rst;
		//		while (i <= num) {
		//			rst = num/2;
		//			if (num%2 == 1) {
		//				rst +=1;
		//			}
		//			i++;
		//			
		//		System.out.println(rst);
		//		/// ���� �ٽ�!!! �׳� cnt ++ �ϸ� ������.
		//		}	


		//	���ѷ���			
		//		int num=1;
		//		while( true ) { //���ѷ��� -> break��.
		// ���ѷ����� �ݵ�� [�ߴܽ���],[��������]�� �־�� �Ѵ�. break��.
		//			System.out.println("�ȳ�");
		//			num = sc.nextInt();
		//			if (num != 1) {
		//				break; // ���� ����� while ���� �ٱ����� �������� �ּ���!
		//			}
		//		}


		// break �� continue
		//		int i = 0;
		//		while (i<10) {
		//			i++;
		//			if (i%2 == 0) {
		//				continue; // <-> break 
		//				// break�� �Ʒ��� �Ĵٺ��� �ʰ� �ڵ� ������ ���������µ�,
		//				// continue�� �Ʒ��� �Ĵٺ��� �ʰ� �ٽ� while�� �ö󰣴�. �� ����.
		//			}
		//			System.out.println(i);
		//		}


//	��������3 - �����Է�. ����Է��ϸ� ����ӷ�. �����Է��ϸ� �ƹ��͵� �ȳ���. 0������ ���� (break)
		// �ݺ��� ���� �ߴ��ϰ������, �ݺ��� �ߴ��ϰ� ���� �ʾ�! continue;
		//		while (true) {
		//			int input = sc.nextInt();
		//			if (input>0) {
		//				System.out.println("����Է���");
		//			}
		//			else if (input <0) {
		//				continue;
		//			}
		//			else {
		//				System.out.println("0������ ����");
		//				break;
		//			}
		//		}


//	�������� 4
		//		int input = sc.nextInt();
		//		int i = 0;
		//		int cnt = 0;
		//		while (i <= input) {
		//			if (i%2 == 1) {
		//				cnt ++;
		//				i ++;
		//			}
		//			else {
		//				i ++;
		//			}
		//		}
		//		System.out.println(cnt);


//	do-while�� // 1,2,3 -> -1,0,4 => ���Է�
		// while�� -> ������ ��ó�� -> �ּҼ���Ƚ�� 0��
		// do-while�� -> ��ó�� ������ -> �ּҼ���Ƚ�� 1��
		//		int x;
		//		do {
		//			x = sc.nextInt();
		//		} while(x<1 || x>3); // ���ǿ� �ش��ϸ� �ٽ� do�� �ö�. ��� do�� �÷������� ��.
		//		// ���ǿ� �ش����� ������ ���� ������. �Ʒ���!
		//		if (x == 1) {
		//			System.out.println("����");
		//		}
		//		else if (x==2) {
		//			System.out.println("����");
		//		}
		//		else {
		//			System.out.println("��");
		//		}

		////////////////////////////////////////////////////////////////

		// 5 �Է��ϸ� ���Ǳ� ���α׷� ��ü�� ����ȴ�. while break
		// 1~5 �߿� �Է��� ���ߴٸ� -> ���Է� do while

		// ��� ������ ��ϱ��� ����. ��ϱ��� ������ �����ϸ� ��ü�� ���밡��������,
		// ��ϱ��� ������ �����ϸ� ��� ������ �״´�.

//		String m1="������";
//		String m2="�̴ָ��̵�";
//		String m3="TOP";
//		String m4="����";
//		String m5="����";
//		int p1=900;
//		int p2=1200;
//		int p3=1000;
//		int p4=800;
//		int b;
//		// �ʱ�ȭ ���� �淯��.
//		int money = 0;
//		while (true) {
//			System.out.println("1.������ 2.�̴ָ��̵� 3.TOP 4.���� 5.����");
//			do {
//				b=sc.nextInt();
//			}while (b<1 || 5<b);
//			String menu=m1;
//			int price=p1;
//			switch(b) {
//			case 2:
//				menu=m2;
//				price=p2;
//				break;
//			case 3:
//				menu=m3;
//				price=p3;
//				break;
//			case 4:
//				menu=m4;
//				price=p4;
//				break;
//			}
//
//			if (b == 5) {
//				break;
//			}
//
//			System.out.print("������ �־��ּ���! : ");
//			// 0 ������ �Է� -> ���Է�
//			
//			int new_money;
//			do {
//				new_money = sc.nextInt();
//			} while (new_money <= 0);
//			money += new_money;
//
//			if(money>=price) {
//				System.out.println(menu+"�� ���ɴϴ�!");
//				money-=price;
//			}
//			else {
//				System.out.println("���� �����մϴ�!");
//			}
//			// �ٷι�ȯ x. ���α׷� ���� �� ��ȯ
//		} System.out.println(money + "�� ��ȯ�մϴ�");
//
//// while(true) -> �ߴܽ��� ���� _ break / do-while


// for ��
//		// while recap
//		int i = 0;
//		while (i<3) {
//			System.out.println("�ȳ��ϼ���");
//			i++;
//		}
//		
//	//  for (�ʱ��    ; ���ǽ�   ; ������)
//		for (int a=0; a < 3 ; a++) {
//			System.out.println("�ȳ��ϼ���");
//	// ��Ŀ���� : �ʱ�� -> ���ǽ� -> for�� ���� -> ������ -> �ʱ�� -> ���ǽ� -> for�� ���� -> ������ -> ...
//		}
		
// �������� 1���� 10���� ��� ��� + �� ���� ����ϱ�
//		int sum = 0;
//		//int n; // int�� for �� ���� ���� ��� ������ �����´�.
//		for ( int n = 1; n <= 10 ; n++ ) { 
//		System.out.println(n);
//		sum += n;
//		}
//		System.out.println(sum);
		
//�������� - ���� 2�� �Է�. ���� ������ ū �� ������� ������ּ���
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a>b) {
//			// [��ȯ] �˰���
//			int tmp = a;
//			a = b;
//			b = tmp;
//		}
//		for ( int i = a; i <= b; i++) {
//			System.out.println(i);

			// continue ���� for������  ���������� �̵��Ѵ�. while������ �׳� ó������ ����. ��� ���� ��Ŀ�����̱� �ϴ�.
			// break �� ���������� �׳� ����������.
//		}

// ��������. ������ 10�� �Է�. ���� ����ϱ�. ���� ��0������ ������ �Էµȴٸ� ��� ����
		
		// while : ������, ������, ������ �����ϴ� ����. �̷����� �ݺ����� ���δ�.
		// for 
		
//		int a;
//		int i;
//		int sum = 0;
//		for( i = 0; i < 10; i++) {
//			a = sc.nextInt();
//			if (a<0) {
//				break;
//			}
//			sum += a;
//		}	System.out.println(sum);
//		
		
// ��������. - ��� ���ϱ� - ���� 1�� �Է� ex. 8 = 1248
		int a;
		int i = 1;
		a = sc.nextInt();
		while(i<=a) {
			if (a%i == 0) {
			System.out.println(i);
			}
		i++; // for �ε� �غ���
		}
		
		// ����| ��� �Ҽ� ������ �Ǻ���ġ
	}

}
