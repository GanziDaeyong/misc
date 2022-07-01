import java.util.Scanner;

class Menu{
	String name;
	int price;
	Menu(String name,int price){
		this.name=name;
		this.price=price;
		System.out.println(this.name+"_�����Ϸ�");
	}
	// �ֻ���Ŭ���� Object���� �������̵�
	public String toString() {
		return this.name+":"+this.price;
	}
}
abstract class Card{ // Ŭ�������� Ʋ==�߻�Ŭ����
	String user;
	abstract void use(int money); // [������]
}
class Check extends Card{
	int bal;
	Check(String user,int bal){
		this.user=user;
		this.bal=bal;
		System.out.println(this.user+"�� ī������Ϸ�");
	}
	void use(int money) {
		if(this.bal<money) {
			System.out.println("�ܾ׺���!");
		}
		else {
			this.bal-=money;
			System.out.println("�����Ϸ�");
		}
	}
	public String toString() {
		return this.user+"���� �ܾ��� "+this.bal+"��";
	}
}
class Credit extends Card{
	int lim;
	Credit(String user,int lim){
		this.user=user;
		this.lim=lim;
		System.out.println(this.user+"�� ī������Ϸ�");
	}
	void use(int money) {
		if(this.lim<money) {
			System.out.println("�ѵ��ʰ�!");
		}
		else {
			this.lim-=money;
			System.out.println("�����Ϸ�");
		}
	}
	public String toString() {
		return this.user+"���� ���� ���ݾ��� "+this.lim+"��";
	}
}
public class CafeMainAct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Menu[] cafe=new Menu[5];
		int index=-1;
		Check c1=new Check("ȫ�浿",3000);
		Credit c2=new Credit("�Ӳ���",10000);
		while(true) {
			System.out.println("1-�޴����� 2-���� 3-����");
			System.out.print("��ȣ�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("�޴��Է�: ");
				String name=sc.nextLine();
				System.out.print("�����Է�: ");
				int price=sc.nextInt();
				cafe[++index]=new Menu(name,price);
			}
			else if(act==2) {
				int money=0;
				while(true) {
					System.out.println("\n=====�޴���=====");
					for(int i=0;i<=index;i++) {
						System.out.println((i+1)+". "+cafe[i]);
					}
					System.out.print("\n�޴���ȣ�Է�: ");
					int num=sc.nextInt();
					System.out.print("�����Է�: ");
					int n=sc.nextInt();
					money+=cafe[num-1].price*n;
					System.out.print("�߰�����?(1/0) ");
					int a=sc.nextInt();
					if(a==0) {
						break;
					}
				}
				System.out.println("�ѱݾ�: "+money+"��");
				System.out.print("����?(1/0) ");
				int p=sc.nextInt();
				if(p==1) {
					c1.use(money);
				}
				else {
					c2.use(money);
				}
				System.out.println(c1);
				System.out.println(c2);
			}
			else {
				System.out.println("���α׷�����");
				break;
			}
		}
	}

}










