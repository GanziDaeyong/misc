import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Std {
	String name;
	static int cnt = 0; // 모든 객체들이 공유한다. 그러나 이를 바로 번호로 써버리면 학생들 번호가 다 같아지겠지.
	int num;
	int score1;
	int score2;
	double avg;

	Std(String name, int score1, int score2) {
		this.name = name;
		this.num = ++cnt;
		this.score1 = score1;
		this.score2 = score2;
		this.avg = (score1+score2) / 2.0 ;

	}
	public String toString() {
		return this.num +": "+this.name + "," + this.avg;
	}
}


public class Java0818_LinkedList_Ex {

	public static void main(String[] args) {
		// 1. 추가. 2. 삭제(remove()) 3. 종료
		// 2. 학생번호로 삭제 진행
		// 3. 학생 출력 후, 프로그램 종료 : itr 써라.	

		Scanner sc = new Scanner(System.in);
		LinkedList<Std> stdL = new LinkedList();


		while (true){

			System.out.println("1.추가 2.삭제 3.종료");

			int act = sc.nextInt();

			if (act == 1) {

				sc.nextLine();
				System.out.println("이름");
				String name = sc.nextLine();
				System.out.println("중간");
				int sc1 = sc.nextInt();
				System.out.println("기말");
				int sc2 = sc.nextInt();
				stdL.add(new Std(name, sc1, sc2));
				System.out.println(stdL);
			}

			else if (act == 2) {
				int 비교 = sc.nextInt();
				for (int i = 0; i < stdL.size(); i++ )	{
					if (비교 == stdL.get(i).num) { //이거 왜 num이 인식이 안되었나!!!-> 제너릭을 안써줬기 때문이다. 
						System.out.println(stdL.get(i)+ " 삭제");
						stdL.remove(i);
						break;
					}
					else {
						System.out.println("이름오류");
					}
				}
			}
			else {
				Iterator itr = stdL.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("종료");
				break;
			}
		}

	}

}
