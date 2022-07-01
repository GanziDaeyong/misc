
class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	// �ֻ���Ŭ���� Object�� equals()�� �������̵�==������
	boolean equals(Point p) {
		if(p.x==this.x && p.y==this.y) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
}
public class MainAct {

	public static void main(String[] args) {
		Point p1=new Point(1,2);
		Point p2=new Point(2,3);
		Point p3=new Point(2,3);
		System.out.println(p1);
		if(p1.equals(p3)) { // ==
			// .equals()
			System.out.println("����.");
		}
		else {
			System.out.println("�ٸ���.");
		}
		if(p2.equals(p3)) { // ==
			// .equals()
			System.out.println("����.");
		}
		else {
			System.out.println("�ٸ���.");
		}
	}

}






