
import java.util.ArrayList;
import java.util.Scanner;

class Movie{
	String name;
	int hour;
	Movie(String name,int hour){
		this.name=name;
		this.hour=hour;
		System.out.println("["+this.name+"] 예매완료");
	}
	public String toString() {
		return this.name+" : "+this.hour+"시";
	}
}
public class MovieEx {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Movie> CGV=new ArrayList<Movie>();
		CGV.add(new Movie("다만악에서구하소서",14));
		CGV.add(new Movie("다만악에서구하소서",14));
		
		ArrayList<Movie> Mega=new ArrayList<Movie>();
		ArrayList<Movie> Lotte=new ArrayList<Movie>();
		System.out.println(CGV);
		int act;
		while(true) {
			System.out.println("\n=====영화예매시스템=====");
			System.out.println("1-예약 2-발권 3-종료");
			System.out.print("번호입력: ");
			act=sc.nextInt();
			if(act==1) {
				System.out.println("\n예약할 영화관 선택");
				System.out.println("1-CGV 2-메가박스 3-롯데시네마");
				System.out.print("번호입력: ");
				act=sc.nextInt();
				System.out.print("제목입력: ");
				sc.nextLine(); // 버퍼
				String name=sc.nextLine();
				System.out.print("시간입력: ");
				int hour=sc.nextInt();
				if(act==1) {
					CGV.add(new Movie(name,hour));
					System.out.println("예매번호: "+(1000+CGV.size()));
				}
				else if(act==2) {
					Mega.add(new Movie(name,hour));
					System.out.println("예매번호: "+(2000+Mega.size()));
				}
				else {
					Lotte.add(new Movie(name,hour));
					System.out.println("예매번호: "+(3000+Lotte.size()));
				}
				System.out.println();
			}
			else if(act==2) {
				System.out.println("\n===Ticket Box===");
				System.out.print("CGV: ");
				System.out.println(CGV);
				System.out.print("메가박스: ");
				System.out.println(Mega);
				System.out.print("롯데시네마: ");
				System.out.println(Lotte);
				System.out.print("\n예매번호입력: ");
				int num=sc.nextInt();
				if(1000<num&&num<=1000+CGV.size()) {
					System.out.print(CGV.get(num-1000));
					System.out.println(" 발권완료");
				}
				else if(2000<num&&num<=2000+Mega.size()) {
					
				}
				else if(3000<num&&num<=3000+Lotte.size()){
				
				}
				else {
					System.out.println("없는 예매번호입니다.");
				}
			}
			else {
				System.out.println();
				System.out.println("CGV의 누적관람객수는 "+CGV.size()+"명");
				System.out.println("\n프로그램종료");
				break;
			}
		}
		
	}

}




