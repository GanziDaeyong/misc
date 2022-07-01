import java.util.Scanner;
import java.util.Stack;

public class Java0818_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
���� vs ť

1. ���� Stack
������ �Ա��� �ϳ����� first-in last-out FILO ������ö
������Ұ� �ſ� ���ϴ� -> �ֱ� �湮�� �������� ����.
�迭 ����̶� �������̴�

2. ť Queue -> �̰� �������� �ڵ��̱� ����. �׷��� ��κ� ����. �ٵ� Ư�� ��Ȳ���� ������ �ſ� �����Ҷ��� �ִ�. �׶��� ������ ����.
FIFO ���Լ���
������, ��⿭

######################���� Ʈ���� -> ���ð� ť�� ���� ��� ����ϴ��� �����Ѵ�!!############################

		 */

		Stack<Integer> s = new Stack();
		Scanner sc = new Scanner (System.in);
		while(true) {
		System.out.println("���� ��� ���� ����");
		int act = sc.nextInt();

		if (act == 1) {
			System.out.println("�Է��ҵ�����: ");
			int num = sc.nextInt();
			s.push(num);
			// ���ÿ����� �����ͻ��Խ� push() �̿��Ѵ�.
		}
		else if (act == 2) {
			if (s.isEmpty()) { // isEmpty�� peek�� pop�� �Բ� ���δ�.
			System.out.println(s.peek());
			// �������� ���
			}
		}
		else if (act == 3) {
			System.out.println(s.pop());
			// �����ϸ� ���
		}
		else {
			break;
		}


		}
	}

}
