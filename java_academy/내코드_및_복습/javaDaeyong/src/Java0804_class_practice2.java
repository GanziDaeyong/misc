import java.util.Scanner;
import java.util.Arrays;
//class Book {
//	String name; // 멤버변수 == 필드 == 속성
//	String auth; // 멤버변수
//	Book(){ // 기본생성자
//		
//	}
//	Book (String name, String auth){//생상자명은 클래스명과 같아야한다. 
//		this.name = name; // 생성자 오버로딩
//		this.auth = auth;
//	}
//	void show() { // 멤버함수 == 메소드 == 메서드
//		System.out.println(this.name + "/" + this.auth);
//	}
//}

//class student {
//	String name;
//	String grade;
//	student() {
//	}
//	student (String n) {
//		n = name; // 왜 안되나? 대입연산자 방향때매 그렇다. 
//		//만약 name = n;으로 넣어주면 s2가 this로 연결되서 아래 show()에서 작동한다.
//	}
//	student(String name, String grade) {
//		this.name = name;
//		this.grade = grade;
//	}
//	void show() {
//		System.out.println("이름: " + this.name + "\t" + "학점: " + this.grade);
//	} //this를 쓰는 이유는 객체지향코딩. 주체마다 다를 것이기에..
//}

//class student2 {
//	String name;
//	int [] score; // 3개의 점수 입력
//	
//	student2(String name, int Kor, int Eng, int Cal) {
//		this.name = name;
//		this.score = new int [3]; // 배열 할당은 생성자에서.
//		this.score[0] = Kor; 
//		this.score[1] = Eng; 
//		this.score[2] = Cal; // 대입연산자 방향 조심!!
//		
//	}
//	void check() {
//		System.out.println(Arrays.toString(score));
//		double avg = (score[0] + score[1] + score[2]) / 3.0 ; 
//		System.out.println("평균은 " + avg + "점 입니다");
//	} //this를 쓰는 이유는 객체지향코딩. 주체마다 다를 것이기에..
//}

class vehicle {
	String ownername;
	String carname;
	double max_speed;
	double cur_speed;
	vehicle(String ownername, String carname, double max_speed) {
		this.ownername = ownername;
		this.carname = carname;
		this.max_speed = max_speed;
		this.cur_speed = 0;		
	}
	void show() {
		String msg = "현재" + this.ownername + "님의" + this.carname + "속도는" + this.cur_speed + "입니다." ;
		System.out.println(msg);
	}
	void speedup() {
		this.cur_speed += 20;
		System.out.println("속도가 20km/h 증가합니다.");
		
		if (this.cur_speed >= this.max_speed) {
			this.cur_speed = this.max_speed;
			System.out.println("최고속도입니다.");
		}
	}
	void speeddown() {
		this.cur_speed -= 20;
		System.out.println("속도가 20km/h 감소합니다.");
		if (this.cur_speed <= 0) {
			this.cur_speed = 0 ;
			System.out.println("정차했습니다.");
		}
	}
	
}


public class Java0804_class_practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
//		Book b1 = new Book(); // 앞 Book는 클래스, Book()는 생성자.
//		b1.name = "Harry Potter";
//		b1.auth = "J.K.Rolling";
//		Book b2 = new Book("위건 부두로 가는 길", "Jeorge Orwell");
//		b1.show();
//		b2.show(); // 다형성의 일종이다. 왜 이게 가능하냐? 함수에 주체가 생겼기 때문이다.

// 연습문제
//		student s1 = new student();
//		s1.name = "정대용";
//		s1.grade = "A-";
//		student s2 = new student("유지승"); 
//		s2.grade = "A0";
//		student s3 = new student("정서연", "A+");
//		s1.show();
//		s2.show();
//		s3.show();
		
		// 입력받는 코드도 추가하기 -> to blog. int -> line을 잡아주는
		// sc.nextLine(); 추가하는 것 주의!
		// 콘솔 -> 버퍼 -> 메모리 간 연산진행과정을 살펴보면 된다.
		
// 연습문제 2
		
//		System.out.println("이름을 입력하세요");
//		String name = sc.nextLine();
//		System.out.println("국어 점수를 입력하세요");
//		int Kor = sc.nextInt();
//		System.out.println("영어 점수를 입력하세요");
//		int Eng = sc.nextInt();
//		System.out.println("수학 점수를 입력하세요");
//		int Cal = sc.nextInt();
//		// 점수들을 배열에 넣고 클래스에서 배열 요소 하나씩 score [i] 와 맞춰줘도 된다.
//		
////		s4.score[0] = 100; 성적을 인자로 받지 않고 이런식으로 줘도 된다.
////		
//		student2 s4 = new student2(name, Kor, Eng, Cal);
//		s4.check();
	
// 연습문제 3
		// 자동차 - 현재속도, 최고속도, 차주, 스피드업() -> 속도 20증가 , 스피드다운() -> 속도 20감소, 현재상태보여주는 show() -> 현재 00님의 차량 속도는 __입니다.
		// 최고속도보다 빠를 수 없고, 0보다 느릴 수 없다.
		// 객체 car 하나 생성.
		

		String ownername = sc.nextLine();
		String carname = sc.nextLine();
		double max_speed = sc.nextDouble();
		
		vehicle car = new vehicle (ownername, carname, max_speed);		
		car.show();
		car.speedup();
		car.speedup();
		car.speedup();
		car.speedup();
		car.speedup();
		car.speedup();
	//car.speeddown();
		
		// for blog
		// 클래스에서 인자를 차주이름, 차이름, 최고속도만 받자. 차 속도는 받지 말고 그냥 0으로 두자. 클래서 내에서 cur_speed = 0으로.
		// 그런 다음 오직 speedup 과 down 만을 통해 속도를 제어하자.
		// -> 이게 좀 더 현실에 가까운 코딩이니까 이런 센스를 기르는게 중요하다.
	}
	

}
