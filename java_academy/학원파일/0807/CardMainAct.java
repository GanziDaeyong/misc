import java.util.Scanner;

class Card{
	String name;
	int bal;
	private int pw;
	Card (String name,int bal,int pw){
		this.name=name;
		this.bal=bal;
		this.pw=pw;
		System.out.println(this.name+"���� ī������Ϸ�");
	}
	void inputMoney(int money) {
		System.out.println("�Աݼ���");
		this.bal+=money;
	}
	void outputMoney(int money) {
		System.out.print("����Է�: ");
		Scanner sc=new Scanner(System.in);
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			System.out.println("���⼺��");
			this.bal-=money;
		}
		else {
			System.out.println("��й�ȣ����ġ!");
		}
	}
	boolean checkpw(int pw) {
		if(this.pw==pw) {
			return true;
		}
		return false;
	}
	void show() {
		System.out.println(this.name+"���� �ܾ�: "+this.bal);
	}
}
class CheckCard extends Card{
	// 1. �⺻������
	// 2. �θ��� �⺻������->�θ��� �⺻�����ڰ� ����!
	CheckCard(String name, int bal, int pw) {
		super(name, bal, pw);
	}
	void outputMoney(int money) {
		System.out.print("����Է�: ");
		Scanner sc=new Scanner(System.in);
		int pw=sc.nextInt();
		if(checkpw(pw)) {
			if(this.bal<money) {
				System.out.println("�ܾ׺���!");
			}
			else {
				System.out.println("���⼺��");
				this.bal-=money;
			}
		}
		else {
			System.out.println("��й�ȣ����ġ!");
		}
	}
}
class BusCard extends Card{
	int age;
	BusCard(String name, int bal, int pw,int age) {
		super(name, bal, pw);
		this.age=age;
	}
	void use() {
		System.out.print("�ߺ�- ");
		if(this.age<=18) {
			System.out.println("û�ҳ��Դϴ�.");
			// 800;
		}
		else if(this.age<=60) {
			System.out.println("�����Դϴ�.");
			// 1299;
		}
		else {
			System.out.println("����!");
		}
	}
}

public class CardMainAct {

	public static void main(String[] args) {
		CheckCard cc=new CheckCard("ȫ�浿",10000,1111);
		//cc.outputMoney(20000);
		//cc.outputMoney(9000);
		//cc.outputMoney(9000);
		//cc.show();
		
		BusCard bs=new BusCard("�Ӳ���",10000,1111,20);
		bs.use();
	}

}
