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
		// 1. 포인트 객체배열을 만든다.
		// 배열에 객체 저장
		// 0 - 1 1 -2 2-3

		Scanner sc = new Scanner(System.in);

		newPoint [] arr = new newPoint [5];

		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("차례대로 x y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = new newPoint(x,y);  //인스턴스화 == 객체화 발생하는 시점

		}
		
		for (newPoint comp : arr) {
			System.out.println(comp); // object 오버라이딩 필요하다.
		}
		
		for (int i = 0 ; i < arr.length -1 ; i ++) {
			System.out.println(arr[i].equals(arr[i+1]));
			



		}

	}

}
