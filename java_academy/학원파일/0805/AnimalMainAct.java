
class Animal{ // 부모클래스
	String name;
	Animal(){
		this("동물이름없음");
	}
	Animal(String name){
		this.name=name;
	}
	void speak() {
		System.out.println("울음소리");
	}
}
// 1.extends 2.speak()오버라이딩 3.생성자구현
class Puppy extends Animal{
	Puppy(String name){
		this.name=name;
	}
	void speak() { // 오버라이딩==재정의
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	Cat(String name){
		this.name=name;
	}
	void speak() { // 오버라이딩==재정의
		System.out.println("야옹");
	}
}

public class AnimalMainAct {

	public static void main(String[] args) {
		Cat c=new Cat("나르");
		c.speak();
	}

}








