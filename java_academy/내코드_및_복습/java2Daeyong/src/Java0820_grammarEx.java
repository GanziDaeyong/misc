import java.util.Scanner;

public class Java0820_grammarEx {

	public static void main(String[] args) {
		// [����ó��]
		// ���� == ���������δ� ������ ������, �����߿� ������ �߻��ϴ� �ڵ�.
		// ex1
		
		try {	// ���ܰ� �߻��ص�, ���α׷��� �����Ű�� ���� ��
		int a = 10, b = 0;
		System.out.println("��!");
		System.out.println(a/b);
		// ���ܰ� �߻��Ѵٸ� �ٷ� [catch]�� �̵��Ѵ�.
		System.out.println("ȣ");
		}
		// ex2
		catch(Exception e) {
			System.out.println("���ܹ߻�!");
		}
		int[] arr = {1,0};
		try {
			System.out.println(arr[0]/arr[1]);
			System.out.println(arr[2]); // �ϳ��� ĳġ���� �ϳ��� ������ ���� �� �ִ�. ĳġ�� ������ �� �� �ִ�.
		}
		catch(ArithmeticException e) { // ���������� e�� ����. �׳� e ��.
			System.out.println("������ 1�� �ٽ� �����ϼ���");
			System.out.println("���ܹ߻�1");
			System.out.println(e.getMessage());// ���� ������ �˷��ش�.
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�2");
		} // ���ͳݿ� �ڹ� ����Ŭ���� ġ�� �Ҷ�� ���´�. �η繶���ϰ� ����, ��ü������ ������ ������ ����.
		catch(Exception e) {
			System.out.println("�׿� ���ܹ߻�"); // ������ �̷��� �ֻ���Ŭ������ �ϳ� �д�.##����## �긦 ���� �������� �ξ�� �Ѵ�. ���������� �������ŵ�.
			System.out.println(e.getMessage());
		}
		finally { // ���ܰ� �߻��ص�, �߻����� �ʾƵ� ������ ����Ǵ� �����̴�.
			System.out.println("������ ����Ǵ� ����.");
		}
		
//################################but, �����δ� ������ ��� ���� �ϴ� ���� �ƴ϶�, ���ܰ� �ƴ� ���� ����ó�� ó���ϰ� ���� �� ����Ѵ�.#####################################
		Scanner sc = new Scanner (System.in);
		/*
		Exception ageEx = new Exception("���̴� 1�̻��̾�� �մϴ�.");
		try {
			System.out.println("�����Է�");
			int age = sc.nextInt();
			if (age < 1) {
				throw ageEx;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		
		}
		// �ǹ������� if ���� ������ ���� ���´�. �α׸� ����ϱ� ������..?
		
		*/
		
		// �г��Է�
		
		Exception yearError = new Exception("�г��� 1~6����"); // ���� �Է��ϴ°� get message�� ���̴�.
		while (true) {
		try {
			System.out.println("�г��Է�");
			int year = sc.nextInt();
			if (year < 1 || year > 6) {
				throw yearError;
			}
			break; // ������ �ɸ��� �ٷ� catch�� ���ϱ�.

		}
		catch (Exception e) { // �߻��ϴ� ������ e��� ������ �ΰ�, �� e�� ���� getmessage.
			System.out.println(e.getMessage());
		}
		}
		//#########��: ���� �߿�ġ ����, �޴� ������ ��쿡��, if������ ��°ͺ��ٴ� try catch�� ����. �װ� ��ǻ�Ͱ� ������ ����ϱ� �����̴�.
		
	}

}
