import java.util.Scanner;

class Book{
	String ti;
	String au;
	int pr;
	Book(String ti,int pr){
		this(ti,"���ڹ̻�",pr);
	}
	Book(String ti,String au,int pr){
		this.ti=ti;
		this.au=au;
		this.pr=pr;
		System.out.println(this.ti+" å ����Ϸ�");
	}
	// ����,�۰�,����
	// ����,�۰�,���� / ����,����(���ڹ̻�) -> ������ �����ε�
	// show()
	public String toString() { // �������̵�==������
		return this.ti+":"+this.au+" = "+this.pr+"��";
	}
	/*
	��� Ŭ������ Object(==�ֻ���Ŭ����)Ŭ������ ��ӹ��� ����
	toString() -> �������̵�
	�θ��� �������� <= �ڽ��� ��������
	*/
}

public class BookMainAct {

	public static void main(String[] args) {
		//int[] arr=new int[5];
		Book[] b=new Book[5];
		int index=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-���� 2-��� 3-����");
			System.out.print("��ȣ�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				if(index==5) {
					System.out.println("�迭������!");
					continue;
				}
				sc.nextLine();
				System.out.print("å�����Է�: ");
				String ti=sc.nextLine();
				System.out.print("�����Է�: ");
				int pr=sc.nextInt();
				System.out.print("�۰�����(1/0): ");
				int a=sc.nextInt();
				if(a==1) {
					sc.nextLine();
					System.out.print("�۰��Է�: ");
					String au=sc.nextLine();
					b[index++]=new Book(ti,au,pr); // �ν��Ͻ�ȭ
				}
				else {
					b[index++]=new Book(ti,pr);
				}
			}
			else if(act==2) {
				for(int i=0;i<index;i++) {
					// JAVA���� �⺻�����ϴ� �ֻ���Ŭ����
					// ==Object
					System.out.println(b[i]);
					//b[i].show();
				}
			}
			else {
				System.out.println("���α׷�����");
				break;
			}
		}
		// 1. BookŬ���� �迭 5 -> ��ü�迭
		// 1-���� 2-��� 3-����
	}

}
