import java.util.ArrayList;
import java.util.Scanner;

class P{
	String name;
	int phone;
	int day;
	int check;
	int money;
	P(String name,int phone){
		this(name,phone,0);
	}
	P(String name,int phone,int day){
		this.name=name;
		this.phone=phone;
		this.day=day;
		this.check=0;
		this.money=0;
		System.out.println(this.name+"�� ���ԿϷ�");
	}
	public String toString() {
		return this.name+"��";
	}
	void point(int m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� (1/0)");
		int ans = sc.nextInt();
		if (ans == 1) {
			this.money --;
			System.out.println("���������Ϸ�");
			return;
		}
		this.check += (m/1000);// ������� �ƴϸ� �ٷ� �̸��� �Ѿ���� ���̴�.
		if (this.check>=10) {
			this.check -= 10;
			this.money ++;
			System.out.println("���� ����");
			System.out.println("���� ����: " + this.check + "��");
		}
	}
}
public class Java0819_CafeManager {

	public static void main(String[] args) {

		ArrayList<P> cafe=new ArrayList();
		cafe.get(0).phone;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n===ȭ��===");
			System.out.println("1-���� 2-���Ͼȳ� 3-����");
			System.out.print("��ȣ�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.print("�����ݾ��Է�: ");
				int m=sc.nextInt();
				System.out.print("��ȭ��ȣ�Է�: ");
				int phone=sc.nextInt();
				int sw = 0;
				for (int i = 0 ; i < cafe.size() ; i++) {
					if (phone == cafe.get(i).phone) {
						System.out.println("ȸ���Դϴ�");
						sw = 1;
						break;
					}
					if (sw == 0) {
						System.out.println("������ �����մϴ�");
						System.out.println("===ȸ������===");
						System.out.println("�̸�: ");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("��ȣ ���ڸ�");
						int phoneInput = sc.nextInt();
						System.out.println("���� �Է½� ���� �� ������ �帳�ϴ�. \n�ۼ��Ͻðڽ��ϱ�?: ");
						int day = sc.nextInt();
						if (day == 1) {
							System.out.println("���� �����ڸ�");
							day = sc.nextInt();
						}
						cafe.add(new P(name,phoneInput,day));	// �Է� ���ϸ� ������ 0 �����ϱ�
						cafe.get(cafe.size() - 1).point(m); // get �Լ� ã�ƺ���	
					}					
				}


				// �ִ��� ������ ȸ�������� Ȯ���ϱ�
			}
			else if(act==2) {
				System.out.print("�� �Է�: ");
				int day=sc.nextInt();
				// ȸ������Ȯ���Ͽ�, �����ڿ�����������
				for (int i = 0; i < cafe.size(); i++) {
					if(cafe.get(i).day == day) {
						 // ���� ������
					}
				}
			}
			else {
				System.out.println(cafe.size());
				System.out.println(cafe);
				break;
			}
		}

	}

}




