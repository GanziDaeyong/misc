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

		
		System.out.println("세 좌표 입력");


		for (int i = 0 ; i < 3 ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new newPoint2(x,y));	
		}
		System.out.println(arr);

		// 1. 점추가 2. 점비교 3. 점확인  4. 종료
		while(true) {
			System.out.println("1. 점 추가 \t2. 점 비교 \t3. 점 확인 \t4. 종료");
			int act = sc.nextInt();
			if (act == 1) {
				System.out.println("x y 입력");
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr.add(new newPoint2(x,y));
				System.out.println(arr);			
			}
			else if (act == 2){
				System.out.println("비교할 두 점 입력");
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(i+1 + "." +arr.get(i));
				}
				int p1 = sc.nextInt();
				int p2 = sc.nextInt();
				if (arr.get(p1-1).equals(arr.get(p2-1))) {
					System.out.println("같음");
				}
				else {
					System.out.println("다름");
				}

			}
			else if (act == 3) {
				Iterator itr = arr.iterator(); ///중요! scanner와 다르게 반복자는 매번 써야한다!!!!
				while(itr.hasNext()) {
					System.out.println("("+itr.next()+")");
				}
			}

			else if (act == 4) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("번호 틀림");
				continue;
			}	
		}
	}
}
