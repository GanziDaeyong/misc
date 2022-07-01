
// 상속
class Person{
	String name;
	Person(){
		// 자식클래스에서 기본으로 호출하기때문에 작성해야함!
		System.out.println("부모클래스의 기본생성자");
	}
	Person(String name){
		System.out.println("부모클래스의 생성자");
		this.name=name;
	}
	void hello() {
		System.out.println("안녕하세요!");
	}
}

// 부모클래스==상위클래스
// 자식클래스==하위클래스
class Student extends Person {
	Student(String name){
		//super(); // == 부모클래스의 기본생성자
		// 22번라인보다먼저 부모클래스의 기본생성자가 호출된다!!!
		System.out.println("자식클래스의 생성자");
		this.name=name;
	}
	void study() {
		System.out.println("공부중!!!!!!!");
	}
	void hello() { // 오버라이딩==재정의
		System.out.println("ㅎㅇ");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("수업시작합니다~^^");
	}
}

public class MainAct2 {

	public static void main(String[] args) {
		Person p=new Person();
		p.hello();
		Student s=new Student("학생이름");
		s.hello();
		s.study();
		Teacher t=new Teacher();
		// 자식클래스의 생성자를 호출하면,
		// 부모클래스의 기본생성자가 호출된다!
		// [자식클래스의 생성자보다 먼저]
		t.hello();
		t.teach();
	}

}



