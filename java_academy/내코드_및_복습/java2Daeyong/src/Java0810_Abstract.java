
abstract class Shape{ // 추상클래스 - 클래스들의 틀 == 붕어빵틀의 틀 -> 붕어빵 뽑는데에는 관심 전혀 없다.
	int point;
	int line;
	abstract void draw(); // [강제성]
				
		// [강제성] -> 자식 클래스에서 반드시 추상메서드를 [재정의]하세요.
		// 추상메서는 내용 구현 불가. 중괄호 쓰지 못한다.
		// 왜? 반드시 재정의하라고 고정해놓은 것이기 때문에 내용은 아래서 알아서 해.
		// 마찬가지로 아래서 재정의 안하면 역시 오류가 발생한다. 강제성!
		
}


class Circle extends Shape {
	void draw() {
		System.out.println("원 그리기");
	}
}
class Rect extends Shape {
	void draw() {
		System.out.println("네모 그리기");
	}
}
class Tri extends Shape {
	void draw() {
		System.out.println("세모 그리기");
	}
}






public class Java0810_Abstract {

	public static void main(String[] args) {
		//Shape s = new Shape();
		// 에러나는 이유 : 추상클래스로는 객체를 생성할 수 없기 때문이다. -> 반죽 없다.
		// abstract의 키워드는 강제성이다. 가이드라인이 되는 것이다. [강제성]
	}

}
