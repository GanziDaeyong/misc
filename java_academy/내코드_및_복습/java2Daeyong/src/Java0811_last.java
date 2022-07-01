/*
class F {
	int a;
	int b;

	F(int a, int b){
		this.a = a;
		this.b = b;
	}
	boolean equals(F aclass) { // �̷������� �ϸ�, �������̵� Ư���� �ߺ�üũ�� ������ �����ϴ�.
		if (aclass.a==this.a && aclass.b == this.b) {
			return true;
		}
		return false;
	}
	
}
*/


class Point{
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	boolean equals(Point otherP) { // �̷������� �ϸ�, �������̵� Ư���� �ߺ�üũ�� ������ �����ϴ�.
		if (otherP.x==this.x && otherP.y == this.y) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}


public class Java0811_last {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		F c1 = new F(10,20);
//		F c2 = new F(100,200);
//		F c3 = new F(10,20);
//		if (c1 == c3) { // �񱳿����ڴ� int�� string�� �̿��ϴ°Ű�.
//			// ��ü�� �񱳴� .equals()�� ����Ѵ�.
//			// �ٵ� �̰� ��ġ�� ������ ���� �񱳴� �ƴϴ�. -> �������̵� ������! equals��.
//			
//			System.out.println("����");
//		}
//		else if (c1.equals(c3)) {
//			System.out.println("����2");
//		}
//	// equals -> �񱳸� ���� boolean�� ����Ѵ�. 
		
		Point p1 = new Point(1,4);
		Point p2 = new Point(2,5);
		Point p3 = new Point(1,4);
		
		if (p1.equals(p3)) {
			System.out.println("����");
		}
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
	

}
