import java.util.ArrayList;
import java.util.Scanner;

class P{
	String name;
	int phone;
	int day;
	int check;
	int money;
	P(String name,int phone){
		this(name,phone,0);
	}
	P(String name,int phone,int day){
		this.name=name;
		this.phone=phone;
		this.day=day;
		this.check=0;
		this.money=0;
		System.out.println(this.name+"님 가입완료");
	}
	public String toString() {
		return this.name+"님";
	}
	void point(int m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("쿠폰사용 (1/0)");
		int ans = sc.nextInt();
		if (ans == 1) {
			this.money --;
			System.out.println("쿠폰결제완료");
			return;
		}
		this.check += (m/1000);// 쿠폰사용 아니면 바로 이리로 넘어오는 것이다.
		if (this.check>=10) {
			this.check -= 10;
			this.money ++;
			System.out.println("쿠폰 지급");
			System.out.println("현재 도장: " + this.check + "개");
		}
	}
}
public class Java0819_CafeManager {

	public static void main(String[] args) {

		ArrayList<P> cafe=new ArrayList();
		cafe.get(0).phone;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n===화면===");
			System.out.println("1-결제 2-생일안내 3-종료");
			System.out.print("번호입력: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.print("결제금액입력: ");
				int m=sc.nextInt();
				System.out.print("전화번호입력: ");
				int phone=sc.nextInt();
				int sw = 0;
				for (int i = 0 ; i < cafe.size() ; i++) {
					if (phone == cafe.get(i).phone) {
						System.out.println("회원입니다");
						sw = 1;
						break;
					}
					if (sw == 0) {
						System.out.println("가입을 진행합니다");
						System.out.println("===회원가입===");
						System.out.println("이름: ");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("번호 네자리");
						int phoneInput = sc.nextInt();
						System.out.println("생일 입력시 생일 때 쿠폰을 드립니다. \n작성하시겠습니까?: ");
						int day = sc.nextInt();
						if (day == 1) {
							System.out.println("생일 여섯자리");
							day = sc.nextInt();
						}
						cafe.add(new P(name,phoneInput,day));	// 입력 안하면 저절로 0 받으니까
						cafe.get(cafe.size() - 1).point(m); // get 함수 찾아보기	
					}					
				}


				// 있는지 없는지 회원정보들 확인하기
			}
			else if(act==2) {
				System.out.print("월 입력: ");
				int day=sc.nextInt();
				// 회원정보확인하여, 생일자에게쿠폰지급
				for (int i = 0; i < cafe.size(); i++) {
					if(cafe.get(i).day == day) {
						 // 마저 만들어보기
					}
				}
			}
			else {
				System.out.println(cafe.size());
				System.out.println(cafe);
				break;
			}
		}

	}

}




