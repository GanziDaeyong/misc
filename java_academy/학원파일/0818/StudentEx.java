import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	String name;
	static int cnt=0; // ��� ��ü���� ����
	int num;
	int score1;
	int score2;
	double avg;
	Student(String name,int score1,int score2){
		this.name=name;
		this.num=++cnt;
		this.score1=score1;
		this.score2=score2;
		this.avg=(score1+score2)/2.0;
		System.out.println(this.name+"�л� �Է¿Ϸ�");
	}
	public String toString() {
		System.out.print(this.num+"�� "+this.name+"�л��� ��������� ");
		System.out.print(this.avg+"���Դϴ�.");
		return "";
	}
}
public class StudentEx {

	public static void main(String[] args) {
		
		// 1.�߰�  2.����(remove())  3.����
		// 2-�л���ȣ�� ��������
		// 3-�л� �����, ���α׷� ���� : ���ͷ�����
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> l=new LinkedList();
		while(true) {
			System.out.println("\n=====�л� ���α׷�=====");
			System.out.println("1.�߰� 2.���� 3.����");
			System.out.print("��ȣ�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.println();
				sc.nextLine();
				System.out.print("�̸��Է�: ");
				String name=sc.nextLine();
				System.out.print("�߰��Է�: ");
				int s1=sc.nextInt();
				System.out.print("�⸻�Է�: ");
				int s2=sc.nextInt();
				l.add(new Student(name,s1,s2));
			}
			else if(act==2) {
				System.out.print("������ �л��� ��ȣ�Է�: ");
				int num=sc.nextInt();
				for(int i=0;i<l.size();i++) {
					if(l.get(i).num==num) {
						System.out.println(l.get(i).name+"�л� �����Ϸ�");
						l.remove(i);
						break;
					}
				}
			}
			else {
				System.out.println();
				Iterator itr=l.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("\n���α׷� ����");
				break;
			}
		}
		
		
	}

}




