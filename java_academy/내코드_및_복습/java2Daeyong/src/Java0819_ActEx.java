import java.util.Scanner;
import java.util.Stack;

public class Java0819_ActEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Stack<String> s = new Stack();
		while(true) {
			String act = sc.nextLine();
			if (act.equals("종료")) {
				System.out.println("프로그램 종료...");
				break;
			}
			else if (act.equals("실행취소")) {
				if (s.isEmpty()) {
					System.out.println("취소할 행동이 없습니다");
				}
				else {
					System.out.println("["+s.pop()+"] 취소");
					
				}
			}
			else {
				s.push(act);
			}
		}
	}

}
