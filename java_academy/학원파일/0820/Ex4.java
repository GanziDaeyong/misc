import java.util.ArrayList;
import java.util.Scanner;

// [������]: å ��ü���� ����� ����Ʈ
// [���]: �̸�,�������ִ� å�� ����
// [å]: ��ȣ,����

// �����ü�迭->2��
// 1_�뿩 2_�ݳ� 3_���� 4_�������� å �߰�

// ����ó��:�������� ���� å �뿩 / å �뿩�� �ʰ�
class LibEx extends Exception{
	LibEx(String message){
		super(message);
	}
}
class Book{
	int num;
	String name;
	Book(int num,String name){
		this.num=num;
		this.name=name;
	}
	public String toString() {
		return this.num+":"+this.name;
	}
}
class Person{
	String name;
	Book[] b;
	int i;
	Person(String name,int n){
		this.name=name;
		this.b=new Book[n];
		this.i=0;
	}
	void show(){
		for(int i=0;i<this.i;i++) {
			System.out.println(b[i]);
		}
	}
}
public class Ex4 {

	public static void main(String[] args) {

		ArrayList<Book> a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		Person[] p=new Person[2];
		p[0]=new Person("ȫ�浿",2);
		p[1]=new Person("�Ӳ���",3);
		int pp=0;
		LibEx e1=new LibEx("���� å �뿩");

		while(true) {
			try {
				pp++;
				System.out.println("1-�뿩 2-�ݳ� 3-���� 4-�������� å�߰�");
				System.out.print("��ȣ�Է�: ");
				int act=sc.nextInt();
				if(act==1) {
					System.out.println(a);
					System.out.print(p[pp%2].name+", �뿩�� å��ȣ: ");
					int num=sc.nextInt();
					int sw=0;
					for(int i=0;i<a.size();i++) {
						if(a.get(i).num==num) {
							sw=1;
							System.out.println(a.get(i).name+"�뿩����");
							
							p[pp%2].b[ p[pp%2].i++ ]=a.get(i);
							p[pp%2].show(); // Ȯ�ο�
							a.remove(i);
							break;
						}
					}
					if(sw==0) {
						throw e1;
					}
				}
				else if(act==2) {

				}
				else if(act==4) {
					a.add(new Book(1000+pp,"å"));
				}
				else {
					break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
