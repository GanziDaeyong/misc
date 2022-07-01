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
}
public class Cafesys {

	public static void main(String[] args) {
		
		ArrayList<P> cafe=new ArrayList();
		cafe.get(0).phone
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
				// 있는지 없는지 회원정보들 확인하기
			}
			else if(act==2) {
				System.out.print("월 입력: ");
				int day=sc.nextInt();
				// 회원정보확인하여, 생일자에게 쿠폰지급
			}
			else {
				System.out.println(cafe.size());
				System.out.println(cafe);
				break;
			}
		}
		
	}

}




