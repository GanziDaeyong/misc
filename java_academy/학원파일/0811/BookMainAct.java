import java.util.Scanner;

class Book{
	String ti;
	String au;
	int pr;
	Book(String ti,int pr){
		this(ti,"작자미상",pr);
	}
	Book(String ti,String au,int pr){
		this.ti=ti;
		this.au=au;
		this.pr=pr;
		System.out.println(this.ti+" 책 구비완료");
	}
	// 제목,작가,가격
	// 제목,작가,가격 / 제목,가격(작자미상) -> 생성자 오버로딩
	// show()
	public String toString() { // 오버라이딩==재정의
		return this.ti+":"+this.au+" = "+this.pr+"원";
	}
	/*
	모든 클래스는 Object(==최상위클래스)클래스를 상속받은 상태
	toString() -> 오버라이딩
	부모의 공개범위 <= 자식의 공개범위
	*/
}

public class BookMainAct {

	public static void main(String[] args) {
		//int[] arr=new int[5];
		Book[] b=new Book[5];
		int index=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-생성 2-출력 3-종료");
			System.out.print("번호입력: ");
			int act=sc.nextInt();
			if(act==1) {
				if(index==5) {
					System.out.println("배열가득참!");
					continue;
				}
				sc.nextLine();
				System.out.print("책제목입력: ");
				String ti=sc.nextLine();
				System.out.print("가격입력: ");
				int pr=sc.nextInt();
				System.out.print("작가유무(1/0): ");
				int a=sc.nextInt();
				if(a==1) {
					sc.nextLine();
					System.out.print("작가입력: ");
					String au=sc.nextLine();
					b[index++]=new Book(ti,au,pr); // 인스턴스화
				}
				else {
					b[index++]=new Book(ti,pr);
				}
			}
			else if(act==2) {
				for(int i=0;i<index;i++) {
					// JAVA에서 기본제공하는 최상위클래스
					// ==Object
					System.out.println(b[i]);
					//b[i].show();
				}
			}
			else {
				System.out.println("프로그램종료");
				break;
			}
		}
		// 1. Book클래스 배열 5 -> 객체배열
		// 1-생성 2-출력 3-종료
	}

}
