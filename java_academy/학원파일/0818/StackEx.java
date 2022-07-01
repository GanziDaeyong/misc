import java.util.Scanner;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		// ����  VS  ť
		// ����: Stack  FILO ��������
		//  -> �������, �ֱٹ湮����������
		//  -> �迭����̶� ��������
		// ť: Queue  FIFO ���Լ���
		//  -> ������, ��⿭
		
		// ��Ȳ�� �´� �ڷᱸ���� �������!

		Stack<Integer> s=new Stack();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.���� 2.��� 3.���� 4.����");
			int act=sc.nextInt();
			if(act==1) {
				System.out.print("�Է��� ������: ");
				int num=sc.nextInt();
				s.push(num);
				// ���ÿ����� �����ͻ��Խ� push()�Լ� �̿�
			}
			else if(act==2) {
				if(s.isEmpty()) {
					System.out.println("�����Ͱ� �����ϴ�!");
				}
				else {
					System.out.println(s.peek());
				}
				// �������� ���
			}
			else if(act==3) {
				if(s.isEmpty()) {
					System.out.println("�����Ͱ� �����ϴ�!");
				}
				else {
					System.out.println(s.pop());
				}
				// �������� ���
			}
			else {
				break;
			}
		}

	}

}




