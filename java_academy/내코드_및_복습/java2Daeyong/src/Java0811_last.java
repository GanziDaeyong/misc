/*
class F {
	int a;
	int b;

	F(int a, int b){
		this.a = a;
		this.b = b;
	}
	boolean equals(F aclass) { // 이런식으로 하면, 오버라이딩 특성상 중복체크에 굉장히 유리하다.
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
	
	boolean equals(Point otherP) { // 이런식으로 하면, 오버라이딩 특성상 중복체크에 굉장히 유리하다.
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
//		if (c1 == c3) { // 비교연산자는 int나 string을 이용하는거고.
//			// 객체의 비교는 .equals()를 사용한다.
//			// 근데 이건 위치의 비교이지 값의 비교는 아니다. -> 오버라이드 해주자! equals를.
//			
//			System.out.println("같다");
//		}
//		else if (c1.equals(c3)) {
//			System.out.println("같다2");
//		}
//	// equals -> 비교를 통해 boolean을 출력한다. 
		
		Point p1 = new Point(1,4);
		Point p2 = new Point(2,5);
		Point p3 = new Point(1,4);
		
		if (p1.equals(p3)) {
			System.out.println("오옝");
		}
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
	

}
