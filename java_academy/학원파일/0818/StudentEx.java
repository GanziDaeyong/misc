import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	String name;
	static int cnt=0; // 모든 객체들이 공유
	int num;
	int score1;
	int score2;
	double avg;
	Student(String name,int score1,int score2){
		this.name=name;
		this.num=++cnt;
		this.score1=score1;
		this.score2=score2;
		this.avg=(score1+score2)/2.0;
		System.out.println(this.name+"학생 입력완료");
	}
	public String toString() {
		System.out.print(this.num+"번 "+this.name+"학생의 평균점수는 ");
		System.out.print(this.avg+"점입니다.");
		return "";
	}
}
public class StudentEx {

	public static void main(String[] args) {
		
		// 1.추가  2.삭제(remove())  3.종료
		// 2-학생번호로 삭제진행
		// 3-학생 출력후, 프로그램 종료 : 이터레이터
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> l=new LinkedList();
		while(true) {
			System.out.println("\n=====학생 프로그램=====");
			System.out.println("1.추가 2.삭제 3.종료");
			System.out.print("번호입력: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.println();
				sc.nextLine();
				System.out.print("이름입력: ");
				String name=sc.nextLine();
				System.out.print("중간입력: ");
				int s1=sc.nextInt();
				System.out.print("기말입력: ");
				int s2=sc.nextInt();
				l.add(new Student(name,s1,s2));
			}
			else if(act==2) {
				System.out.print("삭제할 학생의 번호입력: ");
				int num=sc.nextInt();
				for(int i=0;i<l.size();i++) {
					if(l.get(i).num==num) {
						System.out.println(l.get(i).name+"학생 삭제완료");
						l.remove(i);
						break;
					}
				}
			}
			else {
				System.out.println();
				Iterator itr=l.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("\n프로그램 종료");
				break;
			}
		}
		
		
	}

}




