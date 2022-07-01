import java.util.Scanner;

// 카페메뉴판을 만ㄷ르 예정
// 1.메뉴입력 2. 결제 3.종료
// 2번 입력시 어떤 메뉴를 고를건지? 걔를 몇개살건지? 추가구매할건지.?
// -> 총금액 출력
// -> 체크/신용
// -> 결제실패, 메뉴출력(다시 돌아가는듯)

class cafeMenu {
	String menuName;
	int price;
	cafeMenu (String menuName, int price) {
		this.menuName = menuName;
		this.price = price;
		System.out.println(this.menuName + "/" + this.price);
	}

	public String toString() { // public 안하면 ? 부모인 Object 클래스에서 public으로 구현되있기 때문에 자식도 public이어야 하는 것이지.
		return this.menuName + "/" + this.price;
//////////Object 출신을 오버라이드.
	}
}

abstract class card_v3 {
	String username;
	abstract void pay(int cost);

	//class chkCard : 잔액
	//class crdCard : 한도
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
			System.out.println("결제성공. 잔액: " + this.bal);
		}
		else {
			System.out.println("잔액부족");
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
				System.out.println("결제성공. 사용금액: " + this.usage);
			}
			else {
				System.out.println("한도초과");
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
			
			System.out.println("1.메뉴입력 2.결제 3.종료");
			int num = sc.nextInt();
			sc.nextLine();
			
			if (num == 1) {
				
				if (index == 5) {
					System.out.println("배열꽉참");
					continue;
				}

				System.out.println("메뉴를 입력하세요");
				String menu = sc.nextLine();
				System.out.println("금액을 입력하세요");
				int price = sc.nextInt();

				c[index] = new cafeMenu(menu,price);
				index ++;
				//메뉴입력
			}
			else if (num == 2) {
				int cost = 0;
				System.out.println("========메뉴판 =========\n뭐선택?");
				for (int i = 0; i<index;i++) {
					System.out.println((i+1) +"."+c[i]);
				int num3 = sc.nextInt();
				
				


				System.out.println("0: 체크카드    1: 체크카드");
				int num2 = sc.nextInt();
				if (num2 == 0) {

				}

			}
			else if (num == 3) {
				break;
			}
			else {
				System.out.println("올바른 번호 입력하세요");
				continue;
			} 
		}
	}


}

	

  }