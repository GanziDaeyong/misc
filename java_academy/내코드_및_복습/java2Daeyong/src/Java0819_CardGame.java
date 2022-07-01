import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class newCard {
	char num; // �ν��Ͻ� ���� == ��ü ����
	char col;
	static char[] numm = {'A', '1', '2', 'J', 'Q', 'K'}; //Ŭ���� ����
	static char[] coll = {'��', '��', '��', '��'}; //Ŭ���� ����
	newCard(int n, int m) {
		this.num = numm[n]; // numm�� coll�� Ŭ���� ���� (�迭)
		this.col = coll[m];
		System.out.println("[" + this.col + this.num + "] �����Ϸ�");
	}
	//hashCode() -> ��ġ�Ѵٸ� equals()
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
			System.out.println("1.���� 2.��� 3.���� : ");
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
