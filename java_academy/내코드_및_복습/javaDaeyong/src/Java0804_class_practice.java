
class Circle { // 클래스 == 기본단위 == 붕어빵틀
	String name; // 이름
	int radius; // 크기
	Circle() {
		// 기본생성자 == 디폴트생성자
	}
	Circle(String name, int radius) {
		//name = n;
		//radius = r ; 
	
	//중요 @@@@@@@ 여기서 n 과 r 은 name과 radius로 하면 안된다.
	//왜 안되냐? 자바는 논리적으로 자신과 가까운 친구를 찾는 경향이 있다. name으로 인자를 받으면
	// 위에 클래스의 name까지 못가고, 바로 인자 name을 찾아버린다.
	// 그럼 어캐해야해! -> this.를 쓰자. 이게 파이썬의 self.이다. this == 자기자신객체
		this.name = name;
		this.radius = radius;
	// 그럼 가령 donut을 쓰고싶으면 donut.name, donut.radius가 되는 것이다. 
	// 오 드래그하면 링크되네. 신기신기.
	}
	// static.void ~~
	// static을 쓸 수 없다. static은 객체와 무관함을 의미하는데, 우리는 객체 구울꺼잖아.
	// 매우 중요 @@@@@@@@ 생성자 오버로딩 (인자없는 기본생성자와 인자 있는 내 생성자.) @@@@@@@@@@
}

public class Java0804_class_practice {

	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in); // 이미 java.util에 있던 걸 sc로 구운 것 뿐이다.
		// 객체 == 인스턴스 == 붕어빵을 만들어보자. 이것이 인스턴스화 == 객체화이다.
//		Circle pizza = new Circle(); // 피자가 붕어빵이다. 틀 하나면 여러개 된댔지?
//		Circle donut = new Circle(); // 1:n = 클래스:객체 = 붕어빵틀:붕어빵
//		pizza.name = "피자"; // .붙였을때 초록은 자바제공, 파란은 내가생성.
//		pizza.radius = 100;
//		System.out.println(pizza.name + " / " + pizza.radius);
//		donut.name = "도넛"; // .붙였을때 초록은 자바제공, 파란은 내가생성.
//		donut.radius = 100;
//		System.out.println(donut.name + " / " + donut.radius);
		// 클래스는 함수마냥 왔다갔다 하는 게 아니다. 공간이 형성되는 것으로 보면 된다.

/*		
Circle pizza = new Circle(); 여기서 Circle()는 뭐야? 함수 정의한 적 없잖아. Circle 은 클래스였잖아!
이런 얘들을 생성자라 한다.
생성자
1. 함수
2. 클래스와 이름이 동일하다.
3. 클래스로부터 객체를 생성하게 해준다. 반죽을 넣어서 구워주는, 인스턴스화를 담당한다.
4. 기본 생성자 == 디폴트 생성자 는 최초에 제공된다.
->붕어빵이 먹고싶었구나! 틀은 너가 준비하고, 반죽 구워주는건 내가 도와줄게. 
4.2. 생성자를 하나라도 스스로 정의하는 순간, 디폴트생성자는 사라진다. 기본제공 X
->유지하기 위해서는 기본생성도 정의해주면 된다. 위처ㅓㅁ.
*/
		
		Circle pizza = new Circle(); // 피자만들때는 기본생성자 @@@@@@@@
		Circle donut = new Circle("도넛", 200); // 도넛만들때는 내 생성 @@@@@@@
		pizza.name = "피자"; // .붙였을때 초록은 자바제공, 파란은 내가생성.
		pizza.radius = 100;
		System.out.println(pizza.name + " / " + pizza.radius);
		System.out.println(donut.name + " / " + donut.radius);
		
		// 여기서 기본생성자는 마치 먼저 굽고 나중에 팥을 넣어주는 느낌.
		// 내 생성자는 첨부터 팥을 인자로 받아 구울때부터 팥을 넣어준다.
	}

}
