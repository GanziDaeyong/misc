//class Teach {
//	String name;
//	int time;
//	Teach(){
//		this("no class", 0);
//		// 과목없음 / 0
//	}
//	Teach(String name) {
//		// name / 2
//		this(name, 0);
//
//	}
//	Teach(String name, int time) {
//		this.name = name;
//		this.time = time;	
//	}
//}

class Animal {
	String name;
	Animal () {
	}
	Animal (String name) {
		this.name = name;
	}
	void speak() {
		System.out.println("울음소리");
	}
}

class Dog extends Animal {
	Dog(String name) {
		this.name = name;
	}
	void speak() {
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal {
	Cat(String name) {
		this.name = name;
	}
	void speak() {
		System.out.println("야옹");
	}
	
}


public class Java0805_inheritance_2 {

	public static void main(String[] args) {
//		Teach t1 = new Teach();
//		System.out.println(t1.name + ": " + t1.time + "시간");
//		Teach t2 = new Teach("C");
//		System.out.println(t2.name + ": " + t2.time + "시간");

// 연습문제
		Dog d1 = new Dog("참치");
		d1.speak();
		Cat c1 = new Cat("꽁치");
		c1.speak();
		
		
	}

}
