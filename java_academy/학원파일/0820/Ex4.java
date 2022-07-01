import java.util.ArrayList;
import java.util.Scanner;

// [도서관]: 책 객체들이 저장된 리스트
// [사람]: 이름,빌릴수있는 책의 개수
// [책]: 번호,제목

// 사람객체배열->2명
// 1_대여 2_반납 3_종료 4_도서관에 책 추가

// 예외처리:도서관에 없는 책 대여 / 책 대여량 초과
class LibEx extends Exception{
	LibEx(String message){
		super(message);
	}
}
class Book{
	int num;
	String name;
	Book(int num,String name){
		this.num=num;
		this.name=name;
	}
	public String toString() {
		return this.num+":"+this.name;
	}
}
class Person{
	String name;
	Book[] b;
	int i;
	Person(String name,int n){
		this.name=name;
		this.b=new Book[n];
		this.i=0;
	}
	void show(){
		for(int i=0;i<this.i;i++) {
			System.out.println(b[i]);
		}
	}
}
public class Ex4 {

	public static void main(String[] args) {

		ArrayList<Book> a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		Person[] p=new Person[2];
		p[0]=new Person("홍길동",2);
		p[1]=new Person("임꺽정",3);
		int pp=0;
		LibEx e1=new LibEx("없는 책 대여");

		while(true) {
			try {
				pp++;
				System.out.println("1-대여 2-반납 3-종료 4-도서관에 책추가");
				System.out.print("번호입력: ");
				int act=sc.nextInt();
				if(act==1) {
					System.out.println(a);
					System.out.print(p[pp%2].name+", 대여할 책번호: ");
					int num=sc.nextInt();
					int sw=0;
					for(int i=0;i<a.size();i++) {
						if(a.get(i).num==num) {
							sw=1;
							System.out.println(a.get(i).name+"대여해줌");
							
							p[pp%2].b[ p[pp%2].i++ ]=a.get(i);
							p[pp%2].show(); // 확인용
							a.remove(i);
							break;
						}
					}
					if(sw==0) {
						throw e1;
					}
				}
				else if(act==2) {

				}
				else if(act==4) {
					a.add(new Book(1000+pp,"책"));
				}
				else {
					break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
