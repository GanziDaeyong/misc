
class Person{
	void call(Animal a) { // 동적바인딩
		a.speak();
	}
}

class Animal{
	void speak() {
		System.out.println("울음소리");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.println("왈왈!");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.println("야옹~");
	}
}


public class MainAct {

	public static void main(String[] args) {
		// 다형성
		Person p = new Person();
		Animal a1=new Dog(); // 업 캐스팅
		Animal a2=new Cat();
		p.call(a1);
		p.call(a2);
	}

}









