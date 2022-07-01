import java.util.Scanner;
import java.util.Stack;

public class Java0819_StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 0 ; i < num ; i ++) {
			int n = sc.nextInt();
			if (n==0) {
				if (s.isEmpty()) {
					System.out.println("�����.");
				}
				else {
					s.pop();
				}
			}
			else {
				s.push(n);
			}
		}
		
		// ! == NOT == ����
		int sum = 0;
		while(!s.isEmpty()) {
			sum += s.pop();
		}
		System.out.println("��: " + sum);
	}

}
