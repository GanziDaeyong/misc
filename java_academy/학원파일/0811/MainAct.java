
class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	// 최상위클래스 Object의 equals()를 오버라이딩==재정의
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
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}
		if(p2.equals(p3)) { // ==
			// .equals()
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}
	}

}






