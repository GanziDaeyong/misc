
abstract class Shape{ // 추상클래스 : 클래스들의 틀 == 붕어빵틀의 틀
	int point;
	int line;
	abstract void draw(); // {} 내용을 구현해놓을수없다!
	// [강제성] => 자식클래스에서 "반드시" 추상메서드를 [재정의]하세요!
}

class Circle extends Shape {
	void draw() {
		System.out.println("원 그리기");
	}
}
class Rect extends Shape {

	@Override
	void draw() {
		System.out.println("네모 그리기");
	}
	
}
class Tri extends Shape {

	@Override
	void draw() {
		System.out.println("세모 그리기");
	}
	
}

public class AbstractMainAct {

	public static void main(String[] args) {
		//Shape s = new Shape(); xxx
		// : 추상클래스로는 객체를 생성할수없습니다!
	}

}






