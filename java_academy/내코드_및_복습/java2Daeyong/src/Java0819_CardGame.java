import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class newCard {
	char num; // 인스턴스 변수 == 객체 변수
	char col;
	static char[] numm = {'A', '1', '2', 'J', 'Q', 'K'}; //클래스 변수
	static char[] coll = {'♤', '♧', '◇', '♡'}; //클래스 변수
	newCard(int n, int m) {
		this.num = numm[n]; // numm과 coll은 클래스 변수 (배열)
		this.col = coll[m];
		System.out.println("[" + this.col + this.num + "] 생성완료");
	}
	//hashCode() -> 일치한다면 equals()
	public int hashCode() {
		return 1;
	}
	public boolean equals(Object o) {
		newCard c = (newCard) o; // ??
		if (c.num == this.num && c.col == this.col) {
			return true;
		}
		return false;
	}  
	public String toString() {
		return "[" + this.col + this.num + "]";
	}	
}

public class Java0819_CardGame {

	public static void main(String[] args) {
		HashSet<newCard> s = new HashSet();
		Random r = new Random();
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("1.생성 2.출력 3.종료 : ");
			int act = sc.nextInt();
			if (act == 1) {
				int n = r.nextInt(6);
				int m = r.nextInt(4);
				s.add(new newCard(n,m));
			}
			else if (act == 2) {
				System.out.println(s.size());
				System.out.println(s);
			}
			else {
				break;
			}
		}

	}

}
