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
		System.out.println(this.name + "���� �����ȣ: " + this.num);

	}
	public String toString() {
		return this.name + "��";
	}
}

public class Java0819_ReservationSys {

	public static void main(String[] args) {
		Queue<newPerson3> q = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n======�������α׷�======");
			System.out.println("\n1.���� 2.ó�� 3.����");
			System.out.println("��ȣ�Է�: ");
			int act = sc.nextInt();
			
			if (act == 1) {
				sc.nextLine();
				System.out.println("�̸��Է�: ");
				String name = sc.nextLine();
				q.offer(new newPerson3(name));
				
			}
			else if (act == 2) {				
				System.out.println("��� ó��?");
				int num = sc.nextInt();
				for (int i = 0 ; i < num ; i ++) {
					newPerson3 p = q.poll(); // poll = pop // ���� newPerson3 p = new newperson~ �̷������� �����µ�,
					//���⼭�� p�� q.poll�� �������� ���̴�. -> �θ���, Ʋ���� �װ� �ٽ� �ؿ��� offer.
							// �̰� ����. �̰� ���� ��������?
					System.out.println(p.name + "���� �����ȣ��?");
					int check = sc.nextInt();
					if (p.num == check) {
						System.out.println("����Ȯ�εǾ����ϴ�.");
					}
					else {
						System.out.println("�����ȣ ����.");
						q.offer(p); ///?
					}
				}
			}
			else {
				System.out.println(q);
				System.out.println("\n���α׷� ����");
				break;
			}
		}

	}

}
