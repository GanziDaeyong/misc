import java.util.Scanner;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
	
		Stack<Integer> s=new Stack();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int n=sc.nextInt();
			if(n==0) {
				if(s.isEmpty()) {
					System.out.println("�ֺ� pop()�Ұ�!");
				}
				else {
					s.pop(); // ���������ϴ� ���
				}
			}
			else {
				s.push(n);
			}
		}
		///
		// !==NOT==����
		int sum=0;
		while(!s.isEmpty()) {
			sum+=s.pop();
		}
		System.out.println("���� "+sum);
		
	}

}
/*
10
2 3 4 0 2 0 0 7 1 2
 : 12
*/