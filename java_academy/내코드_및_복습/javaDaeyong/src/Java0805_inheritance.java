class Person{
	String name;
	Person() { // 자식 클랫에서 기본으로 호출하기 때문에 작성해야 한다.!
		System.out.println("부모 클래스의 기본 생성자");
	}
	Person(String name) {
		System.out.println("부모 클래스의 생성자");
		this.name = name;
	}
	void hello() {
		System.out.println("안녕하세요");
	}
}

class Student extends Person {
	Student(String name) { // 자식 클래스의 생성자보다 먼저 부모 상속을 실행한다. -> 그니까 부모 클래스의 기본 생성자가 먼저 호출되지.
		//super(); 생략된 것으로 봐도 된다. == 부모 클래스의 기본 생성자. 
		System.out.println("자식 클래스의 생성자");
		this.name = name;
	}
	String name;
	void study() {
		System.out.println("공부중");
	}
}

class Teacher extends Person {
	String name;
	void hello() {
		System.out.println("ㅎㅇ"); // 엥 근데 위에서 받은 hello는 안녕하세요였는데? -> 오버라이딩
	}
// 오버로딩 VS 오버라이딩
// 오버로딩은 상속관계가 아니다. 오버라이딩은 상속관계에서 발생한다.
// 둘 다 함부명이 동일할 때 발생한다.
// 오버로딩 : 생성자, println()
// 오버로딩 : 인자의 자료형 or 개수 다를때 
// 오버라이딩 : 인풋 완벽히 일치.
	void teach() {
		System.out.println("수업 시작");
	}
}


public class Java0805_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Student s = new Student("대용");
		Teacher t = new Teacher();
		p.hello();
		s.hello();
		t.hello();
		
		// 근데 이렇게 하려고 보니까, 선생, 학생 모두 hello()를 가지고 있으니까 굳이 따로 전부 설정해주기 귀찮잖아!!!
		// 부모 클래스 == 상위 클래스
		// 자식 클래스 == 하위 클래스
		// 상속을 받게되면, 부모 클래스의 것을 지워도 동작이 된다.
		// 상속과 같은 함수명을 쓰되, 다른 함수를 정의하고싶으면, [오버라이딩] == 재정의 를 이용한다.
		// 자식 클래스의 생성자를 호출하면, 부모클래스의 기본생성자가 호출된다.#########################
		// 자식클래스의 생성자보다 부모클래스가 먼저! 호출된다. ##################################
		// super(); 생략된 것으로 봐도 된다. == 부모 클래스의 기본 생성자. 
		
		// this : 자기자신객체. 
		// this.~ (이 객체 안에 들어있는 무언가.)
		// this() : 생성자
		//	vs
		// super : 부모클래스, 상위클래스. 
		// super.~ (이 객체 안에 들어있는 무언가.)
		// super() : 부모클래스의 생성자.
	}

}
