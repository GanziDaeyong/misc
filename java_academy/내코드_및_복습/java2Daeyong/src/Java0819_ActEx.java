import java.util.Scanner;
import java.util.Stack;

public class Java0819_ActEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Stack<String> s = new Stack();
		while(true) {
			String act = sc.nextLine();
			if (act.equals("����")) {
				System.out.println("���α׷� ����...");
				break;
			}
			else if (act.equals("�������")) {
				if (s.isEmpty()) {
					System.out.println("����� �ൿ�� �����ϴ�");
				}
				else {
					System.out.println("["+s.pop()+"] ���");
					
				}
			}
			else {
				s.push(act);
			}
		}
	}

}
