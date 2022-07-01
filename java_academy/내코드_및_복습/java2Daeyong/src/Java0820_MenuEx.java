import java.util.Scanner;

class MenuEx extends Exception {
	MenuEx(String message) {
		super(message); 
	}
}

public class Java0820_MenuEx {

	public static void main(String[] args) {
		
		MenuEx actError = new MenuEx("�ùٸ� ��ȣ�� �Է��ϼ���");
		MenuEx noMenuError = new MenuEx("�޴��� �����ϴ�. �޴��� �켱 �Է��ϼ���");
		MenuEx noChoiceError = new MenuEx("�޴��� ��Ȯ�� �Է��ϼ���");
			
		String [] menu = new String[10];
		Scanner sc = new Scanner (System.in);

		int i = 0;
		while (true) {
			System.out.println("1.�޴����� 2.�Է� 3.����");
			try {
				int act = sc.nextInt();
				
				if (act == 1) {
					System.out.println("====�޴���====");
					if (i == 0) {
						throw noMenuError;
					}
					int j = 0;
					for (j = 0 ; j <i ; j++) {
						System.out.println((j+1) + ". "+ menu[j]);
					}
					int num = sc.nextInt();

					if (num > i || num <= 0) {
						throw noChoiceError;
					}
					System.out.println(menu[num-1] + "�� �ֹ��ϼ̽��ϴ�");
				}
				else if (act == 2) {
					System.out.println("�޴� �Է�");
					sc.nextLine();
					String input = sc.nextLine();
					menu[i++] = input;
				}
				else if (act == 3) {
					System.out.println("����");
					break;
				}
				else {
					throw actError; // �̰� �ƿ� else�� �δ°� ������ �ƴϸ� ó���� if �� �ɷ��ִ°� ������???
				}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
