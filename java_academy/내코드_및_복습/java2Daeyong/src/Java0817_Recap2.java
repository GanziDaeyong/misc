import java.util.Scanner;

class newPoint {
	int x;
	int y;
	newPoint(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public String toString() {
		return this.x +"/"+ this.y;
	}

	boolean equals(newPoint otherP) {
		if (otherP.x==this.x && otherP.y == this.y) {
			return true;
		}
		return false;
	}
}

public class Java0817_Recap2 {

	public static void main(String[] args) {
		// 1. ����Ʈ ��ü�迭�� �����.
		// �迭�� ��ü ����
		// 0 - 1 1 -2 2-3

		Scanner sc = new Scanner(System.in);

		newPoint [] arr = new newPoint [5];

		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("���ʴ�� x y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = new newPoint(x,y);  //�ν��Ͻ�ȭ == ��üȭ �߻��ϴ� ����

		}
		
		for (newPoint comp : arr) {
			System.out.println(comp); // object �������̵� �ʿ��ϴ�.
		}
		
		for (int i = 0 ; i < arr.length -1 ; i ++) {
			System.out.println(arr[i].equals(arr[i+1]));
			



		}

	}

}
