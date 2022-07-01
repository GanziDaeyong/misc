import java.util.HashSet;
import java.util.Scanner;

class Point {
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int hashCode() {
		return 1;
	}
	public boolean equals(Object o) {
		Point p=(Point)o;
		if(this.x==p.x&&this.y==p.y) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
}
public class PointSetEx {

	public static void main(String[] args) {
		// [좌표]
		// x,y 입력-> 집합에 저장
		// 집합의 요소가 3개되면 종료
		// 가운데점=> 정수
		Scanner sc=new Scanner(System.in);
		HashSet<Point> s=new HashSet();
		while(s.size()!=3) {
			System.out.print("x좌표: ");
			int x=sc.nextInt();
			System.out.print("y좌표: ");
			int y=sc.nextInt();
			s.add(new Point(x,y));
		}
		System.out.println(s);
		// 이터레이터 => HW!!!
	}

}
