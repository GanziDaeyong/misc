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
		// [��ǥ]
		// x,y �Է�-> ���տ� ����
		// ������ ��Ұ� 3���Ǹ� ����
		// �����=> ����
		Scanner sc=new Scanner(System.in);
		HashSet<Point> s=new HashSet();
		while(s.size()!=3) {
			System.out.print("x��ǥ: ");
			int x=sc.nextInt();
			System.out.print("y��ǥ: ");
			int y=sc.nextInt();
			s.add(new Point(x,y));
		}
		System.out.println(s);
		// ���ͷ����� => HW!!!
	}

}
