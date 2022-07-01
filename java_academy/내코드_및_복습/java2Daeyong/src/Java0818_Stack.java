import java.util.Scanner;
import java.util.Stack;

public class Java0818_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
스택 vs 큐

1. 스택 Stack
스택은 입구가 하나여서 first-in last-out FILO 선입후철
실행취소가 매우 편하다 -> 최근 방문한 웹페이지 마냥.
배열 기반이라 제한적이다

2. 큐 Queue -> 이게 현실적인 코딩이긴 하지. 그래서 대부분 쓰여. 근데 특정 상황에서 스택이 매우 유리할때가 있다. 그때만 스택을 쓴다.
FIFO 선입선출
예약제, 대기열

######################요즘 트렌드 -> 스택과 큐를 언제 어디서 써야하는지 구분한다!!############################

		 */

		Stack<Integer> s = new Stack();
		Scanner sc = new Scanner (System.in);
		while(true) {
		System.out.println("삽입 출력 삭제 종료");
		int act = sc.nextInt();

		if (act == 1) {
			System.out.println("입력할데이터: ");
			int num = sc.nextInt();
			s.push(num);
			// 스택에서는 데이터삽입시 push() 이용한다.
		}
		else if (act == 2) {
			if (s.isEmpty()) { // isEmpty는 peek과 pop과 함께 쓰인다.
			System.out.println(s.peek());
			// 삭제없이 출력
			}
		}
		else if (act == 3) {
			System.out.println(s.pop());
			// 삭제하며 출력
		}
		else {
			break;
		}


		}
	}

}
