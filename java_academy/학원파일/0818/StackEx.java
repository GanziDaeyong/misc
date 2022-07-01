import java.util.Scanner;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		// 스택  VS  큐
		// 스택: Stack  FILO 선입후출
		//  -> 실행취소, 최근방문한웹페이지
		//  -> 배열기반이라 제한적임
		// 큐: Queue  FIFO 선입선출
		//  -> 예약제, 대기열
		
		// 상황에 맞는 자료구조를 사용하자!

		Stack<Integer> s=new Stack();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.삽입 2.출력 3.삭제 4.종료");
			int act=sc.nextInt();
			if(act==1) {
				System.out.print("입력할 데이터: ");
				int num=sc.nextInt();
				s.push(num);
				// 스택에서는 데이터삽입시 push()함수 이용
			}
			else if(act==2) {
				if(s.isEmpty()) {
					System.out.println("데이터가 없습니다!");
				}
				else {
					System.out.println(s.peek());
				}
				// 삭제없이 출력
			}
			else if(act==3) {
				if(s.isEmpty()) {
					System.out.println("데이터가 없습니다!");
				}
				else {
					System.out.println(s.pop());
				}
				// 삭제동반 출력
			}
			else {
				break;
			}
		}

	}

}




