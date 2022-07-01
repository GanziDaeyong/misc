import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
// class Person: 이름/예약번호->생성자에서 랜덤지급
/*
1.예약 2.입장 3.종료
1_예약자 성함? => 예약번호(랜덤지급,1~100)
2_처리할 사람수? [ 김 이 박 황 정 ] 2
 김 예약번호? O -> 입장하세요.
 이 예약번호? X -> 예약번호가 불일치합니다.
  [ 박 황 정 이 ]
*/
class Person{
	String name;
	int num;
	Person(String name){
		this.name=name;
		Random r=new Random();
		this.num=r.nextInt(100)+1;
		System.out.println(this.name+"님의 예약번호는 ["+this.num+"]입니다.");
	}
	public String toString() {
		return this.name+"님";
	}
}
public class RestaurantEx {

	public static void main(String[] args) {
		
		Queue<Person> q=new LinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n===예약 프로그램===");
			System.out.println("1.예약 2.처리 3.종료");
			System.out.print("번호입력: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("이름입력: ");
				String name=sc.nextLine();
				q.offer(new Person(name));
			}
			else if(act==2) {
				System.out.print("몇명처리? ");
				int num=sc.nextInt();
				for(int i=0;i<num;i++) {
					Person p=q.poll();
					System.out.print(p.name+"님의 예약번호는? ");
					int check=sc.nextInt();
					if(p.num==check) {
						System.out.println("예약확인되셨습니다.");
					}
					else {
						System.out.println("예약번호불일치!");
						q.offer(p);
					}
				}
			}
			else {
				System.out.println(q);
				System.out.println("\n프로그램종료");
				break;
			}
		}
		
	}

}




