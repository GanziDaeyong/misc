import java.util.Scanner;

class Person {
	void call(Animal a) {
		a.speak();
		
	}
}


class Animal{
	void speak() {
		System.out.println("울음소리");
	}
}

class Dog extends Animal {
	void speak() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal {
	void speak() {
	System.out.println("야옹");
	}
}

public class Java0810 {

	public static void main(String[] args) {
		Person p = new Person();
		Animal a1 = new Dog();
		Animal a2 = new Cat(); // 업캐스팅. Animal 틀을 보고 만들었지만, 실제 만든것은 Dog과 Cat이다
		a1.speak();
		a2.speak();
		
		// 틀을 보지만, 실제 수행 내용은 아래로 내려가서 하는 것은 업캐스팅한다고 한다.
		// 이를 동적 바인딩이라 한다. 이를 동적 바인딩이라 한다.
	}
	

}
