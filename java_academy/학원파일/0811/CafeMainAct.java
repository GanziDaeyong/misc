import java.util.Scanner;

class Menu{
	String name;
	int price;
	Menu(String name,int price){
		this.name=name;
		this.price=price;
		System.out.println(this.name+"_생성완료");
	}
	// 최상위클래스 Object에서 오버라이딩
	public String toString() {
		return this.name+":"+this.price;
	}
}
abstract class Card{ // 클래스들의 틀==추상클래스
	String user;
	abstract void use(int money); // [강제성]
}
class Check extends Card{
	int bal;
	Check(String user,int bal){
		this.user=user;
		this.bal=bal;
		System.out.println(this.user+"님 카드생성완료");
	}
	void use(int money) {
		if(this.bal<money) {
			System.out.println("잔액부족!");
		}
		else {
			this.bal-=money;
			System.out.println("결제완료");
		}
	}
	public String toString() {
		return this.user+"님의 잔액은 "+this.bal+"원";
	}
}
class Credit extends Card{
	int lim;
	Credit(String user,int lim){
		this.user=user;
		this.lim=lim;
		System.out.println(this.user+"님 카드생성완료");
	}
	void use(int money) {
		if(this.lim<money) {
			System.out.println("한도초과!");
		}
		else {
			this.lim-=money;
			System.out.println("결제완료");
		}
	}
	public String toString() {
		return this.user+"님의 남은 사용금액은 "+this.lim+"원";
	}
}
public class CafeMainAct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Menu[] cafe=new Menu[5];
		int index=-1;
		Check c1=new Check("홍길동",3000);
		Credit c2=new Credit("임꺽정",10000);
		while(true) {
			System.out.println("1-메뉴생성 2-결제 3-종료");
			System.out.print("번호입력: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("메뉴입력: ");
				String name=sc.nextLine();
				System.out.print("가격입력: ");
				int price=sc.nextInt();
				cafe[++index]=new Menu(name,price);
			}
			else if(act==2) {
				int money=0;
				while(true) {
					System.out.println("\n=====메뉴판=====");
					for(int i=0;i<=index;i++) {
						System.out.println((i+1)+". "+cafe[i]);
					}
					System.out.print("\n메뉴번호입력: ");
					int num=sc.nextInt();
					System.out.print("개수입력: ");
					int n=sc.nextInt();
					money+=cafe[num-1].price*n;
					System.out.print("추가구매?(1/0) ");
					int a=sc.nextInt();
					if(a==0) {
						break;
					}
				}
				System.out.println("총금액: "+money+"원");
				System.out.print("결제?(1/0) ");
				int p=sc.nextInt();
				if(p==1) {
					c1.use(money);
				}
				else {
					c2.use(money);
				}
				System.out.println(c1);
				System.out.println(c2);
			}
			else {
				System.out.println("프로그램종료");
				break;
			}
		}
	}

}










