import java.util.Scanner;

class Circle{ // 클래스==기본단위==붕어빵틀
	String name;
	int radius;
	Circle(){ // 생성자 오버로딩
		System.out.println("확");
		// 기본 생성자==디폴트 생성자
	}
	Circle(String name,int radius) {
		System.out.println("인");
		this.name=name; // this==자기자신객체
		this.radius=radius;
	}
}

public class ClassMainAct {

	public static void main(String[] args) {
		
		// 객체==인스턴스==붕어빵을 만들어보자! => 인스턴스화==객체화
		Circle pizza=new Circle("피자",100);
		Circle donut=new Circle("도넛",20); // 1:N=클래스:객체
		//★생성자
		// 1. 함수
		// 2. 클래스와 이름이 동일함
		// 3. 클래스->객체 == 인스턴스화
		// 4. 기본 생성자==디폴트 생성자 는 최초에 제공된다.
		// 4-2. 생성자를 하나라도 정의하는 순간, 디폴트생성자 기본제공xxx
		// 4-3. 생성자 오버로딩
		// 5. this키워드
		pizza.name="피자";
		pizza.radius=100;
		System.out.println(pizza.name+" / "+pizza.radius);
		//donut.name="도넛";
		//donut.radius=20;
		System.out.println(donut.name+" / "+donut.radius);
		Scanner sc=new Scanner(System.in);
	}

}