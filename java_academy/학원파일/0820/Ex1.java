import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		// [����ó��]
		// ����==���������δ� ������ ������, �����߿� ������ �߻��ϴ� �ڵ�

		try { // ���ܰ� �߻��ص�, ���α׷��� �����Ű�������!
			int a=10,b=0;
			System.out.println("��");
			//System.out.println(a/b);
			// ���ܰ� �߻��Ѵٸ� [�ٷ�] catch������ �̵�
			System.out.println("ȣ");
		}
		catch(Exception e) {
			System.out.println("���ܹ߻�!");
		}

		int[] arr= {1,0};
		try {
			System.out.println(arr[0]/arr[1]);
			System.out.println(arr[2]);
		}
		catch(ArithmeticException e) {
			System.out.println("���ܹ߻�1");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�2");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("�׿��� ���ܹ߻�");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("����������Ǵ±���");
		}

		// �����δ� ���ܰ� �ƴѰ��� ����ó�� ó���ϰ������
		Scanner sc=new Scanner(System.in);
		Exception ageEx =new Exception("���̴� 1�̻� �Է�");
		try {
			System.out.print("�����Է�: ");
			int age=sc.nextInt();
			if(age<1) {
				// ���ܹ߻����Ѿ���
				throw ageEx;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 */
		// �г��Է�: 1~6 => �ٽ� �Է�
		// "�г��� 1~6���� �����մϴ�."
		Scanner sc=new Scanner(System.in);
		Exception gradeEx =new Exception("�г��� 1~6���� �����մϴ�.");
		while(true) {
			try {
				System.out.print("�г��Է�: ");
				int grade=sc.nextInt();
				if(1>grade || grade>6) {
					throw gradeEx;
				}
				break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
