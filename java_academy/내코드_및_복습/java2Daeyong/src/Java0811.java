import java.util.Scanner;

///////////////////////////////////��ü�迭////////////////////////////////////////
// ��ư� �������� ��. �׳� ��ü�� �迭�� ���� ���̴�. 


class bbook{
	String title; // ����. �翬�Ѱ����� �������� �ʱ� ������. ��ü���� �ٸ��� ������ static�� ���̸� �ȵǴ°���.
	String auth;
	int price;
	
	bbook(String title, String auth, int price) {
		this.title = title;
		this.auth = auth;
		this.price = price;
		System.out.println(" å ����Ϸ�");
	}
	bbook(String title, int price) {
		this(title,"���ڹ̻�",price);
	}
	
	
	//void show() {
	//	System.out.println(this.title + "/"+ this.auth+ "/" + this.price);
	//}
	
	public String toString() { // public ���ϸ� ? �θ��� Object Ŭ�������� public���� �������ֱ� ������ �ڽĵ� public�̾�� �ϴ� ������.
		return this.title + "/"+ this.auth+ "/" + this.price;
	}
	
	
	
}


public class Java0811 {

	public static void main(String[] args) {
		
		//int[] arr = new int[3]; ó�� �Ȱ��� ����� ��.
		bbook[] bbook_arr = new bbook[5]; // �׷��� ������ �׳� ��ü�� �� �迭�� �������, ��ü�� ������ ���� �ƴϾ�!!
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while(true) {
			System.out.println("1.���� 2.���");
			int act = sc.nextInt();
			
			if(act == 1) {
				if (index == 5) {
					System.out.println("�迭������");
					continue;
				}
				
				sc.nextLine();
				System.out.println("å �����Է�: ");
				String title = sc.nextLine();
				System.out.println("����");
				int price = sc.nextInt();
				System.out.println("�۰�����");
				int a = sc.nextInt();
				if (a == 1) {
					sc.nextLine();
					System.out.println("�۰��Է�: ");
					String author = sc.nextLine();
					bbook_arr[index++] = new bbook(title, author, price); // ��� ������. �ν��Ͻ�ȭ �����̴�.
					// -> ���������ڴ� �����ϱ� �̷��� �ᵵ 0 1 2 3 �� ������.
				}
				else {
					bbook_arr[index++] = new bbook(title,price);
					
				}
			// ����
			}
			else if (act == 2) {
				for (int i = 0; i<index;i++) {
					System.out.println(bbook_arr[i]); // �׳� bbook_arr[i]�� �ȵǴ� ������ �� �����ΰ� ��ü�̱� �����̴�.
					// �ڹٿ��� �����ϴ� �ֻ��� Ŭ���� Object. Object���� �� ����. 
					// -> bbook_arr[i]�� ������ Object��� Ŭ������ ���� toString()�ż��带 �ҷ��´�.
					// ���� bbook_arr[i]�� ���ڿ� ��ü�� ��µǴ� ���̴�.
					// �� �׷��� toString()�� �� Ŭ�������� �������̵� �ع����� �Ǵ°��ݾ�! ���� �ö󰡼� check
			
					
				}
				// ���
			}
			else {
				System.out.println("���α׷� ����");
				break;
			}
			
		}
	}

}
