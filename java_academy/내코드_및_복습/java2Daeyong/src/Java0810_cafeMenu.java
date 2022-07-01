import java.util.Scanner;

// ī��޴����� ������ ����
// 1.�޴��Է� 2. ���� 3.����
// 2�� �Է½� � �޴��� ������? �¸� ������? �߰������Ұ���.?
// -> �ѱݾ� ���
// -> üũ/�ſ�
// -> ��������, �޴����(�ٽ� ���ư��µ�)

class cafeMenu {
	String menuName;
	int price;
	cafeMenu (String menuName, int price) {
		this.menuName = menuName;
		this.price = price;
		System.out.println(this.menuName + "/" + this.price);
	}

	public String toString() { // public ���ϸ� ? �θ��� Object Ŭ�������� public���� �������ֱ� ������ �ڽĵ� public�̾�� �ϴ� ������.
		return this.menuName + "/" + this.price;
//////////Object ����� �������̵�.
	}
}

abstract class card_v3 {
	String username;
	abstract void pay(int cost);

	//class chkCard : �ܾ�
	//class crdCard : �ѵ�
}


class chkCard extends card_v3 {

	int bal;
	chkCard(String username, int bal) {
		this.username = username;
		this.bal = bal;
	}
	@Override
	void pay(int cost) {
		if (this.bal >= cost) {
			this.bal -= cost;
			System.out.println("��������. �ܾ�: " + this.bal);
		}
		else {
			System.out.println("�ܾ׺���");
		}

	}

	class crdCard extends card_v3 {
		
		int usage;
		int lim;
		
		crdCard(String username, int usage, int lim){
			this.username = username;
			this.usage = usage;
			this.lim = lim;
		}
		
		void pay(int cost) {
			if (this.usage + cost < this.lim) {
				this.usage += cost;
				System.out.println("��������. ���ݾ�: " + this.usage);
			}
			else {
				System.out.println("�ѵ��ʰ�");
			}
		}
	}

}




public class Java0810_cafeMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		cafeMenu[] c = new cafeMenu[5];
		int index = 0;


		


		while (true) {
			
			System.out.println("1.�޴��Է� 2.���� 3.����");
			int num = sc.nextInt();
			sc.nextLine();
			
			if (num == 1) {
				
				if (index == 5) {
					System.out.println("�迭����");
					continue;
				}

				System.out.println("�޴��� �Է��ϼ���");
				String menu = sc.nextLine();
				System.out.println("�ݾ��� �Է��ϼ���");
				int price = sc.nextInt();

				c[index] = new cafeMenu(menu,price);
				index ++;
				//�޴��Է�
			}
			else if (num == 2) {
				int cost = 0;
				System.out.println("========�޴��� =========\n������?");
				for (int i = 0; i<index;i++) {
					System.out.println((i+1) +"."+c[i]);
				int num3 = sc.nextInt();
				
				


				System.out.println("0: üũī��    1: üũī��");
				int num2 = sc.nextInt();
				if (num2 == 0) {

				}

			}
			else if (num == 3) {
				break;
			}
			else {
				System.out.println("�ùٸ� ��ȣ �Է��ϼ���");
				continue;
			} 
		}
	}


}

	

  }