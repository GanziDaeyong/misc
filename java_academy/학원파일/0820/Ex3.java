import java.util.Scanner;

class MenuEx extends Exception{
	MenuEx(String message){
		super(message);
	}
}
public class Ex3 {

	public static void main(String[] args) {

		String[] menu=new String[10];
		// 1-�޴����� 2-�޴��Է� 3-����
		// [ Ŀ�� ���̽�Ƽ ī���ī ]
		// 1: 4-> "������ ������ϴ�!"
		// 2: ī���ī
		// ~~~> 4-> "�߸��Է��ϼ̽��ϴ�!"
		Scanner sc=new Scanner(System.in);
		int index=0;
		MenuEx e1=new MenuEx("������ ������ϴ�!");
		MenuEx e2=new MenuEx("�߸��Է��ϼ̽��ϴ�!");
		while(true) {
			System.out.println("1-�޴����� 2-�޴��Է� 3-����");
			System.out.print("��ȣ�Է�: ");
			int act=sc.nextInt();
			try {
				if(act<1||3<act) {
					throw e2;
				}
				///
				if(act==1) {
					System.out.println("\n===�޴���===");
					for(int i=0;i<index;i++) {
						System.out.println((i+1)+". "+menu[i]);
					}
					System.out.print("��ȣ�Է�: ");
					int m=sc.nextInt();
					try {
						if(m<1||index<m) {
							throw e1;
						}
						System.out.println("["+menu[m-1]+"] ���Խ��ϴ�~^^");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
				else if(act==2) {
					sc.nextLine();
					System.out.print("�޴��Է�: ");
					menu[index++]=sc.nextLine();
				}
				else {
					System.out.println("���α׷�����");
					break; // ���ѷ���-�ߴܽ���
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}






