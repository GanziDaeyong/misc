import java.util.Scanner;

class MenuEx extends Exception {
	MenuEx(String message) {
		super(message); 
	}
}

public class Java0820_MenuEx {

	public static void main(String[] args) {
		
		MenuEx actError = new MenuEx("올바른 번호를 입력하세요");
		MenuEx noMenuError = new MenuEx("메뉴가 없습니다. 메뉴를 우선 입력하세요");
		MenuEx noChoiceError = new MenuEx("메뉴를 정확히 입력하세요");
			
		String [] menu = new String[10];
		Scanner sc = new Scanner (System.in);

		int i = 0;
		while (true) {
			System.out.println("1.메뉴선택 2.입력 3.종료");
			try {
				int act = sc.nextInt();
				
				if (act == 1) {
					System.out.println("====메뉴판====");
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
					System.out.println(menu[num-1] + "을 주문하셨습니다");
				}
				else if (act == 2) {
					System.out.println("메뉴 입력");
					sc.nextLine();
					String input = sc.nextLine();
					menu[i++] = input;
				}
				else if (act == 3) {
					System.out.println("종료");
					break;
				}
				else {
					throw actError; // 이걸 아예 else로 두는게 나은가 아니면 처음에 if 로 걸러주는게 나은가???
				}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
