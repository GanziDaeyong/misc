import java.util.Arrays;
import java.util.Scanner;
public class Java0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

//�����ð� recap. �迭 -> forEach(���� for) ���� �����.

//��������
//		int [] data = new int [3];
//		while (true) {
//			int input = sc.nextInt();
//			
//			int i = 0;
//
//			int cnt = 0; // cnt ��ġ ����!!
//			for(int a = 1 ; a <= input ; a ++) {
//				if (input%a == 0) {
//					cnt ++ ;
//				}
//
//			}
//			if (cnt == 2) {
//				data[i] = input; // �ѹ��� data[i++] = input; �� �����ϴ�.
//				i ++ ; // �̺κ� �߿�.
//				
//				if (i == 3) {
//					break;
//				}
//			}
//
//
//		}
//		System.out.println(Arrays.toString(data));
/////////////////////////////////////////������ϱ�

// �������� 2 10�� ��Ҹ� arr[]�� ����, ���� ū ���� ��ġ�� ���. + �ű⿡ �ε������� �̱�
//		
//		int[] arr = new int [10];
//		for (int i = 0 ; i < arr.length ; i++) {
//			int input = sc.nextInt();
//			arr[i] = input;
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int min = arr[0];
//		int max = arr[0];
//		int min_index = 0;
//		int max_index = 0;
//		
//		for (int i = 0 ; i < 10 ; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
//				min_index = i;
//			}
//			if (max < arr[i]) {
//				max = arr[i];
//				max_index = i;
//			}
//		}
//		System.out.println(min_index + " " + min);
//		System.out.println(max_index + " " + max);
//////////////////////////////////////////////////////////////////////////////////////
		
		
// �迭 �������� ���� -> �������� (== ��ǰ����)
		// ��Ŀ���� -> 51342 �� �־����ٰ� �����ϸ�,
		// 1ȸ�� -> 13425 �ٷ� ������ �񱳸� ���� ��ȯ�ȴ�.
		// 2ȸ�� -> 13245
		// 3ȸ�� -> 12345 -> �񱳸� ������ ������ŭ �ϰ� �ȴ�. 
		// ���� ������ �ڿ������� ū �����Ͱ� ä������ �Ǵ� �˰����̴�.
		// ������ ����
		// 1. �� -> (�����Ͱ��� -1) ��
		// 2. 1�� �׼� ��ü�� (������ ����) �� �ݺ��Ѵ�.
		// 3. ���� ū �����Ͱ� �ڿ������� ���ĵȴ�.

//		int [] arr = new int [5];
//		for (int i = 0; i<5; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int a = 0; a<5 ; a++) {
//			for (int i = 0; i<5-1 ; i++) {
//				// �߿�. ��ȯ �˰��� (tmp �̿��� �ӽ�����)
//				if (arr[i]> arr[i+1]) {
//					int tmp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = tmp;
//				}
//			}
//			
//		}
//		for (int v : arr) {
//			System.out.println(v + " ");
//
//		}
//		System.out.println();

		
// ��������3 - �������� (to blog)
		System.out.println("�迭 ��� ���� �Է��ϼ���");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("�迭 ��Ҹ�" + n + "�� �Է��ϼ���");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-1;j++) {
				if (arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			System.out.println("��ȯ "+ (i+1) + "ȸ��");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("������������ �����Ǿ����ϴ�.");
		System.out.println(Arrays.toString(arr));
		System.out.println("���� ū ���� " + arr[n-1] + "�Դϴ�");
		System.out.println("���� ���� ���� " + arr[0] + "�Դϴ�");
////////////////////////////////////////////////////////////////////////////////////
		
// �Լ� == �޼���
		// �Լ��� public class �� main ���̿� �����Ѵ�.
		// ����� ���� �Լ�. -> ���� Ŭ�������� Ȯ���� ��.
	}


}
