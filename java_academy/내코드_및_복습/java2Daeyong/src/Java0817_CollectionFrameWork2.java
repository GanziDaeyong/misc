import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class newPoint2 {

	int x;
	int y;

	newPoint2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + this.x + ","+ this.y + ")"; 
	}

	boolean equals(newPoint2 otherP) {
		if (this.x == otherP.x && this.y == otherP.y) {
			return true;
		}
		return false; 

	}

}


public class Java0817_CollectionFrameWork2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<newPoint2> arr =  new ArrayList();

		
		System.out.println("�� ��ǥ �Է�");


		for (int i = 0 ; i < 3 ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new newPoint2(x,y));	
		}
		System.out.println(arr);

		// 1. ���߰� 2. ���� 3. ��Ȯ��  4. ����
		while(true) {
			System.out.println("1. �� �߰� \t2. �� �� \t3. �� Ȯ�� \t4. ����");
			int act = sc.nextInt();
			if (act == 1) {
				System.out.println("x y �Է�");
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr.add(new newPoint2(x,y));
				System.out.println(arr);			
			}
			else if (act == 2){
				System.out.println("���� �� �� �Է�");
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(i+1 + "." +arr.get(i));
				}
				int p1 = sc.nextInt();
				int p2 = sc.nextInt();
				if (arr.get(p1-1).equals(arr.get(p2-1))) {
					System.out.println("����");
				}
				else {
					System.out.println("�ٸ�");
				}

			}
			else if (act == 3) {
				Iterator itr = arr.iterator(); ///�߿�! scanner�� �ٸ��� �ݺ��ڴ� �Ź� ����Ѵ�!!!!
				while(itr.hasNext()) {
					System.out.println("("+itr.next()+")");
				}
			}

			else if (act == 4) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("��ȣ Ʋ��");
				continue;
			}	
		}
	}
}
