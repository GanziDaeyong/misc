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
}
public class Cafesys {

	public static void main(String[] args) {
		
		ArrayList<P> cafe=new ArrayList();
		cafe.get(0).phone
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
				// �ִ��� ������ ȸ�������� Ȯ���ϱ�
			}
			else if(act==2) {
				System.out.print("�� �Է�: ");
				int day=sc.nextInt();
				// ȸ������Ȯ���Ͽ�, �����ڿ��� ��������
			}
			else {
				System.out.println(cafe.size());
				System.out.println(cafe);
				break;
			}
		}
		
	}

}




