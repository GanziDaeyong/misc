
class Person2{
	String name;

	// 동물객체를 인자로 받는 함수
	// 다른 결과를 출력할수있도록 구현할예정
	void call(Animal a) { // 동물클래스를 부모로하는 자식클래스들을 인자로 줄 예정
		// 겉은 Animal, 속은 Dog/Cat
		a.speak(); // [동적바인딩]
		System.out.println("아~~~!!");
	}
	
	// 음식객체를 인자로 받는 함수
	// 메뉴출력
	void eat(Food f) {
		f.name();
		System.out.println("를(을) 먹습니다.");
	}
	
	void show() {
		System.out.println("사람클래스");
		System.out.println(this.name+"입니다.");
	}
}
class Student2 extends Person2{
	int score;
	void show() {
		System.out.println("학생클래스");
		System.out.println(this.name+"의 점수="+this.score);
	}
}

class Food{
	void name() {
		System.out.print("메뉴이름");
	}
}
class Menu1 extends Food{
	void name() { // 오버라이딩==재정의
		System.out.print("만두");
	}
}
class Menu2 extends Food{
	void name() {
		System.out.print("돈까스");
	}
}

class Animal{
	void speak() {
		System.out.print("동물이름");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.print("멍멍");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.print("야옹");
	}
}

public class CastMainAct {

	public static void main(String[] args) {
		
		// 형변환 -> 캐스팅
		
		Person2 c1=new Student2(); // 업 캐스팅
		c1.name="사람_붕어빵틀을보고 만들어낸 학생_붕어빵";
		//c1.score=100; -> xxx
		c1.show();
		
		/*
		-> 업 캐스팅된 객체를 되돌려놓을때에 사용
		Student2 c2=(Student2)new Person2(); // 다운 캐스팅
		c2.name="학생_붕어빵틀을보고 만들어낸 사람_붕어빵";
		c2.show();
		*/
		
		Person2 p=new Person2();
		Animal a1=new Dog(); // 업 캐스팅
		Animal a2=new Cat();
		p.call(a1);
		p.call(a2);
		
		Food m1=new Menu1(); // 업 캐스팅
		Food m2=new Menu2();
		p.eat(m1);
		p.eat(m2);
		
	}

}
// 









