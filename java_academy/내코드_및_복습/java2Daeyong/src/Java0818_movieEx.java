/* 
 * ��ȭ�� �迭 ����Ʈ�� 3�� ������ �ִ�. 
 * �� �ȿ� movie��� Ŭ���� ��ü�� ���� ���̴�. 
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
		System.out.println("["+this.name+"] ���ſϷ�");

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

		int ���Ź�ȣ = 0;

		while(true) {

			System.out.println("1.���� 2.�߱� 3.����");
			int act = sc.nextInt();

			if (act == 1) {

				System.out.println("��ȭ�� - 1.CGV 2.Megabox 3.Lotte");
				int input = sc.nextInt();
				sc.nextLine();
				System.out.println("����");
				String title = sc.nextLine();
				System.out.println("�ð�");
				int hour = sc.nextInt();
				if (input == 1) {
					CGV.add(new movie(title,hour));
					���Ź�ȣ = CGV.size() + 1000;
				}
				else if (input == 2) {
					Megabox.add(new movie(title,hour));
					���Ź�ȣ = Megabox.size() + 2000;
				}
				else {
					Lotte.add(new movie(title,hour));
					���Ź�ȣ = Lotte.size() + 3000;

				}
				System.out.println("���Ź�ȣ:" + ���Ź�ȣ);

			}
			else if (act == 2){
				System.out.println("���Ź�ȣ �Է�");
				int num = sc.nextInt();
				if (num == ���Ź�ȣ) {           ////// ���Ź�ȣ�� ���Ѵٱ⺸��, ���Ź�ȣ�� ġ�� ��ȭ�� ������ ���ε�? recheck.
					System.out.println("����");
				}
				else {
				System.out.println("Ʋ��");

				}
			}
			else { // ��ȭ�������� ������������ ���
				System.out.println(CGV.size());
				System.out.println(Megabox.size());
				System.out.println(Lotte.size());

			}
		}

	}

}
