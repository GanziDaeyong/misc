import java.util.Scanner;
import java.util.Arrays;

public class Java0731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		// �����ܸ����		
				int i;
				int j;
				for (i = 1; i <= 9; i++) {
					for (j = 2 ; j <= 9 ; j++ ) {
						System.out.print(j + "X" + i + "=" + i*j + "\t");
					}
					System.out.println();
				}

		// �迭 (array)
		//		int s1 = 100;
		//		int s2 = 10;
		//		int s3 = 25;
		//		
		//		char[] s = new char[3];

		// 1. ���� ���õ� �����͹���
		// 2. �ڷ����� ���� �ʿ� x

		//		int[] arr = new int[5];
		//		// �ε��� ���
		//		arr[0] = 10;
		//		arr[1] = 20;
		//		arr[2] = 30;
		//		arr[3] = 40;
		//		arr[4] = 50;
		//		for (int i = 0 ; i <= 4 ; i++ ) {
		//			System.out.println(arr[i]);
		//			
		//		}
		//		System.out.println(arr[2]);


		//// �������� - �迭 ��Ҹ� ���� �Է��ϸ� �״�� �迭 ����Ʈ.		
		//		int[] arr = new int[] {1,2,3,4,5};
		//		
		//		for (int i = 0 ; i<5 ; i++) {
		//			arr[i] = sc.nextInt();
		//		}
		//		for (int i = 0 ; i<5 ; i++) {
		//			System.out.println(arr[i]+ " ");
		//		}
		//		
		//		System.out.println();
		//		//System.out.println(arr);
		//		System.out.println(Arrays.toString(arr)); // �̷��� arr�� ���� �ѹ��� string���� �ٲ� �����ִ±���

		// for each �� ����.				

		//	String[] str = new String[3];
		//	for (int i = 0; i < 3 ; i++) {
		//		str[i] = sc.nextLine();
		//	// for each ��. �ſ� �������̰� ���� �������ϴ�.
		//	for (String s : str) { // for �� �̷������ε� �� �� �ִ�. 
		//		// �迭�� ��ҿ� �ش��ϴ� �ڷ��� : �迭��
		//		System.out.println(s);
		//	}

		//	int[] arr = new int[] {1,2,3,4,5};
		////	for (int i = 0 ; i <= 4 ; i++) {
		////		System.out.println(arr[i] + "");
		//	for (int fac: arr) {
		//		System.out.println(fac);
		//	}

		// �������� ũ�Ⱑ 5�� int �迭 ����
		//	// ��� �Է�(�ڿ�������)
		//	// ¦���� ���� ���
		//	
		//	int[] arr = new int[5];
		//		for (int i = 0 ; i < arr.length; i++) {
		//		int input = sc.nextInt();
		//		arr[i] = input;
		//		}
		//		int cnt = 0;
		//		for (int v : arr){
		//			if (v%2 == 0) {
		//				cnt ++;
		//			}
		//		}
		//		System.out.println(cnt);
		//	

		// �ִ�ã�� ��������
		//	int[] arr = new int [] {6,7,8,9,10,11,12,13,14};
		//	int max = arr[0];
		//	int min = arr[0];
		//	int minIndex = 0;
		//	for (int i = 1 ; i < arr.length ; i++) {
		//		if (max<arr[i]) {
		//			max = arr[i];
		//		}
		//		if (min>arr[i]) {
		//			min = arr[i];
		//			minIndex = i;
		//		}
		//	}	System.out.print(min);
		//		System.out.println("["+ "�ε��� ��ȣ�� " +minIndex+"]");
		//	}

		// �������� // ������ ������ �Է�
		// 0���� ū ¦���� �迭�� ����
		// 5���� ��� ä��� �Է�����
		// 10�̻��� ������ ���� ���

//		int[] arr = new int [5];
//		int i = 0;
//		while (true){ 
//			int input = sc.nextInt();
//			if (input > 0 && input % 2 == 0) {
//				arr[i] = input;
//				i++;
//				if (i == 5) { break;
//				}	
//			}
//		}
//		int cnt = 0;
//		for (int v : arr) { 
//			if (v >= 10) {
//				cnt ++;
//			}
//		} 
//		System.out.println(cnt);
		
// �������� -> �Է��� 5�� ���� -> �Ҽ��� O, �Ҽ� �ƴϸ� X
		
//		int [] arr = new int [5];
//		for (int i = 0 ; i < 5; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int s_count = 0;
//		int i_count = 0;
//		for(int a = 0 ; a < 5 ; a ++) {
//			int cnt = 0; // cnt ��ġ ����!!
//			for(int b = 1 ; b <= arr[a] ; b ++) {
//				if (arr[a]%b == 0) {
//					cnt ++ ;
//				}
//
//			}
//			if (cnt == 2) {
//				s_count++;
//				System.out.println(arr[a]+"�� �Ҽ� �Դϴ�");
//			}
//			else {
//				i_count++;
//				System.out.println(arr[a] + "�� �Ҽ��� �ƴմϴ�");
//			}
//			
//		} System.out.println("�� ������" + i_count);
	}	



}