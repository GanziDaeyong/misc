/////////////////////////////////다형성//////////////////////////////////////

//class prsn {
//	String name;
//	void show() {
//		System.out.println("사람클래스");
//		System.out.println(this.name + "입니다.");
//	}
//	
//	// 동물객체를 인자로 받는 함수.
//	// 다른 결과를 출력할 수 있도록 구현할 예정이다.
//	
//	}
//}

//class stdnt extends prsn {
//	int score;
//	void show() {
//		System.out.println("학생클래스");
//		System.out.println(this.name + "의 점수 = " + this.score);
//	}
//}

////////////////////////연습문제////////////////////////////////////////////////////////////
//// 클래스 내 함수에서 다른 클래스 가져올 수 있구나.. Animal a 처럼.
//class Animal {
//		void call(Animal a) { // 동물클래스를 부모로하는 자식클래스들을 인자로 줄 예정
//		// 겉은 animal, 속은 dog/cat
//		a.speak();
//		System.out.println("아~");
//	void speak() {
//		System.out.println("동물 이름");
//	}
//}
//class Dog extends Animal {
//	void speak() {
//		System.out.println("멍멍");
//	}
//}
//class Cat extends Animal {
//	void speak() {
//		System.out.println("냐옹");
//	}
//}
//

///////////////////////////////////////////연습문제//////////////////////////////////////////////

class fd {
	void eat(Food f) {
		f.name();
		System.out.println("을(를) 먹습니다");
	}
}
class Food {
	void name() {
		System.out.println("음식");
	}
}

class chicken extends Food {
	void name() {
		System.out.print("치킨");
	}
}


public class Java0806_cast_main_act {

	public static void main(String[] args) {		
		
//		// 자료형의 형 변환이 클래스 수준으로 올라가면 캐스팅이 되는 것이다.
//		prsn c1 = new stdnt(); // 내가 본 틀은 prsn이기 때문에 비록 나온 것은 학생이더라도 stdnt의 멤버변수 score을 불러올 수 없다.
//		// 이런것을 보고 업 캐스팅이라 한다. 
//		c1.name = "사람_붕어빵틀을 보고 만들어낸 학생_붕어빵";
////		c1.score = 100; -> 이거 안된다.
//		c1.show();
//		
//		stdnt c2 = (stdnt) new prsn(); // 다운캐스팅은 그냥 해주면 안된다. 강제 형변환마먕 해줘야 한다. // int i = (int) 3.14 강제 형변환 처럼.
//		c2.name = "학생_붕어빵틀을 보고 만들어낸 사람_붕어빵";
//		c2.score = 100; // 얜 이게 되긴 하겠지 학생_붕어빵을 봤으니. 
//		// 그런데!! 번역 과정에서만 가능한거지, 실제로 작동하진 않는다. 클래스 인자가 다르게 받아지니까.
//		// 그럼 이걸 어디 쓰냐? 업 캐스팅된 객체를 돌려놓을 때에 사용할 뿐이다.
		
//연습문제 업캐스팅////////////////////////중요///////////////////////////////////////////////////////////////
//		prsn p = new prsn();
//		Animal a1 = new Dog(); // 업캐스팅
//		Animal a2 = new Cat(); // 업캐스팅
//		
//		// 업캐스팅을 이용하여 이름에 아~ 붙이는 것이다. 위에서 animal을 호출한 후 a.speak() 호출 후,  ~아 를 붙였다.
//		// a.speak()를 찾아가는데, 업캐스팅 되어있기 때문에 밑으로 내려가 Dog의 오버라이딩 된 함수를 실행하고 아~가 붙는 거지.
//		// 이를 동적 바인딩이라 한다. 
//		
		fd f = new fd();
		Food m1 = new chicken();
		f.eat(m1);
		
	}

}
