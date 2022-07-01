import java.util.ArrayList;
import java.util.Scanner;

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	boolean equals(Point p) {
		if(this.x==p.x && this.y==p.y) {
			return true;
		}
		return false;
	}
}
public class Homework {

	public static void main(String[] args) {
		
		ArrayList<Point> a=new ArrayList();
		// 1- Point 3개 생성
		// 2- Point객체 3개의 좌표가 출력될수있도록 해주세요!~~
		a.add(new Point(1,2));
		a.add(new Point(3,4));
		a.add(new Point(5,6));
		System.out.println(a);
		
		// 1.점추가 2.점비교 3.종료
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("액션입력: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.print("x입력: ");
				int x=sc.nextInt();
				System.out.print("y입력: ");
				int y=sc.nextInt();
				a.add(new Point(x,y));
			}
			else if(act==2) {
				System.out.println(a);
				System.out.println("비교할점입력");
				System.out.print("1입력: ");
				int x=sc.nextInt();
				System.out.print("2입력: ");
				int y=sc.nextInt();
				if(a.get(x-1).equals(a.get(y-1))) {
					System.out.println("같은점");
				}
				else {
					System.out.println("다른점");
				}
			}
			else {
				break;
			}
		}
		
	}

}




