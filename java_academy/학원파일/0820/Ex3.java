import java.util.Scanner;

class MenuEx extends Exception{
	MenuEx(String message){
		super(message);
	}
}
public class Ex3 {

	public static void main(String[] args) {

		String[] menu=new String[10];
		// 1-메뉴선택 2-메뉴입력 3-종료
		// [ 커피 아이스티 카페모카 ]
		// 1: 4-> "범위를 벗어났습니다!"
		// 2: 카페모카
		// ~~~> 4-> "잘못입력하셨습니다!"
		Scanner sc=new Scanner(System.in);
		int index=0;
		MenuEx e1=new MenuEx("범위를 벗어났습니다!");
		MenuEx e2=new MenuEx("잘못입력하셨습니다!");
		while(true) {
			System.out.println("1-메뉴선택 2-메뉴입력 3-종료");
			System.out.print("번호입력: ");
			int act=sc.nextInt();
			try {
				if(act<1||3<act) {
					throw e2;
				}
				///
				if(act==1) {
					System.out.println("\n===메뉴판===");
					for(int i=0;i<index;i++) {
						System.out.println((i+1)+". "+menu[i]);
					}
					System.out.print("번호입력: ");
					int m=sc.nextInt();
					try {
						if(m<1||index<m) {
							throw e1;
						}
						System.out.println("["+menu[m-1]+"] 나왔습니다~^^");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
				else if(act==2) {
					sc.nextLine();
					System.out.print("메뉴입력: ");
					menu[index++]=sc.nextLine();
				}
				else {
					System.out.println("프로그램종료");
					break; // 무한루프-중단시점
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}






