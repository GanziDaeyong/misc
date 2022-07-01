import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Std {
	String name;
	static int cnt = 0; // ��� ��ü���� �����Ѵ�. �׷��� �̸� �ٷ� ��ȣ�� ������� �л��� ��ȣ�� �� ����������.
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
		// 1. �߰�. 2. ����(remove()) 3. ����
		// 2. �л���ȣ�� ���� ����
		// 3. �л� ��� ��, ���α׷� ���� : itr ���.	

		Scanner sc = new Scanner(System.in);
		LinkedList<Std> stdL = new LinkedList();


		while (true){

			System.out.println("1.�߰� 2.���� 3.����");

			int act = sc.nextInt();

			if (act == 1) {

				sc.nextLine();
				System.out.println("�̸�");
				String name = sc.nextLine();
				System.out.println("�߰�");
				int sc1 = sc.nextInt();
				System.out.println("�⸻");
				int sc2 = sc.nextInt();
				stdL.add(new Std(name, sc1, sc2));
				System.out.println(stdL);
			}

			else if (act == 2) {
				int �� = sc.nextInt();
				for (int i = 0; i < stdL.size(); i++ )	{
					if (�� == stdL.get(i).num) { //�̰� �� num�� �ν��� �ȵǾ���!!!-> ���ʸ��� �Ƚ���� �����̴�. 
						System.out.println(stdL.get(i)+ " ����");
						stdL.remove(i);
						break;
					}
					else {
						System.out.println("�̸�����");
					}
				}
			}
			else {
				Iterator itr = stdL.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("����");
				break;
			}
		}

	}

}
