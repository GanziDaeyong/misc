import java.util.Arrays;
import java.util.Scanner;
public class Java0803_2 {

// �Լ� == �޼���
//		 �Լ��� �����ϴ� �ڸ�.
//		 ����� ���� �Լ�.
//		 static ������ڷ��� �Լ��� (�Է°��ڷ�� ������)
	
	
//	static void function (int num) {
//		System.out.println(num);
//	}
//		// void : �ƹ��͵� ����.�츮�� main�� ���� �� ������� �����°� �ƴ��ݾ�.
//		// static : ��ü�� �����Ѵ�.  
//		
	
//	static double fnc(double x, double y) {
//		double rst = x/y; 
//		return rst;
//	}
	
	
//	static void ��������4(int a, int b) {
//		if (a < b) {
//			System.out.println(b);
//		}
//		else if (a < b) {
//			System.out.println(a);	
//		}
//		else {
//			System.out.println("�� ������ �����ϴ�.");
//		}
//		
//	}
	
	
//	static void ��������5_v1(int a) {
//		int cnt = 0;
//		for (int i=1 ; i<=a ; i++) {
//			if (a%i == 0) {
//				cnt ++;
//			}
//		}
//		if (cnt == 2) {
//			System.out.println("�Ҽ�");
//		}
//		else {
//			System.out.println("�Ҽ� �ƴ�");
//		}
//		
//	}
//	
//	static int ��������5_v2(int a) {
//		int cnt = 0;
//		for (int i=1 ; i<=a ; i++) {
//			if (a%i == 0) {
//				cnt ++;
//			}
//
//		}
//		return cnt;
//	}
	
//	static void ��������6(int a) {
//		
//		for (int b = 1; b <= a ; b++) {
//			int cnt = 0; // cnt �ʱ�ȭ ����!!!
//			for (int c = 1; c <= b ; c++) {
//				if (b%c == 0) {
//					cnt ++;
//				}
//			}
//			if (cnt == 2) {
//				System.out.println(b);
//			}
//		}
//	}

	static void ��������6_v2(int a) {
		int cnt = 0;
		int i;
		for (i = 1 ; i <= a ; i ++) {
			if (a%i == 0) {
				cnt ++;
			}
		}
		if (cnt == 2) {
			System.out.println(a + " ");
		}
	}

//	static void fnc (int[] data) {
//		for (int v: data) {
//			System.out.println(v);
//		}
//	}
	
//	static void ��������7 (int[] arr) {
//		int max = arr[0];
//		int max_index = 0;
//		for (int i=1 ; i<5 ; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//				max_index = i;
//			}
//		
//		}
//		System.out.println(max);
//		System.out.println(max_index);	
//	} // return �� �ϳ����ۿ� �ȵȴ�.
	

// �ڹٸ��� ����!!!!!!!
//	static void add(int a, int b) {
//		System.out.println(a+b);
//		System.out.println("���� addȣ��");
//	}
//	static void add(double a, double b) {
//		System.out.println(a+b);	
//		System.out.println("�Ǽ� addȣ��");
//	}
	// �̷��� �򰥸��ݾ�.
	public static void main(String[] args) { 
// main(String[] args) �� ����.		
//		run -> run configurations ���� arguments��
//		variable �Է��ϸ� �׸� args��� ���ڿ� �迭���� �ν��ؼ� ���� Ȱ���� ���� �ִ�.
//		�̴� ���� �ܺ� ���� ����� ��. ��ҿ��� ���� �ʴ� ����̴�.
		Scanner sc = new Scanner (System.in);
		
//		int input = sc.nextInt();
//		function(input);
//		
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double div = a/b ;
//		System.out.println(div);
//		System.out.println(fnc(a,b));

// �Լ��� �־��µ�?
//		 1. �ڵ��� ���뼺�� �����ϱ� �����̴�. �׳� ���� ���� �Ǵ� ���ϴ�.
//		 2. ������ �ı�ȿ���� ���� �� �ִ�. �Լ��� ��ġ�� �Ǵϱ�.
//		 3. �̴� ��� �������� �̾�����.
//		 4. ���� �ڵ尡 ����ȭ�ȴ�. -> ���ؿ� �Ѱܹ޾� �۾� ����.
		
// ��������4 - �� ���� �Է� ���߿� �� ū�� ����ϴ� �Լ� �ۼ��ϱ�.
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		��������4(input1, input2);
//		// �Լ� ������ �������, �����ؼ� �Ŀ� ��������� ����. ���ڰ� �� ���� �����̱� ����.
		
// ��������5
//		int input = sc.nextInt();
//		��������5_v1(input);
//		//�Ʒ�ó�� ��� ������ �����ؼ� ���� ������൵ ��. �Լ��� ������ Ŀ�������� ����.
//		int ������� = ��������5_v2(input);
//		if (������� == 2) {
//			System.out.println("�Ҽ�");
//		}
//		else {
//			System.out.println("�Ҽ� �ƴ�");
//		}
		
// ��������6 - 1���� num���� �Ҽ��� ��� ������ּ���. �Լ��� ������ �ݺ��ؼ� �� �Ŵ�.
		int input = sc.nextInt();
		// [�Ҽ����� �ƴ��� �Ǻ��ϴ� �Լ�]
		
		//��������6(input);
		for(int i = 1; i <= input ; i ++) {
			��������6_v2(i); // input �� ����ȴ�. for �� ���̴ϱ�.
		}
///////////////////////�̰� �����///////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////////////////
//		int [] arr = new int [3];
//		for (int i = 0 ; i < 3 ; i ++) {
//			arr[i] = sc.nextInt();
//		}
//		fnc(arr);
		
		
// �������� 7 - 5���� ��� �迭 main()���� ����. �ش� �迭�� �Լ��� ������ �ִ밪�� �� ��ġ�� ����ϴ� �Լ�.
		
//		int[] arr = new int [5];
//		for (int i = 0 ; i < 5 ; i ++) {
//			arr[i] = sc.nextInt();		
//		}
//		��������7(arr);

// �ڹٸ��� ����!! ����� �Լ��� ���� �� ����� ���� �򰥸��� ��¼��.
// �ڹٴ� �Լ��� �ߺ��� �����ϴ�!!!! �ٸ� ���� ���� �ٸ��ų� ���� �ڷ����� �޶�� �Ѵ�.
// �Լ����� �Ȱ��� �� ���� ������ �ڷ��� �ٸ��� ������ִ� �� [�����ε�]�̶� �Ѵ�. // �߿�
// �˰��� println �� �����ε� �̿��ϴ� �ſ���.
//		double a, b;
//		a = 4.7;
//		b = 6.4;
//		add(a,b);
//		int c, d;
//		c = 3;
//		d = 5;
//		add(c,d); 
		
		
	}

}
