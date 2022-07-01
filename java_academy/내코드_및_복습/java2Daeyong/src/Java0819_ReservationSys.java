import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


class newPerson3 {
	String name;
	int num;
	newPerson3(String name) {
		this.name = name;
		Random r = new Random();
		this.num = r.nextInt(100) + 1 ;
		System.out.println(this.name + "님의 예약번호: " + this.num);

	}
	public String toString() {
		return this.name + "님";
	}
}

public class Java0819_ReservationSys {

	public static void main(String[] args) {
		Queue<newPerson3> q = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n======예약프로그램======");
			System.out.println("\n1.예약 2.처리 3.종료");
			System.out.println("번호입력: ");
			int act = sc.nextInt();
			
			if (act == 1) {
				sc.nextLine();
				System.out.println("이름입력: ");
				String name = sc.nextLine();
				q.offer(new newPerson3(name));
				
			}
			else if (act == 2) {				
				System.out.println("몇명 처리?");
				int num = sc.nextInt();
				for (int i = 0 ; i < num ; i ++) {
					newPerson3 p = q.poll(); // poll = pop // 원래 newPerson3 p = new newperson~ 이런식으로 나가는데,
					//여기서는 p를 q.poll로 선언해준 것이다. -> 부르고, 틀리면 그걸 다시 밑에서 offer.
							// 이거 질문. 이게 무슨 문법이지?
					System.out.println(p.name + "님의 예약번호는?");
					int check = sc.nextInt();
					if (p.num == check) {
						System.out.println("예약확인되었습니다.");
					}
					else {
						System.out.println("예약번호 오류.");
						q.offer(p); ///?
					}
				}
			}
			else {
				System.out.println(q);
				System.out.println("\n프로그램 종료");
				break;
			}
		}

	}

}
