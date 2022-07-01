import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
// class Person: �̸�/�����ȣ->�����ڿ��� ��������
/*
1.���� 2.���� 3.����
1_������ ����? => �����ȣ(��������,1~100)
2_ó���� �����? [ �� �� �� Ȳ �� ] 2
 �� �����ȣ? O -> �����ϼ���.
 �� �����ȣ? X -> �����ȣ�� ����ġ�մϴ�.
  [ �� Ȳ �� �� ]
*/
class Person{
	String name;
	int num;
	Person(String name){
		this.name=name;
		Random r=new Random();
		this.num=r.nextInt(100)+1;
		System.out.println(this.name+"���� �����ȣ�� ["+this.num+"]�Դϴ�.");
	}
	public String toString() {
		return this.name+"��";
	}
}
public class RestaurantEx {

	public static void main(String[] args) {
		
		Queue<Person> q=new LinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n===���� ���α׷�===");
			System.out.println("1.���� 2.ó�� 3.����");
			System.out.print("��ȣ�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("�̸��Է�: ");
				String name=sc.nextLine();
				q.offer(new Person(name));
			}
			else if(act==2) {
				System.out.print("���ó��? ");
				int num=sc.nextInt();
				for(int i=0;i<num;i++) {
					Person p=q.poll();
					System.out.print(p.name+"���� �����ȣ��? ");
					int check=sc.nextInt();
					if(p.num==check) {
						System.out.println("����Ȯ�εǼ̽��ϴ�.");
					}
					else {
						System.out.println("�����ȣ����ġ!");
						q.offer(p);
					}
				}
			}
			else {
				System.out.println(q);
				System.out.println("\n���α׷�����");
				break;
			}
		}
		
	}

}




