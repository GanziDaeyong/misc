import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class Card{
	char num; // �ν��Ͻ�����==��ü����
	char color;
	static char[] numm= {'A','1','2','J','Q','K'}; // Ŭ��������
	static char[] colorr= {'��','��','��','��'};
	Card(int n,int m){
		this.num=numm[n];
		this.color=colorr[m];
		System.out.println("["+this.color+this.num+"] �����Ϸ�");
	}
	// hashCode() -> ��ġ�Ѵٸ� -> equals()
	public int hashCode() {
		return 1;
	}
	public boolean equals(Object o) { //
		Card c=(Card)o;
		if(c.num==this.num && c.color==this.color) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "["+this.color+this.num+"]";
	}
}
public class CardgameEx {

	public static void main(String[] args) {
		
		HashSet<Card> s=new HashSet();
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("1-���� 2-��� 3-���� :  ");
			int act=sc.nextInt();
			if(act==1) {
				int n=r.nextInt(6);
				int m=r.nextInt(4);
				s.add(new Card(n,m));
			}
			else if(act==2) {
				System.out.println(s.size());
				System.out.println(s);
			}
			else {
				break;
			}
		}

	}

}




