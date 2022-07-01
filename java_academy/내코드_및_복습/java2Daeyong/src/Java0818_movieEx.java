/* 
 * 영화관 배열 리스트를 3개 가지고 있다. 
 * 그 안에 movie라는 클래스 객체를 넣을 것이다. 
 * 
 */


import java.util.ArrayList;
import java.util.Scanner;

class movie{
	String name;
	int hour;
	int i = 0;
	movie(String name, int hour) {
		this.name = name;
		this.hour = hour;
		System.out.println("["+this.name+"] 예매완료");

	}
	public String toString () {
		return this.name + ":" + this.hour;
	}

}



public class Java0818_movieEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<movie> CGV = new ArrayList();
		ArrayList<movie> Megabox = new ArrayList();
		ArrayList<movie> Lotte= new ArrayList();	

		int 예매번호 = 0;

		while(true) {

			System.out.println("1.예약 2.발권 3.종료");
			int act = sc.nextInt();

			if (act == 1) {

				System.out.println("영화관 - 1.CGV 2.Megabox 3.Lotte");
				int input = sc.nextInt();
				sc.nextLine();
				System.out.println("제목");
				String title = sc.nextLine();
				System.out.println("시간");
				int hour = sc.nextInt();
				if (input == 1) {
					CGV.add(new movie(title,hour));
					예매번호 = CGV.size() + 1000;
				}
				else if (input == 2) {
					Megabox.add(new movie(title,hour));
					예매번호 = Megabox.size() + 2000;
				}
				else {
					Lotte.add(new movie(title,hour));
					예매번호 = Lotte.size() + 3000;

				}
				System.out.println("예매번호:" + 예매번호);

			}
			else if (act == 2){
				System.out.println("예매번호 입력");
				int num = sc.nextInt();
				if (num == 예매번호) {           ////// 예매번호를 비교한다기보다, 예매번호를 치면 영화가 나오는 식인듯? recheck.
					System.out.println("맞음");
				}
				else {
				System.out.println("틀림");

				}
			}
			else { // 영화관마다의 누적관람객수 출력
				System.out.println(CGV.size());
				System.out.println(Megabox.size());
				System.out.println(Lotte.size());

			}
		}

	}

}
